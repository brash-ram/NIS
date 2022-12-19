package ru.rsreu.nis.utils;

import ru.rsreu.nis.entity.Session;

import java.util.Date;

public class SessionUtil {
    private SessionUtil() {
    }

    public static boolean checkValid(Session session) {
        Date currentDate = new Date();
        Date sessionExpiredDate = session.getActiveUntil();

        return sessionExpiredDate.after(currentDate);
    }
}
