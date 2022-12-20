package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.entity.Mark;

import java.util.List;

public interface MarkDAO {
    List<Mark> findAll();
    Mark getMarkById(Integer id);
    Mark getMarkById(String id);
    void updateMark(Mark mark);
    void deleteMark(Mark mark);
    void createMark(Mark mark);
}
