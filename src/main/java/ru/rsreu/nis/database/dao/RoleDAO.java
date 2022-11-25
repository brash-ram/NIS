package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Role;

import java.util.List;

public interface RoleDAO {
        List<Role> findAll();
        Role getRoleById(Long id);
        Role getRoleById(String id);
}
