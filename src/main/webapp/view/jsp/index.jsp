
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Test</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <script src="../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/bootstrap.min.js"></script>
  </head>
  <body>
  "Hello world"
  <input id="input">
  <button type="button" class="btn btn-success" id="getBtn">Pobierz usera</button>
  <table id="table" class="table table-striped">
    <thead>
    <tr >
      <th scope="col">id</th>
      <th scope="col">imię</th>
      <th scope="col">nazwisko</th>
      <th scope="col">email</th>
    </tr>
    </thead>
  </table>
  <br>
  <p id="demo"></p>
  <script src="../../js/main.js" type="text/javascript"></script>
  <script src="../../js/register.js" type="text/javascript"></script>
  <script src="../../js/login.js" type="text/javascript"></script>
  <script src="../../js/usersList.js" type="text/javascript"></script>
  <script src="../../js/home.js" type="text/javascript"></script>
  <script src="../../js/adress.js" type="text/javascript"></script>
  <%--<script src="../../js/homesList.js" type="text/javascript"></script>--%>
  <script type="text/javascript">

      $('#getBtn').click(function () {
          $.ajax({
              url: "http://localhost:8080" + "/getUser?" + $.param({userId: '1'}),
              method: 'GET',
              dataType: 'json',
              success: function (data) {
                  //alert('User ' + JSON.stringify(data));
                  document.getElementById('demo').innerHTML = JSON.stringify(data);
                  var myObj = data;
                  var userData = '';
                  userData += '<tr>';
                  userData += '<td>' + myObj.id + '</td>';
                  userData += '<td>' + myObj.firstname + '</td>';
                  userData += '<td>' + myObj.lastname + '</td>';
                  userData += '<td>' + myObj.email + '</td>';
                  userData += '</tr>';
                  $('#table').append(userData);
              },
              error: function (xhr) {
                  alert('Coś poszło nie tak!');
              }
          })
      });


//druga wersja
/*      $('#getBtn').click(function () {
          $.get("http://localhost:8080" + "/getUser?" + $.param({userId: '1'}), function (data) {
              //alert('User ' + JSON.stringify(data));
              $('#demo').innerHTML = JSON.stringify(data);
              var myObj = data;
              var userData = '';
              userData += '<tr>';
              userData += '<td>' + myObj.id + '</td>';
              userData += '<td>' + myObj.firstname + '</td>';
              userData += '<td>' + myObj.lastname + '</td>';
              userData += '<td>' + myObj.email + '</td>';
              userData += '</tr>';
              $('#table').append(userData);
          })
      });*/

  </script>
  </body>
</html>
