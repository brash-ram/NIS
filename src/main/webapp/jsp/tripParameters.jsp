<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Параметры поездки</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <style>
        <%@include file="../css/style.css" %>
    </style>
</head>
<body>
<div class="tripParameters">
    <div class="container">
        <div class="tripParameters-inner">
            <form name = "TripParametersForm" method="POST" action = "tripParameters">
                <div class="tripParameters-title title">Параметры поездки</div><br>
                <div class="tripParameters-start-point">
                    <div class="tripParameters-start-point-title">Начальная точка</div>
                    <input type="text" class="input">
                </div>
                <div class="tripParameters-final-point">
                    <div class="tripParameters-final-point-title">Конечная точка</div>
                    <input type="text" class="input">
                </div>
                <div class="tripParameters-date">
                    <div class="tripParameters-date-title">Дата поездки</div>
                    <input type="text" class="input">
                </div>
                <button class="submit" type="submit" name="submit">Найти информацию о поездке</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
</body>
</html>
