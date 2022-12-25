<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ru.rsreu.nis.entity.enums.TripStatus" %>
<html>
<head>
    <title>Информация о поездках</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700">
    <style>
        <%@include file="../../css/style.css" %>
    </style>
    <script
            src="https://code.jquery.com/jquery-3.6.3.min.js"
            integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
            crossorigin="anonymous">
    </script>
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
                <th>Количество мест</th>
                <th>Статус</th>
                <th>Пассажиры</th>
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
                        <td>${trip.freeSeats}</td>
                        <td>${trip.tripStatus.getRussianName()}</td>
                        <td></td>
                        <td>
                            <div class="w-full flex items-center justify-center space-x-2">
                                <c:if test="${!trip.tripStatus.equals(TripStatus.COMPLETED)}">
                                    <button class="text-gray-700 hover:text-gray-900" onclick="completeTrip(${trip.tripId})">
                                        <span class="material-symbols-outlined">check</span>
                                    </button>
                                </c:if>
                                <button class="text-gray-700 hover:text-gray-900" onclick="deleteTrip(${trip.tripId})">
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
<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>
</body>
</html>
