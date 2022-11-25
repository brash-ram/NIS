package ru.rsreu.nis.database.impl.oracle;

import ru.rsreu.nis.database.dao.DAOFactory;

public class OracleDAOFactory extends DAOFactory {

    private static volatile OracleDAOFactory instance;

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

}
