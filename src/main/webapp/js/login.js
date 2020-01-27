
// const apiUrl = "http://localhost:8080";
// var globalVariable={
//     test: 'myVar'
// };

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
var firstnameXXX = '';


function prepareLoginData() {
    $('#loginbtn').click(function () {
        let loginData = {
            email: $('#email').val(),
            pass: $('#pwd').val()
        };
        //login(loginData);
        prepareUserData(loginData);

    })
}

function prepareUserData(data) {
    $.ajax({
        url: "http://localhost:8080" + '/getDataLoggedUser',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data:JSON.stringify(data),
        success: function (res) {
            console.log("Res object: ", res);
            console.log("String res", JSON.stringify(res));
            firstnameXXX = JSON.stringify(res);
        }

    });
        /*.done(function (res) {
            console.log("Res object: ", res);
            console.log("String res", JSON.stringify(res));
            return JSON.stringify(res);
        });*/
        /*.error(function () {
            alert('Nie udało się pobrać danych zalogowanego usera');
        })*/
    //window.location.href = "usersList";
    return firstnameXXX;
}

    function login(data) {
    $.ajax({
        url: "http://localhost:8080" + '/loginUser',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(data)
    })
        .done(function (res) {
            console.log("res: ", res);
            if(res==true)
                alert('Użytkownik zalogował się');
            window.location.href = "usersList"
        })
        .error(function (res) {
            console.log("res: ", res);
            if(res==false)
                alert('Nie udało się zalogować');
        })
}

