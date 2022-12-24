package ru.rsreu.nis.database;

import ru.rsreu.nis.database.dao.RequestDAO;
import ru.rsreu.nis.database.dao.SessionDAO;
import ru.rsreu.nis.database.dao.TripDAO;
import ru.rsreu.nis.database.dao.UserDAO;
import ru.rsreu.nis.database.impl.RequestDAOImpl;
import ru.rsreu.nis.database.impl.SessionDAOImpl;
import ru.rsreu.nis.database.impl.TripDAOImpl;
import ru.rsreu.nis.database.impl.UserDAOImpl;

public class DAOFactory {
    public static UserDAO getUserDAO() {return UserDAOImpl.getInstance();}
    public static SessionDAO getSessionDAO() {return SessionDAOImpl.getInstance();}
    public static TripDAO getTripDAO() {return TripDAOImpl.getInstance();}
    public static RequestDAO getRequestDAO() {return RequestDAOImpl.getInstance();}
}
