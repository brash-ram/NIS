package ru.rsreu.nis.filter;

import ru.rsreu.nis.entity.Session;
import ru.rsreu.nis.enums.Route;
import ru.rsreu.nis.service.ServiceFactory;
import ru.rsreu.nis.service.SessionService;
import ru.rsreu.nis.utils.SessionUtil;
import ru.rsreu.nis.utils.UserUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class AuthFilter implements Filter {
    private SessionService sessionService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        sessionService = ServiceFactory.getSessionService();
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String path = request.getPathInfo();

        if (path.equals(Route.NOT_FOUND.getRelative())) {
            filterChain.doFilter(request, response);
            return;
        }

        Optional<Integer> userId = UserUtil.getUserIdFromCookies(request.getCookies());
        Optional<Session> session = userId.isPresent()
                ? sessionService.getSession(userId.get())
                : Optional.empty();

        if (!session.isPresent() || !SessionUtil.checkValid(session.get())) {
            if (path.equals(Route.LOGIN.getRelative())) {
                filterChain.doFilter(request, response);
                return;
            }

            response.sendRedirect(Route.LOGIN.getAbsolute());
            return;
        }

        filterChain.doFilter(request, response);
    }
}
