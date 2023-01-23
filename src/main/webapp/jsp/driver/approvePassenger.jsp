<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Одобрение пассажира для поездки</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
    <script
            src="https://code.jquery.com/jquery-3.6.3.min.js"
            integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
            crossorigin="anonymous">
    </script>
</head>
<body>
<div class="approvePassenger">
    <div class="approvePassenger-container">
        <div class="approvePassenger-inner">
            <div class="table-title title">
                <div class="button-wrapper">
                    <button type="button" class="text-white bg-gradient-to-r from-cyan-500 to-blue-500 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none focus:ring-cyan-300
                dark:focus:ring-cyan-800 font-medium rounded-lg text-sm px-5 py-2.5 text-center mr-2" onclick="window.history.back()">Назад</button>
                </div>
                <div class="header-user">Заявки на поездки</div>
            </div><br>
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
                    <c:forEach var="request" items="${requests}">
                        <tr>
                            <td>${request.trip.startPoint}</td>
                            <td>${request.trip.finalPoint}</td>
                            <td>${request.trip.tripDate}</td>
                            <td>
                                <div class="w-full flex items-center justify-center space-x-2">
                                    <button class="text-gray-700 hover:text-gray-900" onclick="userInfo(${request.passenger.userId})">
                                        <span class="material-symbols-outlined">visibility</span>
                                    </button>
                                </div>
                            </td>
                            <td>
                                <div class="w-full flex items-center justify-center space-x-2">
                                    <button class="text-gray-700 hover:text-gray-900" onclick="approvePassenger(${request.requestId})">
                                        <span class="material-symbols-outlined">check</span>
                                    </button>
                                    <button class="text-gray-700 hover:text-gray-900" onclick="disapprovePassenger(${request.requestId})">
                                        <span class="material-symbols-outlined">close</span>
                                    </button>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://unpkg.com/flowbite@1.5.5/dist/flowbite.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>
</body>
</html>

