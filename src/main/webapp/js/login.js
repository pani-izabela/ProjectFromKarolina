
var globalVariable= {
    test: "Iza"
};

/*var loggedUser = {
    id: 1,
    firstname: "Olaf",
    lastname: "Green",
    email: loginData.email,
    pass: loginData.pass
};*/


function prepareLoginData() {
    $('#loginbtn').click(function () {
        let loginData = {
            email: $('#email').val(),
            pass: $('#pwd').val()
        };
        prepareUserData(loginData);
        login(loginData);
    })
}

function prepareUserData(data) {
    $.ajax({
        url: "http://localhost:8080" + '/getDataLoggedUser',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        async: false,
        data:JSON.stringify(data),
        success: function (res) {
            localStorage.setItem('userLoggedId', res.id);
        }
    });
}


    function login(data) {
    $.ajax({
        url: "http://localhost:8080" + '/loginUser',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(data),
        success: function (res){
            if(res==true)
                console.log('Użytkownik o id: ' + localStorage.getItem('userLoggedId') + ' zalogował się')
            window.location.href = "usersList"
        },
        error: function (res) {
            if(res==false)
                alert('Nie udało się zalogować');
        }
    })
}

