package ru.rsreu.nis.logic;

public class LoginLogic {
    private static final String DRIVER_LOGIN = "driver";
    private static final String DRIVER_PASS = "0000";

    private static final String PASSENGER_LOGIN = "passenger";
    private static final String PASSENGER_PASS = "0000";

    public static boolean checkLogin(String enterLogin, String enterPass) {
        return DRIVER_LOGIN.equals(enterLogin) && DRIVER_PASS.equals(enterPass)
                || PASSENGER_LOGIN.equals(enterLogin) && PASSENGER_PASS.equals(enterPass);
    }
}

