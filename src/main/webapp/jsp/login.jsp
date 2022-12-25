<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Авторизация</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
  </head>
  <body>
    <div class="auth-container">
      <img src="https://dwstroy.ru/lessons/les3373/demo/img/men.png">
      <form name = "LoginForm" method="POST" action = "login">
        <div class="input">
          <input type="text" name="login" placeholder="Введите логин">
          <input type="password" name="password" placeholder="Введите пароль">
        </div>
        <button class="submit">Войти</button>
      </form>
    </div>
  </body>
</html>