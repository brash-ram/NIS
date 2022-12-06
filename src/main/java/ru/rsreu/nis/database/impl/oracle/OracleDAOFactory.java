package ru.rsreu.nis.database.impl.oracle;

import ru.rsreu.nis.database.dao.DAOFactory;
import ru.rsreu.nis.database.dao.UserDAO;

public class OracleDAOFactory extends DAOFactory {

    private static volatile OracleDAOFactory instance;
    private OracleUserDAO oracleUserDAO;

    private OracleDAOFactory() {

    }

    public static OracleDAOFactory getInstance() {
        if (instance == null) {
            synchronized (OracleDAOFactory.class) {
                instance = new OracleDAOFactory();
            }
        }
        return instance;
    }

    @Override
    public UserDAO getUserDAO() {
        if (oracleUserDAO == null) {
            synchronized (OracleUserDAO.class) {
                oracleUserDAO = new OracleUserDAO();
            }
        }
        return oracleUserDAO;
    }
}
