<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Одобрение пассажира для поездки</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="approvePassenger">
    <div class="container">
        <form name = "ApprovePassengerForm" method="POST" action = "approvePassenger">
            <div class="approvePassenger-title title">Одобрение пассажира для поездки</div><br>
            <div class="approvePassenger-passenger">
                <label>Фамилия и имя пассажира</label>
                <input type="text" id="passenger" class="ratePassenger-passenger-input">
            </div>
            <div class="ratePassenger-mark">
                <label>Одобрить пассажира? </label>
                <select id="selectValue">
                    <option>Да</option>
                    <option>Нет</option>
                </select>
            </div>
            <br>
            <button class="submit" type="submit" name="submit">ОК</button>
        </form>
    </div>
</div>
</body>
</html>

