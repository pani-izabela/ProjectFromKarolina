
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

      <button type="submit" class="btn btn-success" id="registerBtn">Zarejestruj</button>
    </form>
  </div>
  <br>

  <script type="text/javascript">
    const apiUrl = "http://localhost:8080";
    const $firstname = $('#firstname');
    const $lastname = $('#lastname');
    const $email = $('#email');
    const $password = $('#pwd');
    const $form = $('.form');
    //const $registerBtn = $form.find(":submit");

   $form.on("submit", function(e){
     e.preventDefault();

     $.ajax({
       url: apiUrl + '/addUser',
       method: "POST",
       contentType: "application/json",
       dataType: "json",
       data: JSON.stringify({
         firstname: $firstname.val(),
         lastname: $lastname.val(),
         email: $email.val(),
         pass: $password.val()
       })
     })
             .done(function () {
               alert('Rejestracja udała się!');
             })
             .error(function () {
               alert('Nie udało się');
             })
   })



  </script>
  </body>
</html>
