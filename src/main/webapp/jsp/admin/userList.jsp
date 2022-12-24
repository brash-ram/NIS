<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Список пользователей</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <style>
        <%@include file="../../css/style.css" %>
    </style>
</head>
<body>
<div class="userList">
    <div class="userList-container px-5">
        <div class="userList-inner">
            <div class="userList-title title">Список пользователей</div><br>
            <div class="flex items-center space-x-2 mb-2">
                <div class="flex items-center">
                    <input checked id="allUsers-radio" type="radio" value="" name="default-radio" class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
                    <label for="allUsers-radio" class="ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">Все пользователи</label>
                </div>
                <div class="flex items-center">
                    <input id="authorizedUsers-radio" type="radio" value="" name="default-radio" class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
                    <label for="authorizedUsers-radio" class="ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">Авторизованные пользователи</label>
                </div>
                <div class="flex items-center ">
                    <input id="blockedUsers-radio" type="radio" value="" name="default-radio" class="w-4 h-4 text-blue-600 bg-gray-100 border-gray-300 focus:ring-blue-500 dark:focus:ring-blue-600 dark:ring-offset-gray-800 focus:ring-2 dark:bg-gray-700 dark:border-gray-600">
                    <label for="blockedUsers-radio" class="ml-2 text-sm font-medium text-gray-900 dark:text-gray-300">Заблокированные пользователи</label>
                </div>
            </div>
            <table class="table">
                <thead>
                <tr>
                    <th>Фамилия</th>
                    <th>Имя</th>
                    <th>Логин</th>
                    <th>Статус</th>
                    <th>Роль в системе</th>
                    <th>Действия</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <c:forEach var="user" items="users">

                    </c:forEach>
                    <td>Иванов</td>
                    <td>Иван</td>
                    <td>ivanovIone</td>
                    <td>Не заблокирован</td>
                    <td>Водитель</td>
                    <td>
                        <div class="w-full flex items-center justify-center space-x-2">
                            <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="deleteUser(${user.getId()})">
                                <span class="material-symbols-outlined">delete</span>
                            </button>
                            <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="changeUser(${user.getId()})">
                                <span class="material-symbols-outlined">edit</span>
                            </button>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</div>
</body>
</html>
