<%--
  Created by IntelliJ IDEA.
  User: makas
  Date: 22.11.2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <div class="page">
        <header>
            <div class="logo-wrapper">
                Регистрация
            </div>
        </header>
        <main class="container-fluid">
            <div class="form-wrapper">
                <form action="registration" class="login-form" method="post">
                    <div class="form-group">
                        <label for="loginInput">Логин</label>
                        <input type="text" name="login" class="form-control" id="loginInput">
                    </div>
                    <div class="form-group">
                        <label for="firstNameInput">Имя</label>
                        <input type="text" name="firstName" class="form-control" id="firstNameInput">
                    </div>
                    <div class="form-group">
                        <label for="lastNameInput">Фамилия</label>
                        <input type="text" name="lastName" class="form-control" id="lastNameInput">
                    </div>
                    <div class="form-group">
                        <label for="passwordInput">Пароль</label>
                        <input type="password" name="password" class="form-control" id="passwordInput">
                    </div>
<%--                    <div class="form-group">--%>
<%--                        <label for="passwordAgainInput">Пвторите пароль</label>--%>
<%--                        <input type="password" name="passwordAgain" class="form-control" id="passwordAgainInput">--%>
<%--                    </div>--%>
                    <div class="form-group">
                        <button type="submit" class="btn submit-btn" >Зарегистрироваться</button>
                    </div>
                </form>
            </div>
        </main>
        <footer></footer>
    </div>
</div>
</body>
</html>
