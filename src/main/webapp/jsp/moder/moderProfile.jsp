<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Меню модератора</title>
    <style>
        <%@include file="../../css/style.css" %>
    </style>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css"/>
</head>
<body>
<div>
    <nav class="bg-white border-gray-200 px-2 py-2.5 rounded">
        <div class="container flex flex-wrap flex-col items-center justify-between mx-auto">
            <a class="flex items-center mb-2">
                <img src="../../images/logo_header.jpg" class="h-6 mr-3"/>
                <span class="self-center text-xl font-semibold whitespace-nowrap">Сетевая информационная система "Попутчики"</span>
            </a>
            <ul class="flex item-center space-x-1 p-1 mt-4 border border-gray-100 rounded-lg bg-gray-50">
                <li>
                    <a href="/nis/tripList"
                       class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700">Просмотр поездок</a>
                </li>
                <li>
                    <a href="/nis/requestList"
                       class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700">Просмотр заявок пассажиров</a>
                </li>
                <li>
                    <a href="/nis/userList"
                       class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700">Просмотр
                        списка пользователей </a>
                </li>
                <li>
                    <a href="/nis/logout"
                       class="block py-2 pl-3 pr-4 text-white bg-blue-700 rounded md:bg-transparent md:text-blue-700"
                       aria-current="page">Выйти из системы</a>
                </li>
            </ul>
        </div>
    </nav>
</div>
<jsp:include page="../admin/userListTable.jsp"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://unpkg.com/flowbite@1.5.5/dist/flowbite.js"></script>
</body>
</html>