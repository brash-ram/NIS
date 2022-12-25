<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ru.rsreu.nis.entity.enums.Roles" %>
<%@ page import="ru.rsreu.nis.entity.enums.UserStatus" %>
<html>
<head>
    <title>Список пользователей</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css"/>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"/>
    <style>
        <%@include file="/css/style.css" %>
    </style>
    <script
            src="https://code.jquery.com/jquery-3.6.3.min.js"
            integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
            crossorigin="anonymous">
    </script>
</head>
<body>
<div class="userList">
    <div class="userList-container px-5">
        <div class="userList-inner">
            <div class="userList-title title">Список пользователей</div>
            <br>
            <table class="table">
                <thead>
                <tr>
                    <th>Фамилия</th>
                    <th>Имя</th>
                    <th>Оценка</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="request" items="${requests}">
                    <tr>
                        <td>${request.passenger.getLastName()}</td>
                        <td>${request.passenger.getFirstName()}</td>
                        <td>
                            <form class="some_form" name = "SelectMarkForm">
                                <input type="hidden" name="trip_id" value="${trip_id}"/>
                                <input type="hidden" name="user_id" value="${request.passenger.userId}"/>
                                <select id="selectDriverMark" name="mark">
                                    <c:forEach var="mark" items="${marks}">
                                        <c:if test="${request.trip.tripId.equals(mark.trip.tripId)}">
                                            <option></option>
                                            <c:forEach var="all_mark" items="${all_marks}">
                                                <c:if test="${all_mark.equals(mark.mark)}">
                                                    <option value="${all_mark}" selected>${all_mark}</option>
                                                </c:if>
                                                <c:if test="${!all_mark.equals(mark.mark)}">
                                                    <option value="${all_mark}">${all_mark}</option>
                                                </c:if>
                                            </c:forEach>
                                        </c:if>
                                    </c:forEach>
                                </select>
                                <button class="submit">Оценить</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>
</body>
</html>
