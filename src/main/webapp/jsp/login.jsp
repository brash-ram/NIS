<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Авторизация</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
  </head>
  <body>
    <div class="title">
      Сетевая информационная система "Попутчики"
    </div>
    <div class="container">
      <img src="https://dwstroy.ru/lessons/les3373/demo/img/men.png">
      <form name = "LoginForm" method="POST" action = "FrontController">
        <div class="input">
          <input type="hidden" name="command" value="login"/>
          <input type="text" name="login" placeholder="Введите логин">
          <input type="password" name="password" placeholder="Введите пароль">
          <br/>${errorLoginpassMessage}<br/>
          <br/>${wrongAction}<br/>
        </div>
        <input class="submit" type="submit" name="submit" value="ВОЙТИ"><br />
      </form>
    </div>
  </body>
</html>