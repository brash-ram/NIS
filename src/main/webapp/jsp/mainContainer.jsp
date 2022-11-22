<%--
  Created by IntelliJ IDEA.
  User: makas
  Date: 22.11.2022
  Time: 2:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
</head>
<body>
    <div class="mainContainer">
        <jsp:include page="actions.jsp" />
        <jsp:include page="${mainContent}" />
        <jsp:include page="userInfo.jsp" />
    </div>

</body>
</html>
