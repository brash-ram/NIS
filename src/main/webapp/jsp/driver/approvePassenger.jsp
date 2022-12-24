<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Одобрение пассажира для поездки</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>

<div class="approvePassenger">
    <div class="approvePassenger-container">
        <div class="approvePassenger-inner">
            <div class="table-title title">Заявки на поездки</div><br>
            <table class="table">
                <thead>
                <tr>
                    <th>Начальная точка</th>
                    <th>Конечная точка</th>
                    <th>Дата поездки</th>
                    <th>Пассажир</th>
                    <th>Одобрить пассажира</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Рязань</td>
                    <td>Москва</td>
                    <td>12.12.2012</td>
                    <td><a href="/nis/userInfo">Просмотр информации о пассажире</a></td>
                    <td>
                        <div class="w-full flex items-center justify-center space-x-2">
                            <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="">
                                <span class="material-symbols-outlined">check</span>
                            </button>
                            <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="">
                                <span class="material-symbols-outlined">close</span>
                            </button>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://unpkg.com/flowbite@1.5.5/dist/flowbite.js"></script>
</body>
</html>

