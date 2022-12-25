<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Активные заявки</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
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
<div class="tripRequests">
    <div class="tripRequests-container">
        <div class="tripRequests-inner">
            <div class="table-title title">История заявок</div><br>
            <table class="table">
                <thead>
                <tr>
                    <th>Начальная точка</th>
                    <th>Конечная точка</th>
                    <th>Дата поездки</th>
                    <th>Цена поездки, руб.</th>
                    <th>Статус заявки</th>
                    <th>Водитель</th>
                    <th>Оценка</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="request" items="${requests}">
                    <tr>
                        <td>${request.trip.getStartPoint()}</td>
                        <td>${request.trip.getFinalPoint()}</td>
                        <td>${request.trip.getTripDate()}</td>
                        <td>${request.trip.getPrice()}</td>
                        <td>${request.requestStatus.getRussianName()}</td>
                        <td></td>
                        <td>
                            <form class="some_form" name = "SelectMarkForm">
                                <input type="hidden" name="trip_id" value="${request.trip.tripId}"/>
                                <select id="selectDriverMark" name="mark">
                                    <c:forEach var="mark" items="${marks}">
                                        <c:if test="${request.trip.tripId.equals(mark.trip.tripId)}">
                                            <option></option>
                                            <c:forEach var="all_mark" items="${all_marks}">
                                                <c:if test="${all_mark.equals(mark.mark)}">
                                                    <option value="${all_mark}" selected>${all_mark}</option>
                                                </c:if>
                                                <c:if test="${!all_mark.equals(mark.mark)}">
                                                    <option value="${all_mark}">${all_mark}</option>
                                                </c:if>
                                            </c:forEach>
                                        </c:if>
                                    </c:forEach>
                                  </select>
                                <button class="submit">Оценить</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>
</body>
</html>