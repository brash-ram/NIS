<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="table">
    <thead>
    <tr>
        <th>Начальная точка</th>
        <th>Конечная точка</th>
        <th>Дата поездки</th>
        <th>Пассажир</th>
        <th>Одобрить пассажира</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="request" items="${requests}">
        <tr>
            <td>${request.trip.startPoint}</td>
            <td>${request.trip.finalPoint}</td>
            <td>${request.trip.tripDate}</td>
            <td>
                <div class="w-full flex items-center justify-center space-x-2">
                    <button class="text-gray-700 hover:text-gray-900" onclick="userInfo(${request.passenger.userId})">
                        <span class="material-symbols-outlined">visibility</span>
                    </button>
                </div>
            </td>
            <td>
                <div class="w-full flex items-center justify-center space-x-2">
                    <button class="text-gray-700 hover:text-gray-900" onclick="approvePassenger(${request.requestId})">
                        <span class="material-symbols-outlined">check</span>
                    </button>
                    <button class="text-gray-700 hover:text-gray-900" onclick="disapprovePassenger(${request.requestId})">
                        <span class="material-symbols-outlined">close</span>
                    </button>
                </div>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>