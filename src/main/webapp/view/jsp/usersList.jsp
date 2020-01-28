
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
  <br>
  <button type="button" id="button" class="btn btn-success">Pobierz listę użytkowników</button>
  <button type="button" id="buttonAdress" class="btn btn-success">Pobierz listę adresów moich domów</button>
  <button type="button" id="addHomeBtn" class="btn btn-success">Dodaj dom</button>
  <br>
  <br>
  <table id="table" class="table table-striped">
    <thead>
    <tr >
      <th scope="col">id</th>
      <th scope="col">imię</th>
      <th scope="col">nazwisko</th>
      <th scope="col">email</th>
      <th scope="col">action</th>
    </tr>
    </thead>
    <tbody></tbody>
  </table>

  <script src="../../js/main.js" type="text/javascript"></script>
  <script src="../../js/register.js" type="text/javascript"></script>
  <script src="../../js/login.js" type="text/javascript"></script>
  <script src="../../js/usersList.js" type="text/javascript"></script>
  <script src="../../js/home.js" type="text/javascript"></script>
  <script src="../../js/adress.js" type="text/javascript"></script>


  </body>
</html>
