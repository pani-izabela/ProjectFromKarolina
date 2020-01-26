
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
  <head>
    <title>Adres</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <script src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/bootstrap.min.js"></script>
  </head>
  <body>
  <%--<a href="usersList.jsp" role="button" class="button">Pobierz listę użytkowników</a>--%>
  <div class="container">
    <h2>Adres domu</h2>
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
      <button type="button" class="btn btn-success" id="addingAdressBtn">Dodaj adres</button>
    </form>
  </div>
  <br>

  <script src="../../js/main.js" type="text/javascript"></script>
  <script src="../../js/register.js" type="text/javascript"></script>
  <script src="../../js/login.js" type="text/javascript"></script>
  <script src="../../js/usersList.js" type="text/javascript"></script>
  <%--<script src="../../js/home.js" type="text/javascript"></script>--%>
  <script type="text/javascript">
    // function prepareHomeData() {
      $('#addingAdressBtn').click(function () {
        let adresData = {
          street: $('#street').val(),
          nrHome: $('#nrHome').val(),
          nrFlat: $('#nrFlat').val(),
          city: $('#city').val(),
          postalCode: $('#postalCode').val(),
          home:{
              id: '66'
          },
          user:{
              id: '28'
          }
        };
          addAdress(adresData);
      })
    // }

     function addAdress(data) {
      $.ajax({
        url: "http://localhost:8080" + '/addAdress',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(data)
      })
              .done(function () {
                window.location.href = "login"
                alert('Udało się dodać adres');
              })
              .error(function () {
                alert('Nie udało się dodać adresu');
              })
     }
  </script>
  </body>
</html>