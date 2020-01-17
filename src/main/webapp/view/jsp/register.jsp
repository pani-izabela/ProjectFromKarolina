
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
    <h2>Rejestracja</h2>
    <form class="form" action="/action_page.php">
      <div class="form-group">
        <label for="firstname">Imię:</label>
        <input type="text" class="form-control form-control-sm" id="firstname" placeholder="Wpisz imię" name="firstname">
      </div>
      <div class="form-group">
        <label for="lastname">Nazwisko:</label>
        <input type="text" class="form-control form-control-sm" id="lastname" placeholder="Wpisz nazwisko" name="lastname">
      </div>
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" class="form-control" id="email" placeholder="Podaj email" name="email">
      </div>
      <div class="form-group">
        <label for="pwd">Hasło:</label>
        <input type="password" class="form-control" id="pwd" placeholder="Podaj hasło" name="pswd">
      </div>
      <%--<button type="submit" class="btn btn-primary">Submit</button>--%>

      <button type="button" class="btn btn-success" id="registerBtn">Zarejestruj</button>
    </form>
  </div>
  <br>

  <script src="../../js/main.js" type="text/javascript"></script>
  <script src="../../js/register.js" type="text/javascript">
  </script>
  </body>
</html>
