package ru.rsreu.nis.database;

import ru.rsreu.nis.database.dao.*;
import ru.rsreu.nis.database.impl.*;

public class DAOFactory {
    public static UserDAO getUserDAO() {return UserDAOImpl.getInstance();}
    public static SessionDAO getSessionDAO() {return SessionDAOImpl.getInstance();}
    public static TripDAO getTripDAO() {return TripDAOImpl.getInstance();}
    public static RequestDAO getRequestDAO() {return RequestDAOImpl.getInstance();}
    public static MarkDAO getMarkDAO() {return MarkDAOImpl.getInstance();}
}
