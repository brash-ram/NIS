package ru.rsreu.nis.service;

public class ServiceFactory {

    public static SessionService getSessionService() {return SessionService.getInstance();}
    public static UserService getUserService() {return UserService.getInstance();}
    public static TripService getTripService() {return TripService.getInstance();}

    public static RequestService getRequestService() {return RequestService.getInstance();}
}
