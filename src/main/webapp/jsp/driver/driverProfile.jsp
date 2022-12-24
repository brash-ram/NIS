<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Меню водителя</title>
    <style>
        <%@include file="../../css/style.css" %>
    </style>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
</head>
<body>
<header>
    <nav class="bg-white border-gray-200 px-2 py-2.5 rounded">
        <div class="container flex flex-wrap flex-col items-center justify-between mx-auto p-2">
            <a class="flex items-center mb-2">
                <img src="../../images/logo_header.jpg" class="h-6 mr-3"/>
                <span class="self-center text-xl font-semibold whitespace-nowrap">Сетевая информационная система "Попутчики"</span>
            </a>
            <ul class="flex item-center space-x-1 p-1 mt-4 border border-gray-100 rounded-lg bg-gray-50">
                <li>
                    <a href="/nis/createTrip" class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent">Создание поездки</a>
                </li>
                <li>
                    <a href="/nis/approvePassenger" class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent">Одобрение пассажира для поездки</a>
                </li>
                <li>
                    <a href="/nis/ratePassenger" class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent">Выставление оценки пассажиру</a>
                </li>
                <li>
                    <a href="/nis/tripParameters" class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent">Просмотр заявок на конкретную поездку</a>
                </li>
                <li>
                    <a href="/nis/tripsInfo" class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent">Просмотр информации о поездках</a>
                </li>
                <li>
                    <a href="/nis/tripParameters" class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700 md:p-0 dark:text-gray-400 md:dark:hover:text-white dark:hover:bg-gray-700 dark:hover:text-white md:dark:hover:bg-transparent">Просмотр оценок от пассажиров</a>
                </li>
                <li>
                    <a href="/nis/login" class="block py-2 pl-3 pr-4 text-white bg-blue-700 rounded md:bg-transparent md:text-blue-700 md:p-0 dark:text-white" aria-current="page">Выйти из системы</a>
                </li>
            </ul>
        </div>
    </nav>
</header>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://unpkg.com/flowbite@1.5.5/dist/flowbite.js"></script>
</body>
</html>