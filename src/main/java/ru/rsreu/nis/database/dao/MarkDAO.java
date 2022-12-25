package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Mark;

import java.util.List;

public interface MarkDAO {
    List<Mark> findAll();
    List<Mark> findAllByToUser(Integer toUserId);
    Mark findMarkById(Integer id);
    Mark findMarkByTripAndFromUser(Integer tripId, Integer fromUser);
    void update(Mark mark);
    void delete(Integer markId);
    void save(Mark mark);
}
