<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Список заявок</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="requestList">
    <div class="requestList-container">
        <div class="requestList-inner">
            <div class="table-title title">Список заявок</div>
            <br>
            <table class="table">
                <thead>
                <tr>
                    <th>Начальная точка</th>
                    <th>Конечная точка</th>
                    <th>Дата поездки</th>
                    <th>Цена поездки, руб.</th>
                    <th>Статус поездки</th>
                    <th>Пассажир</th>
                    <th>Статус заявки</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="request" items="${requests}">
                    <tr>
                        <td>${request.getTrip().getStartPoint()}</td>
                        <td>${request.getTrip().getFinalPoint()}</td>
                        <td>${request.getTrip().getTripDate()}</td>
                        <td>${request.getTrip().getTripStatus}</td>
                        <td><a href="/nis/userInfo">Информация о пассажире</a></td>
                        <td>${request.getRequestStatus()}</td>
                        <td>
                            <div class="w-full flex items-center justify-center space-x-2">
                                <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="">
                                    <span class="material-symbols-outlined">delete</span>
                                </button>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</div>
</body>
</html>
