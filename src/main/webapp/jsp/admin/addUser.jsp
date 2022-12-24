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


