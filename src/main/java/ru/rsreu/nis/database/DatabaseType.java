package ru.rsreu.nis.database;

import ru.rsreu.nis.database.dao.DAOFactory;
import ru.rsreu.nis.database.impl.oracle.OracleDAOFactory;

public enum DatabaseType {

    ORACLE {
        @Override
        public DAOFactory getDAOFactory() {
            return OracleDAOFactory.getInstance();
        }

    };

    public abstract DAOFactory getDAOFactory();

}
