
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
  <head>
    <title>Users</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  </head>
  <body>
  <%--<a href="usersList.jsp" role="button" class="button">Pobierz listę użytkowników</a>--%>
  <div class="container">
    <h2>Logowanie</h2>
    <form action="/action_page.php">
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" class="form-control" id="email" placeholder="Podaj email" name="email">
      </div>
      <div class="form-group">
        <label for="pwd">Hasło:</label>
        <input type="password" class="form-control" id="pwd" placeholder="Podaj hasło" name="pswd">
      </div>
      <%--<button type="submit" class="btn btn-primary">Submit</button>--%>

      <button type="button" class="btn btn-success">Zaloguj</button>
    </form>
  </div>
  <br>

  <script type="text/javascript">

  </script>
  </body>
</html>