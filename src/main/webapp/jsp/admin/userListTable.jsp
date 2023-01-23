<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ru.rsreu.nis.entity.enums.Roles" %>
<%@ page import="ru.rsreu.nis.entity.enums.UserStatus" %>
<head>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"/>
</head>
<table class="table">
    <thead>
    <tr>
        <th>Фамилия</th>
        <th>Имя</th>
        <th>Статус</th>
        <th>Роль в системе</th>
        <th>Авторизован</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="session" items="${sessions}">
        <tr>
            <td>${session.getUser().getLastName()}</td>
            <td>${session.getUser().getFirstName()}</td>
            <td>${session.getUser().userStatus.getRussianName()}</td>
            <td>${session.getUser().userRole.getRussianName()}</td>
            <td>${session.status.getRussianName()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>