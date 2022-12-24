<%@ page import="ru.rsreu.nis.entity.enums.Roles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Добавление пользователя</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css"/>
    <style>
        <%@include file="../../css/style.css" %>
    </style>
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
                    <a href="/nis/addUser"
                       class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700">Добавление
                        пользователя</a>
                </li>
                <li>
                    <a href="/nis/userList"
                       class="block py-2 pl-3 pr-4 text-gray-700 rounded hover:bg-gray-100 md:hover:bg-transparent md:border-0 md:hover:text-blue-700">Просмотр
                        списка пользователей </a>
                </li>
                <li>
                    <a href="/nis/login"
                       class="block py-2 pl-3 pr-4 text-white bg-blue-700 rounded md:bg-transparent md:text-blue-700"
                       aria-current="page">Выйти из системы</a>
                </li>
            </ul>
        </div>
    </nav>
</div>
<div class="addUser">
    <div class="container">
        <div class="addUser-inner">
            <form name="AddUserForm" method="POST" action="addUser">
                <div class="addUser-title title">Добавление пользователя</div>
                <br>
                <div class="addUser-firstname">
                    <div class="addUser-firstname-title">Имя</div>
                    <input type="text" id="firstname" name="firstname" class="addUser-firstname-input">
                </div>
                <div class="addUser-lastname">
                    <div class="addUser-lastname-title">Фамилия</div>
                    <input type="text" id="lastname" name="lastname" class="addUser-lastname-input">
                </div>
                <div class="addUser-login">
                    <div class="addUser-login-title">Логин</div>
                    <input type="text" id="login" name="login" class="addUser-login-input">
                </div>
                <div class="addUser-password">
                    <div class="addUser-password-title">Пароль</div>
                    <input type="password" id="password" name="password" class="addUser-password-input">
                </div>
                <div class="addUser-role">
                    <label>Выберите роль: </label>
                    <select id="selectMark">
                        <option value="${Roles.DRIVER}">Водитель</option>
                        <option value="${Roles.PASSENGER}">Пассажир</option>
                        <option value="${Roles.ADMIN}">Администратор</option>
                        <option value="${Roles.MODERATOR}">Модератор</option>
                    </select>
                </div>
                <br>
                <button class="submit" type="submit" name="submit">Добавить пользователя</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>


