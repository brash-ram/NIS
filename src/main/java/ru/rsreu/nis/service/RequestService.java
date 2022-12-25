package ru.rsreu.nis.service;

import lombok.RequiredArgsConstructor;
import ru.rsreu.nis.database.DAOFactory;
import ru.rsreu.nis.database.dao.RequestDAO;
import ru.rsreu.nis.database.dao.SessionDAO;
import ru.rsreu.nis.entity.Request;

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

    public List<Request> getAllRequestsByDriver(Integer driverId) {
        return requestDAO.findAllByDriver(driverId);
    }
    public List<Request> getAllRequestsByPassenger(Integer passengerId) {
        return requestDAO.findAllByPassenger(passengerId);
    }

    public void deleteRequest(Integer requestId) {
        requestDAO.delete(requestId);
    }

    public void createRequest(Request request) {
        requestDAO.save(request);
    }
}
