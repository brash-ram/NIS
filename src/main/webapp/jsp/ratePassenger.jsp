<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Оценка пассажира</title>
    <style>
        <%@include file="../css/style.css" %>
    </style>
</head>
<body>
<div class="ratePassenger">
    <div class="ratePassenger-container">
        <div class="ratePassenger-inner">
            <form name = "RatePassengerForm" method="POST" action = "ratePassenger">
                <div class="ratePassenger-title title">Выставление оценки пассажиру</div>
                <div class="ratePassenger-passenger">
                    <div class="ratePassenger-passenger-title">Пассажир</div>
                    <input type="text" id="passenger" class="ratePassenger-passenger-input">
                </div>
                <div class="ratePassenger-mark">
                    <div class="ratePassenger-mark-title">Оценка</div>
                    <input type="text" id="mark" class="ratePassenger-mark-input">
                </div>
                <button class="rateSubmit" type="submit" name="submit">Оценить пассажира</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>

