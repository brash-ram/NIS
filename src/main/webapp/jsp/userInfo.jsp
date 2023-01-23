<%@ page import="ru.rsreu.nis.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Информация о пользователе</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css"/>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"/>
    <style>
        <%@include file="../css/style.css" %>
    </style>
</head>
<body>

<div class="userInfo">
    <div class="container">
        <div class="userInfo-inner">
            <div class="userInfo-title title">
                <div class="button-wrapper">
                    <button type="button" class="text-white bg-gradient-to-r from-cyan-500 to-blue-500 hover:bg-gradient-to-bl focus:ring-4 focus:outline-none focus:ring-cyan-300
                dark:focus:ring-cyan-800 font-medium rounded-lg text-sm px-5 py-2.5 text-center mr-2" onclick="window.history.back()">Назад</button>
                </div>
                <div class="header-user">Просмотр информации о пользователе</div>
            </div>
            <br>
            <div class="userInfo-lastname">
                <label class="userInfo-lastname-title">Фамилия</label>
                <input disabled style="text-align:center;" id="lastname" name="lastname" value="${user_info.lastName}" class="userInfo-lastname-input">
            </div>
            <br>
            <div class="userInfo-firstname">
                <label class="userInfo-firstname-title">Имя</label>
                <input disabled style="text-align:center;" id="firstname" name="firstname" value="${user_info.firstName}" class="userInfo-firstname-input">
            </div>
            <br>
            <div class="userInfo-avgMark">
                <label class="userInfo-avgMark-title">Средняя оценка</label>
                <input disabled style="text-align:center;" id="avgMark" name="avgMark" value="${user_info.averageMark}" class="userInfo-avgMark-input">
            </div>
        </div>
    </div>
</div>
</body>
</html>

