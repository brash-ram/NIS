<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ru.rsreu.nis.entity.enums.SessionStatus" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Список пользователей</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>
</head>
<body>
<div class="userList">
    <div class="userList-container px-5">
        <div class="userList-inner">
            <div class="userList-title title">Список пользователей</div><br>
            <div class="flex items-center space-x-2 mb-2">
                <div class="flex items-center">
                    <input checked id="allUsers-radio" type="radio" value="ALL" name="default-radio" class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
                    <label for="allUsers-radio" class="ml-2 text-sm font-medium text-gray-900 dark:text-gray-300" itemref="/nis/userList">Все пользователи</label>
                </div>
                <div class="flex items-center">
                    <input id="authorizedUsers-radio" type="radio" value="AUTHORIZED" name="default-radio" class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
                    <label for="authorizedUsers-radio" class="ml-2 text-sm font-medium text-gray-900 dark:text-gray-300" itemref="/nis/userList">Авторизованные пользователи</label>
                </div>
                <div class="flex items-center ">
                    <input id="blockedUsers-radio" type="radio" value="BLOCKED" name="default-radio" class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
                    <label for="blockedUsers-radio" class="ml-2 text-sm font-medium text-gray-900 dark:text-gray-300" itemref="/nis/userList">Заблокированные пользователи</label>
                </div>
            </div>
            <table class="table">
                <thead>
                <tr>
                    <th>Фамилия</th>
                    <th>Имя</th>
                    <th>Статус</th>
                    <th>Роль в системе</th>
                    <th>Авторизован</th>
                    <th>Действия</th>
                </tr>
                </thead>
                <tbody>
                    <c:forEach var="session" items="${sessions}">
                    <tr>
                        <td>${user.user.lastName}</td>
                        <td>${user.user.firstName}</td>
                        <td>${user.user.userStatus}</td>
                        <td>${user.user.userRole}</td>
                        <td>${user.status == SessionStatus.AUTHORIZED ? "Да" : "Нет"}</td>
                        <td>
                            <div class="w-full flex items-center justify-center space-x-2">
                                <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="deleteUser(${user.getUserId()})">
                                    <span class="material-symbols-outlined">delete</span>
                                </button>
                                <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="changeUser(${user.getUserId()})">
                                    <span class="material-symbols-outlined">edit</span>
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
</div>
</body>
</html>
