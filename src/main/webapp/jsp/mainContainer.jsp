<%--
  Created by IntelliJ IDEA.
  User: makas
  Date: 22.11.2022
  Time: 2:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Main</title>

    <link rel="stylesheet" href="https://unpkg.com/flowbite@1.5.4/dist/flowbite.min.css" />
</head>
<body>

<jsp:include page="navBar.jsp"/>


<div class="mainContainer">
        <jsp:include page="${mainContent}" />
<%--        <jsp:include page="userInfo.jsp" />--%>
    </div>

    <script src="https://unpkg.com/flowbite@1.5.4/dist/flowbite.js"></script>
</body>
</html>
