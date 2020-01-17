
// const apiUrl = "http://localhost:8080";

function prepareRegisterData() {
    $('#registerBtn').click(function () {
        let registerData = {
            firstname: $('#firstname').val(),
            lastname: $('#lastname').val(),
            email: $('#email').val(),
            pass: $('#pwd').val()
        };
        register(registerData);
    })
}

function register(data) {
    $.ajax({
        url: "http://localhost:8080" + '/addUser',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(data)
    })
        .done(function () {
            alert('Rejestracja udała się!');
        })
        .error(function () {
            alert('Nie udało się');
        })
}
