<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Авторизация</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link rel="stylesheet" href="../css/main.css" />

    <%-- Google Fonts --%>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
    <%-- end Google Fonts    --%>
</head>
<body>
<%--<h1><%= "Hello World!" %>--%>
</h1>
<div>
    <div class="page">
        <header>
            <div class="logo-wrapper">
                Стартовая странца
            </div>
        </header>
        <main class="container-fluid">
            <div class="form-wrapper">
                <form action="login" class="login-form" method="get">
                    <div class="form-group">
                        <button class="btn submit-btn" >Авторизация</button>
                    </div>
                </form>
                <form action="registration" class="login-form" method="get">
                    <div class="form-group">
                        <button class="btn submit-btn" >Регистрация</button>
                    </div>
                </form>
            </div>
        </main>
        <footer></footer>
    </div>
</div>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>