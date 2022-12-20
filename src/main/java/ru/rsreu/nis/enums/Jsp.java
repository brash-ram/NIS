package ru.rsreu.nis.enums;

public enum Jsp {
    LOGIN("/jsp/login.jsp"),

    ADMIN_PANEL("/jsp/admin_panel.jsp"),
    ADMIN_PANEL_TABLE("/jsp/admin-panel/table.jsp"),

    USER_PANEL("/jsp/user_panel.jsp"),
    USER_PANEL_THING("/jsp/user-panel/thing.jsp"),
    USER_PANEL_EXCHANGE("/jsp/user-panel/exchange.jsp"),
    USER_PANEL_ITEMS("/jsp/user-panel/my_things_table.jsp"),
    USER_PANEL_EXCHANGE_ITEMS("/jsp/user-panel/exchange_things_table.jsp"),
    USER_PANEL_MY_EXCHANGE_ITEMS("/jsp/user-panel/my_exchange_things_table.jsp"),

    MODERATOR_PANEL_ITEMS_TABLE("/jsp/moderator-panel/things-table.jsp"),
    MODERATOR_PANEL_EXCHANGE_REQUESTS_TABLE("/jsp/moderator-panel/exchange-requests-table.jsp"),
    MODERATOR_PANEL("/jsp/moderator_panel.jsp"),

    NOT_FOUND("/jsp/404.jsp"),

    REDIRECT("/templates/redirect.jsp");

    private final String route;

    Jsp(String route) {
        this.route = route;
    }

    public String getRoute() {
        return this.route;
    }
}
