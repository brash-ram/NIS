<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Оформление заявки на поездку</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
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
<div class="createRequest">
    <div class="createRequest-container">
        <div class="createRequest-inner">
            <div class="table-title title">
                <div class="button-wrapper">
                    <button type="button" class="text-white bg-gradient-to-r from-cyan-500 to-blue-500 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none focus:ring-cyan-300
                dark:focus:ring-cyan-800 font-medium rounded-lg text-sm px-5 py-2.5 text-center mr-2" onclick="window.history.back()">Назад</button>
                </div>
                <div class="header-user">Доступные поездки</div>
            </div><br>
            <table class="table">
                <thead>
                <tr>
                    <th>Начальная точка</th>
                    <th>Конечная точка</th>
                    <th>Дата поездки</th>
                    <th>Количество свободных мест</th>
                    <th>Цена, руб.</th>
                    <th>Оформить заявку</th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach var="trip" items="${trips}">
                    <tr>
                        <td>${trip.getStartPoint()}</td>
                        <td>${trip.getFinalPoint()}</td>
                        <td>${trip.getTripDate()}</td>
                        <td>${trip.getFreeSeats()}</td>
                        <td>${trip.getPrice()}</td>
                        <td>
                            <div class="w-full flex items-center justify-center space-x-2">
                                <button class="text-gray-700 hover:text-gray-900" onclick="createRequest(${trip.tripId})">
                                    <span class="material-symbols-outlined">add_circle</span>
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

