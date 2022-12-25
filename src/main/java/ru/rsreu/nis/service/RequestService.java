package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.RequestDAO;
import ru.rsreu.nis.entity.Request;
import ru.rsreu.nis.entity.enums.TripStatus;

import java.util.List;

@RequiredArgsConstructor
public class RequestService {
    private static RequestService instance;
    private final RequestDAO requestDAO;

    public static RequestService getInstance() {
        synchronized (RequestService.class) {
            if (instance == null) {
                instance = new RequestService(DAOFactory.getRequestDAO());
            }
        }
        return instance;
    }

    public List<Request> getAllRequests() {
        return requestDAO.findAll();
    }

    public Request getRequest(Integer requestId) {return requestDAO.findById(requestId);}

    public List<Request> getAllRequestsByDriver(Integer driverId) {
        return requestDAO.findAllByDriver(driverId);
    }

    public void deleteRequest(Integer requestId) {
        requestDAO.delete(requestId);
    }

    public void updateRequest(Request request) {
        requestDAO.update(request);
    }

    public void createRequest(Request request) {
        requestDAO.save(request);
    }

    public List<Request> getAllRequestsByPassengerActive(Integer passengerId) {
        return requestDAO.findAllByPassengerAndTripStatus(passengerId, TripStatus.IN_WAITING);
    }

    public List<Request> getAllRequestsByPassengerHistory(Integer passengerId) {
        return requestDAO.findAllByPassengerAndTripStatus(passengerId, TripStatus.COMPLETED);
    }
}
