package ru.rsreu.nis.database.dao;

import ru.rsreu.nis.data.Mark;
import ru.rsreu.nis.data.Trip;

import java.util.List;

public interface MarkDAO {
    List<Mark> findAll();
    Mark getMarkById(int id);
    Mark getMarkById(String id);
    void updateMark(Mark mark);
    void deleteMark(Mark mark);
    void createMark(Mark mark);
}
