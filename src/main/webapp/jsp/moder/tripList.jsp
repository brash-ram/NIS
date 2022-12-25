<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Информация о поездках</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="tripList">
    <div class="tripList-container">
        <div class="tripList-inner">
            <div class="table-title title">Список поездок</div>
            <br>
            <table class="table">
                <thead>
                <tr>
                    <th>Начальная точка</th>
                    <th>Конечная точка</th>
                    <th>Дата поездки</th>
                    <th>Цена поездки, руб.</th>
                    <th>Статус поездки</th>
                    <th>Водитель</th>
                    <th>Действие</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="trip" items="${trips}">
                    <tr>
                        <td>${trip.getStartPoint()}</td>
                        <td>${trip.getFinalPoint()}</td>
                        <td>${trip.getTripDate()}</td>
                        <td>${trip.getPrice()}</td>
                        <td>${trip.getTripStatus().getRussianName()}</td>
                        <td></td>
                        <td>
                            <div class="w-full flex items-center justify-center space-x-2">
                                <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="deleteTrip(${trip.tripId})">
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
