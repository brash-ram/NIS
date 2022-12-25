<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="ru.rsreu.nis.entity.enums.Roles" %>
<!DOCTYPE html>
<html>
<head>
  <title>Оценки</title>
  <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.5/dist/flowbite.min.css" />
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
  <style>
    <%@include file="../css/style.css" %>
  </style>
</head>
<body>
<div class="driversMarks">
<div class="driversMarks-container">
  <div class="driversMarks-inner">
    <div class="table-title title">${role.equals(Roles.DRIVER) ? "Оценки от пассажиров" : "Оценки от водителей"}</div><br>
    <table class="table">
      <thead>
      <tr>
        <th>Начальная точка</th>
        <th>Конечная точка</th>
        <th>Дата поездки</th>
        <th>${role.equals(Roles.DRIVER) ? "Пассажир" : "Водитель"}</th>
        <th>Оценка</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var="mark" items="${marks}">
        <tr>
          <td>${mark.trip.getStartPoint()}</td>
          <td>${mark.trip.getFinalPoint()}</td>
          <td>${mark.trip.getTripDate()}</td>
          <td><a href="/nis/userInfo">Просмотреть информацию</a></td>
          <td>${mark.getMark()}</td>
        </tr>
      </c:forEach>
      </tbody>
    </table>
  </div>
</div>
</div>
</body>
</html>

