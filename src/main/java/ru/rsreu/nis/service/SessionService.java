package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.SessionDAO;
import ru.rsreu.nis.dto.UserListResponseDTO;
import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.Roles;
import ru.rsreu.nis.entity.enums.SessionStatus;
import ru.rsreu.nis.entity.enums.UserStatus;
import ru.rsreu.nis.utils.SessionUtil;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

        Timestamp activeUntil = new Timestamp(System.currentTimeMillis() + SESSION_TIME_LIVE);
        Optional<Session> optionalSession = sessionDAO.findByUserId(user.getUserId());
        Session session = optionalSession.isPresent() ?
                optionalSession.get().setActiveUntil(activeUntil) :
                new Session(user, activeUntil);
//                optionalSession.orElseGet(() -> new Session(user, activeUntil));

        if (!optionalSession.isPresent()) {
            sessionDAO.save(session);
        } else {
            sessionDAO.update(session);
        }

        return user;
    }

    public List<Session> getAllSessions() {
        return sessionDAO.findAll();
    }

    public List<UserListResponseDTO> getAllUserList(User user) {
        List<Session> sessions = this.getAllSessions();
        return sessions.stream().filter(session -> !session.getUser().getUserRole().equals(Roles.ADMIN))
                .map(session -> new UserListResponseDTO(
                session.getSession_id(),
                session.getUser(),
                session.getActiveUntil(),
                session.getActiveUntil() != null && SessionUtil.checkValid(session) ?
                SessionStatus.AUTHORIZED : SessionStatus.NOT_AUTHORIZED
    )).filter(userListResponseDTO -> !userListResponseDTO.getUser().getUserId().equals(user.getUserId()))
                .collect(Collectors.toList());
    }
    public List<Session> getAllSessionsByUserStatus(String userStatus) {
        return sessionDAO.findAll();
    }

}
