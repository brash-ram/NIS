package ru.rsreu.nis.database;

import ru.rsreu.nis.resourcer.ProjectResourcer;
import ru.rsreu.nis.resourcer.Resourcer;

import java.sql.Connection;

public abstract class AbstractDAO {
    protected Resourcer resourcer;
    protected Connection connection;

    public AbstractDAO() {
        this.resourcer = ProjectResourcer.getInstance();
        this.connection = ConnectionPool.getConnection();
    }
}
