<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>CreateTrip</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

<%--    <style>--%>
<%--        <%@include file="../css/style.css" %>--%>
<%--    </style>--%>
</head>
<body>
<%--<%@include file="driverProfile.jsp" %>--%>
<div class="createTrip">
    <div class="trip-container">
        <div class="createTrip-inner">
            <form name = "CreateTripForm" method="POST" action = "createTrip">
                <div class="createTrip-title title">Создание поездки</div>
                <div class="createTrip-start-point">
                    <div class="createTrip-start-point-title">Начальная точка</div>
                    <input type="text" id="start-point" class="createTrip-start-point-input">
                </div>
                <div class="createTrip-final-point">
                    <div class="createTrip-final-point-title">Конечная точка</div>
                    <input type="text" id="final-point" class="createTrip-final-point-input">
                </div>
                <div class="createTrip-date">
                    <div class="createTrip-date-title">Дата поездки</div>
                    <input type="text" id="date" class="createTrip-date-input">
                </div>
                <div class="createTrip-free-seats">
                    <div class="createTrip-free-seats-title">Количество свободных мест</div>
                    <input type="text" id="free-seats" class="createTrip-free-seats-input">
                </div>
                <div class="createTrip-price">
                    <div class="createTrip-price-title">Цена поездки</div>
                    <input type="text" id="price" class="createTrip-price-input">
                </div>
                <button class="tripSubmit" type="submit" name="submit">Создать поездку</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>

