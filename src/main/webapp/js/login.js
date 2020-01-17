
const apiUrl = "http://localhost:8080";

function prepareLoginData() {
    $('#loginbtn').click(function () {
        let loginData = {
            email: $('#email').val(),
            pass: $('#pwd').val()
        };
        login(loginData);
    })
}

function login(data) {
    $.ajax({
        url: apiUrl + '/loginUser',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(data)
    })
        .done(function (res) {
            if(res==true)
                alert('Użytkownik zalogował się');
            window.location.href = "usersList"
        })
        .error(function () {
            alert('Nie udało się zalogować');
        })
}

