package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.MarkDAO;
import ru.rsreu.nis.database.dao.TripDAO;
import ru.rsreu.nis.entity.Mark;
import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.entity.Trip;
import ru.rsreu.nis.entity.User;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MarkService {
    private static MarkService instance;
    private final MarkDAO markDAO;
    private final TripDAO tripDAO;

    public static MarkService getInstance() {
        synchronized (MarkService.class) {
            if (instance == null) {
                instance = new MarkService(DAOFactory.getMarkDAO(), DAOFactory.getTripDAO());
            }
        }
        return instance;
    }

    public List<Integer> getAllMarks() {
        return List.of(1, 2, 3, 4, 5);
    }

    public List<Mark> getMarksByFromUserAndTrip(List<Request> requests, Integer fromUser) {
        List<Mark> marks = new ArrayList<>();
        for (Request request : requests) {
            Mark mark = markDAO.findMarkByTripAndFromUser(request.getTrip().getTripId(), fromUser);
            if (mark == null) {
                marks.add(new Mark(null, request.getTrip()));
            } else {
                marks.add(mark);
            }
        }
        return marks;
    }

    public void createMark(String newMark, Integer tripId, User fromUser) {
        Trip trip = tripDAO.findTripById(tripId);
        Mark mark = markDAO.findMarkByTripAndFromUser(tripId, fromUser.getUserId());
        if (mark != null && newMark == null) {
            markDAO.delete(mark.getMarkId());
        } else if (mark != null) {
            markDAO.update(mark.setMark(Integer.valueOf(newMark)));
        } else {
            markDAO.save(new Mark(fromUser, trip.getDriverId(), Integer.valueOf(newMark), trip));
        }

//        if (mark != null) {
//            if (newMark == null) {
//                markDAO.delete(mark.getMarkId());
//            } else {
//                markDAO.update(mark.setMark(Integer.valueOf(newMark)));
//            }
//        } else {
//            if (newMark != null) {
//                markDAO.save(new Mark(fromUser, trip.getDriverId(), Integer.valueOf(newMark), trip));
//            }
//        }
    }
}
