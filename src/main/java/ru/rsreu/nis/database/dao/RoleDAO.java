package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.data.Role;

import java.util.List;

public interface RoleDAO {
        List<Role> findAll();
        Role getRoleById(int id);
        Role getRoleById(String id);
}
