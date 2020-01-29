
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
  <head>
    <title>Users</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <script src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/bootstrap.min.js"></script>
  </head>
  <body>
  <%--<a href="usersList.jsp" role="button" class="button">Pobierz listę użytkowników</a>--%>
  <div class="container">
    <h2>Logowanie</h2>
    <form class="form" action="/action_page.php" >
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" class="form-control" id="email" placeholder="Podaj email" name="email">
      </div>
      <div class="form-group">
        <label for="pwd">Hasło:</label>
        <input type="password" class="form-control" id="pwd" placeholder="Podaj hasło" name="pswd">
      </div>
      <%--<button type="submit" class="btn btn-primary">Submit</button>--%>

      <button type="button" class="btn btn-success" id="loginbtn">Zaloguj</button>
    </form>
  </div>
  <br>


  <script src="../../js/main.js" type="text/javascript"></script>
  <script src="../../js/register.js" type="text/javascript"></script>
  <script src="../../js/login.js" type="text/javascript"></script>
  <script src="../../js/usersList.js" type="text/javascript"></script>
  <script src="../../js/home.js" type="text/javascript"></script>
  <script src="../../js/adress.js" type="text/javascript"></script>
  <%--<script src="../../js/homesList.js" type="text/javascript"></script>--%>

  </body>
</html>
