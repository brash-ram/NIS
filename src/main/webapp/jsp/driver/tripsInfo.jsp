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
