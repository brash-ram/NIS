<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Заявки на поездки</title>
    <style>
        <%@include file="../css/style.css" %>
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/books.js"></script>
</head>
<body>
<div class="tripRequests">
    <div class="tripRequests-container">
        <div class="tripRequests-inner">
            <div class="table-title title">Заявки на поездку</div>
            <div class="tripRequests-table table">
                <div class="tripRequests-row row">
                    <div>Читатель</div>
                    <div>Книга</div>
                    <div>Оценка</div>
                </div>
                <c:forEach var="request" items="${requests}">
                    <div class="recommendations-row row">
                        <div>${rate.getReader().getLogin()}</div>
                        <div>${rate.getBook().getTitle()}</div>
                        <div>${rate.getRating()}</div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
</body>
</html>