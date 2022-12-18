package ru.rsreu.nis.servlet;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class SessionRequestContent {
    private Map<String, Object> requestAttributes;
    private Map<String, String[]> requestParameters;
    private Map<String, Object> sessionAttributes;

    public void extractValues(HttpServletRequest request) {

    }

    public void insertAttributes(HttpServletRequest request) {

    }

}
