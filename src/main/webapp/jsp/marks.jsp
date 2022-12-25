<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Оценки от водителей</title>
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
      <div class="table-title title">Оценки от водителей</div><br>
      <table class="table">
        <thead>
        <tr>
          <th>Водитель</th>
          <th>Дата поездки</th>
          <th>Оценка</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="mark" items="${marks}">
        <tr>
          <td>${mark.getFirstname()}.concat(${mark.getLastname()})</td>
          </td></tr>
          <td>12.12.2012</td>
          <td>
            <select id="selectMark">
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </select>
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

