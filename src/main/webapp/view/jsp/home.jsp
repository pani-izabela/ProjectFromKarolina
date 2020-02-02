
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
  <head>
    <title>Home</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <script src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/bootstrap.min.js"></script>
  </head>
  <body>
  <%--<a href="usersList.jsp" role="button" class="button">Pobierz listę użytkowników</a>--%>
  <div class="container">
    <h2>Dane domu</h2>
    <form class="form" action="/action_page.php">
      <div class="form-group">
        <label for="area">Powierzchnia:</label>
        <input type="number" class="form-control form-control-sm" id="area" placeholder="Podaj powierzchnię" name="area">
      </div>
      <div class="form-group">
        <label for="price">Cena:</label>
        <input type="number" class="form-control form-control-sm" id="price" placeholder="Podaj cenę" name="price">
      </div>
      <div class="form-group">
        <label for="type">Typ domu:</label>
        <input type="text" class="form-control" id="type" placeholder="Podaj typ" name="type">
      </div>
      <%--<button type="submit" class="btn btn-primary">Submit</button>--%>

      <button type="button" class="btn btn-success" id="addingHomeBtn">Dodaj dom</button>
    </form>
  </div>
  <br>
  <script src="../../js/home.js" type="text/javascript"></script>
  </body>
</html>
