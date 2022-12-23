<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Оценка пассажира</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="ratePassenger">
    <div class="container">
        <div class="ratePassenger-inner">
            <form name = "RatePassengerForm" method="POST" action = "ratePassenger">
                <div class="ratePassenger-title title">Выставление оценки пассажиру</div><br>
                <div class="ratePassenger-passenger">
                    <label>Фамилия и имя пассажира</label>
                    <input type="text" id="passenger" class="ratePassenger-passenger-input">
                </div>
                <div class="ratePassenger-mark">
                    <label>Выберите оценку: </label>
                    <select id="selectMark">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                </div>
                <br>
                <button class="submit" type="submit" name="submit">Оценить пассажира</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>

