<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Оформление заявки на поездку</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="createRequest">
    <div class="container">
        <div class="createRequest-inner">
            <form name = "CreateRequestForm" method="POST" action = "createRequest">
                <div class="createRequest-title title">Оформление заявки на поездку</div><br>
                <div class="createRequest-final-point">
                    <div class="createRequest-final-point-title">Конечная точка</div>
                    <input type="text" id="final-point" class="createRequest-final-point-input">
                </div>
                <div class="createRequest-date">
                    <div class="createRequest-date-title">Дата поездки</div>
                    <input type="text" id="date" class="createRequest-date-input">
                </div>
                <button class="submit" type="submit" name="submit">Подать заявку</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>

