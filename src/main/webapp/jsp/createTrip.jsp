<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>CreateTrip</title>
    <style>
        <%@include file="../css/style.css" %>
    </style>
</head>
<body>
<%@include file="driverProfile.jsp" %>
<div class="createTrip">
    <div class="trip-container">
        <div class="createTrip-inner">
            <div class="createTrip-title title">Создание поездки</div>
            <div class="createTrip-start-point">
                <div class="createTrip-start-point-title">Начальная точка:</div>
                <input type="text" id="start-point" class="createTrip-start-point-input">
            </div>
            <div class="createTrip-final-point">
                <div class="createTrip-final-point-title">Конечная точка:</div>
                <input type="text" id="final-point" class="createTrip-final-point-input">
            </div>
            <div class="createTrip-date">
                <div class="createTrip-date-title">Дата поездки:</div>
                <input type="text" id="date" class="createTrip-date-input">
            </div>
            <div class="createTrip-free-seats">
                <div class="createTrip-free-seats-title">Количество свободных мест:</div>
                <input type="text" id="free-seats" class="createTrip-free-seats-input">
            </div>
            <div class="createTrip-price">
                <div class="createTrip-price-title">Цена поездки:</div>
                <input type="text" id="price" class="createTrip-price-input">
            </div>
        </div>
    </div>
</div>
</body>
</html>
