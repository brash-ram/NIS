package ru.rsreu.nis.utils;

import ru.rsreu.nis.entity.Session;

import java.sql.Timestamp;
import java.util.Date;

import static ru.rsreu.nis.constant.GlobalOptions.SESSION_TIME_LIVE;

public class SessionUtil {
    private SessionUtil() {
    }

    public static boolean checkValid(Session session) {
        Timestamp currentDate = new Timestamp(System.currentTimeMillis());
        Timestamp sessionExpiredDate = session.getActiveUntil();

        return sessionExpiredDate.after(currentDate);
    }
}
