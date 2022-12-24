<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Оценка водителя</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="rateDriver">
    <div class="container">
        <div class="rateDriver-inner">
            <form name = "RatePassengerForm" method="POST" action = "rateDriver">
                <div class="rateDriver-title title">Выставление оценки водителю</div><br>
                <div class="rateDriver-driver">
                    <label>Фамилия и имя водителя</label>
                    <input type="text" id="driver" class="rateDriver-driver-input">
                </div>
                <div class="rateDriver-mark">
                    <label>Выберите оценку: </label>
                    <select id="selectMark">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
                <br>
                <button class="submit" type="submit" name="submit">Оценить водителя</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>

