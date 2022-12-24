<%@ page import="ru.rsreu.nis.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Информация о пользователе</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css"/>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"/>
    <style>
        <%@include file="../css/style.css" %>
    </style>
</head>
<body>

<div class="userInfo">
    <div class="container">
        <div class="userInfo-inner">
            <div class="userInfo-title title">Просмотр информации о пользователе</div>
            <br>
            <div class="userInfo-lastname">
                <div class="userInfo-lastname-title">Фамилия</div>
                <input readonly id="lastname" name="lastname" value="${user.getLastname}" class="userInfo-lastname-input">
            </div>
            <br>
            <div class="userInfo-firstname">
                <div class="userInfo-firstname-title">Имя</div>
                <input readonly id="firstname" name="firstname" value="${user.getFirstname}" class="userInfo-firstname-input">
            </div>
            <br>
            <div class="userInfo-avgMark">
                <div class="userInfo-avgMark-title">Средняя оценка</div>
                <input readonly id="avgMark" name="avgMark" value="${user.getAvgMark}" class="userInfo-avgMark-input">
            </div>
        </div>
    </div>
</div>

<%--<div class="tripRequests">--%>
<%--    <div class="tripRequests-container">--%>
<%--        <div class="tripRequests-inner">--%>
<%--            <div class="table-title title">Информация о пользователе</div>--%>
<%--            <br>--%>
<%--            <table class="table">--%>
<%--                <thead>--%>
<%--                <tr>--%>
<%--                    <th>Фамилия</th>--%>
<%--                    <th>Имя</th>--%>
<%--                    <th>Средняя оценка</th>--%>
<%--                </tr>--%>
<%--                </thead>--%>
<%--                <tbody>--%>
<%--                <c:forEach var="user" items="${users}">--%>
<%--                    <tr>--%>
<%--                        <td>${user.lastName}</td>--%>
<%--                        <td>${user.firstName}</td>--%>
<%--                        <td>Cредняя оценка</td>--%>
<%--                    </tr>--%>
<%--                </c:forEach>--%>
<%--                </tbody>--%>
<%--            </table>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--</div>--%>
</body>
</html>

