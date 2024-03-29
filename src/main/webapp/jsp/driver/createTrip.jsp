<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Создание поездки</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="createTrip">
    <div class="container">
        <div class="createTrip-inner">
            <form name = "CreateTripForm" method="POST" action = "createTrip">
                <div class="createTrip-title title">
                    <div class="button-wrapper">
                        <button type="button" class="text-white bg-gradient-to-r from-cyan-500 to-blue-500 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none focus:ring-cyan-300
                dark:focus:ring-cyan-800 font-medium rounded-lg text-sm px-5 py-2.5 text-center mr-2" onclick="window.history.back()">Назад</button>
                    </div>
                    <div class="header-user">Создание поездки</div>
                </div>
                <br>
                <div class="createTrip-start-point">
                    <div class="createTrip-start-point-title">Начальная точка</div>
                    <input type="text" id="start-point" name="start-point" class="createTrip-start-point-input">
                </div>
                <div class="createTrip-final-point">
                    <div class="createTrip-final-point-title">Конечная точка</div>
                    <input type="text" id="final-point" name="final-point" class="createTrip-final-point-input">
                </div>
                <div class="createTrip-date">
                    <div class="createTrip-date-title">Дата поездки</div>
<%--                    <input type="text" id="date" name="date" class="createTrip-date-input">--%>
                    <input type="date" id="date" name="date"
                           value="${minDate}"
                           min="${minDate}" max="">
                </div>
                <div class="createTrip-free-seats">
                    <div class="createTrip-free-seats-title">Количество свободных мест</div>
                    <input type="text" id="free-seats" name="free-seats" class="createTrip-free-seats-input">
                </div>
                <div class="createTrip-price">
                    <div class="createTrip-price-title">Цена поездки</div>
                    <input type="text" id="price" name="price" class="createTrip-price-input">
                </div>
                <button class="submit" type="submit" name="submit">Создать поездку</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>

