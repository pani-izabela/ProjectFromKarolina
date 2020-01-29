
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
  <div class="container">
    <h2>Podaj adres</h2>
    <form>
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="street">Ulica</label>
          <input type="text" class="form-control" id="street" placeholder="Podaj nazwę ulicy">
        </div>
        <div class="form-group col-md-2">
          <label for="nrHome">Nr domu</label>
          <input type="text" class="form-control" id="nrHome" placeholder="Podaj nr domu">
        </div>
        <div class="form-group col-md-2">
          <label for="nrFlat">Nr mieszkania</label>
          <input type="text" class="form-control" id="nrFlat" placeholder="Podaj nr mieszkania">
        </div>
      </div>
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="city">Miasto</label>
          <input type="text" class="form-control" id="city" placeholder="Podaj miasto">
        </div>
        <div class="form-group col-md-6">
          <label for="postalCode">Kod pocztowy</label>
          <input type="text" class="form-control" id="postalCode" placeholder="Podaj kod pocztowy">
        </div>
      </div>
      <button type="button" class="btn btn-success" id="searchBtn">Szukaj domu</button>
    </form>
  </div>
  <br>
  <br>
  <table id="tableHomes" class="table table-striped">
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
  <%--<script src="../../js/homesList.js" type="text/javascript"></script>--%>


  </body>
</html>
