package ru.rsreu.nis.database.dao;

public interface DatabaseDAO {
    void clearDatabase();
    void createTables();
    void inputStartData();
}
