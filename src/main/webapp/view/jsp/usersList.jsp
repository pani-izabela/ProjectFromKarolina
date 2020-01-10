
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
  <button type="button" id="button" class="btn btn-success">Pobierz listę użytkowników</button>
  <br>
  <br>
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

  <script type="text/javascript">
      const apiUrl = "http://localhost:8080";
      const $btn = $("#button")
      const $table = $(".table table-striped")

    $btn.on("click", function (e) {
        e.preventDefault();

        $.get(apiUrl + "/getUsers", function (data) {
            //$table.empty();
          var users_data = '';
          $.each(data, function (key, value) {
            users_data += '<tr>';
            users_data += '<td>' + value.id + '</td>';
            users_data += '<td>' + value.firstname + '</td>';
            users_data += '<td>' + value.lastname + '</td>';
            users_data += '<td>' + value.email + '</td>';
            users_data += '</tr>';
          });
          $('#table').append(users_data);
        });
    });
  </script>
  </body>
</html>
