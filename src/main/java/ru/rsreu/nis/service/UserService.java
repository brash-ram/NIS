package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.dto.UserInfoDTO;
import ru.rsreu.nis.entity.User;
import ru.rsreu.nis.entity.enums.UserStatus;

import java.util.List;

@RequiredArgsConstructor
public class UserService {
    private static UserService instance;
    private final UserDAO userDAO;
    private final MarkService markService;

    public static UserService getInstance() {
        synchronized (UserService.class) {
            if (instance == null) {
                instance = new UserService(DAOFactory.getUserDAO(), ServiceFactory.getMarkService());
            }
        }
        return instance;
    }

    public User getUser(String login) {
        return userDAO.findUserByLogin(login);
    }

    public User getUser(Integer id) {
        return userDAO.findUserById(id);
    }

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    public void save(User user) {
        userDAO.save(user);
    }

    public void updateUser(User user) {
        userDAO.update(user);
    }

    public void blockUser(Integer userId) {
        User user = this.getUser(userId);
        this.updateUser(user.setUserStatus(UserStatus.BLOCKED));
    }

    public UserInfoDTO createUserInfo(Integer userId) {
        User user = userDAO.findUserById(userId);
        return new UserInfoDTO(user.getFirstName(), user.getLastName(), markService.calculateAverageMark(userId));
    }

    public void unblockUser(Integer userId) {
        User user = this.getUser(userId);
        this.updateUser(user.setUserStatus(UserStatus.NOT_BLOCKED));
    }
}
