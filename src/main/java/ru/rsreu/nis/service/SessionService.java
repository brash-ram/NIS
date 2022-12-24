package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.SessionDAO;
import ru.rsreu.nis.database.impl.SessionDAOImpl;
import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.UserStatus;

import java.util.Date;
import java.util.Optional;

import static ru.rsreu.nis.constant.GlobalOptions.SESSION_TIME_LIVE;

@RequiredArgsConstructor
public class SessionService {
    private static SessionService instance;
    private final SessionDAO sessionDAO;
    private final UserService userService;
    public static SessionService getInstance() {
        synchronized (SessionService.class) {
            if (instance == null) {
                instance = new SessionService(DAOFactory.getSessionDAO(), ServiceFactory.getUserService());
            }
        }
        return instance;
    }

    public Optional<Session> getSession(Integer userId) {
        return sessionDAO.findByUserId(userId);
    }

    public User createSession(String login, String password) throws Exception {
        User user = userService.getUser(login);

        if (user.getUserStatus().equals(UserStatus.BLOCKED) || !user.getPassword().equals(password)) {
            throw new Exception("Not user");
        }

        Date activeUntil = new Date(System.currentTimeMillis() + SESSION_TIME_LIVE);
        Optional<Session> optionalSession = sessionDAO.findByUserId(user.getUserId());
        Session session = optionalSession.isPresent() ?
                optionalSession.get().setActiveUntil(activeUntil) :
                new Session(user, activeUntil);
//                optionalSession.orElseGet(() -> new Session(user, activeUntil));

        if (!optionalSession.isPresent()) {
            sessionDAO.save(session);
        }

        return user;
    }
}
