
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
  <button type="button" id="addHomeBtn" class="btn btn-success">Dodaj dom</button>
  <button type="button" id="showHomesBtn" class="btn btn-success">Pokaż moje domy</button>
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
  <br>
  <br>
  <table id="tableUserHomes" class="table table-striped">
    <thead>
    <tr >
      <th scope="col">id</th>
      <th scope="col">powierzchnia</th>
      <th scope="col">cena</th>
      <th scope="col">typ</th>
      <th scope="col">ulica</th>
      <th scope="col">nr domu</th>
      <th scope="col">nr mieszkania</th>
      <th scope="col">miasto</th>
      <th scope="col">kod pocztowy</th>
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
