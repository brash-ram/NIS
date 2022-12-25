<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Список пользователей</title>
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css"/>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"/>
    <style>
        <%@include file="../css/style.css" %>
    </style>
    <script
            src="https://code.jquery.com/jquery-3.6.3.min.js"
            integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
            crossorigin="anonymous">
    </script>
</head>
<body>
<div class="userList">
    <div class="userList-container px-5">
        <div class="userList-inner">
            <div class="userList-title title">Список пользователей</div>
            <br>
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
                <c:forEach var="sessionInstance" items="${sessions}">
                <tr>
                    <td>${sessionInstance.getUser().getLastName()}</td>
                    <td>${sessionInstance.getUser().getFirstName()}</td>
                    <td>${sessionInstance.getUser().userStatus.getRussianName()}</td>
                    <td>${sessionInstance.getUser().userRole.getRussianName()}</td>
                    <td>${sessionInstance.status.getRussianName()}</td>
                    <td>
                        <c:choose>
                            <c:when test="${session.getUser().getUserRole().equals(Roles.ADMIN)}">
                                <div class="w-full flex items-center justify-center space-x-2">
                                    <button class="text-gray-700 hover:text-gray-900" name="submit"
                                            onclick="deleteUser(${session.getUser().getUserId()})">
                                        <span class="material-symbols-outlined">delete</span>
                                    </button>
                                    <button class="text-gray-700 hover:text-gray-900" name="submit"
                                            onclick="changeUser(${session.getUser().getUserId()})">
                                        <span class="material-symbols-outlined">edit</span>
                                    </button>
                                </div>
                            </c:when>
                            <c:when test="${session.getUser().getUserRole().equals(Roles.MODER)}">
                                <c:when test="${session.getUser().getUserStatus().equals(UserStatus.NOT_BLOCKED)}">
                                    <div class="w-full flex items-center justify-center space-x-2">
                                        <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="">
                                            <span class="material-symbols-outlined">lock</span>
                                        </button>
                                    </div>
                                </c:when>
                                <c:when test="${session.getUser().getUserStatus().equals(UserStatus.BLOCKED)}">
                                    <div class="w-full flex items-center justify-center space-x-2">
                                        <button class="text-gray-700 hover:text-gray-900" name="submit" onclick="">
                                            <span class="material-symbols-outlined">lock_open</span>
                                        </button>
                                    </div>
                                </c:when>
                            </c:when>
                        </c:choose>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>
</body>
</html>
