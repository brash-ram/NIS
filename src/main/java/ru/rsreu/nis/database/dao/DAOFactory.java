package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.database.DatabaseType;

public abstract class DAOFactory {
    public static DAOFactory getInstance(DatabaseType type) {
        return type.getDAOFactory();
    }

    public abstract UserDAO getUserDAO();
}
