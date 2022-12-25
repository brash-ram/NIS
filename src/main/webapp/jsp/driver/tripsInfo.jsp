<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Информация о поездках</title>
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="tripsInfo">
<div class="tripsInfo-container">
    <div class="tripsInfo-inner">
        <div class="table-title title">Информация о поездках</div><br>
        <table class="table">
            <thead>
            <tr>
                <th>Начальная точка</th>
                <th>Конечная точка</th>
                <th>Дата поездки</th>
                <th>Цена поездки, руб.</th>
                <th>Статус</th>
                <th>Действие</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="trip" items="${trips}">
                    <tr>
                        <td>${trip.startPoint}</td>
                        <td>${trip.finalPoint}</td>
                        <td>${trip.tripDate}</td>
                        <td>${trip.price}</td>
                        <td>${trip.tripStatus.getRussianName()}</td>
                        <td>
                            <div class="w-full flex items-center justify-center space-x-2">
                                <button class="text-gray-700 hover:text-gray-900" onclick="comleteTrip(${request.requestId})">
                                    <span class="material-symbols-outlined">check</span>
                                </button>
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
