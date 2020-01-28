
/*function test() {
    $('#buttonAdress').on("click", function () {
        console.log('Uwaga');
        console.log("globalvariable: ", globalVariable);
        console.log("firsname: ", firstnameXXX);
        console.log("samo id trzeci raz: ", localStorage.getItem('userLoggedId'));
    })
}*/

function getUsersList() {
    $('#button').on("click", function (e) {
        e.preventDefault();

        $.get("http://localhost:8080" + "/getUsers", function (data) {
            $('#table > tbody').empty();
            var users_data = '';
            $.each(data, function (key, value) {
                users_data += '<tr>';
                users_data += '<td id="userId' + key + '">' + value.id + '</td>';
                users_data += '<td>' + value.firstname + '</td>';
                users_data += '<td>' + value.lastname + '</td>';
                users_data += '<td>' + value.email + '</td>';
                users_data += '<td><button id="' + value.id + '" type="button" class="btn btn-success">Usuń</button></td>';
                users_data += '</tr>';
            });
            $('#table > tbody').append(users_data);
            deleteUser(users_data);
        })
    });
 }

function deleteUser() {

        $('.btn-success').click(function () {
            var buttonId = $(this).attr('id');
            var user_Id = buttonId;
            var row = $(this);

            $.ajax({
                url: "http://localhost:8080" + "/deleteUser?" + $.param({userId: user_Id}),
                method: 'DELETE',
                success: function () {
                    row.closest("tr").remove();
                },
                error: function () {
                    alert('Nie udało się usunąć użytkownika o id ' + user_Id + ' , spróbuj ponownie.')
                }
            });
        })
}


function addHomePage() {
    $('#addHomeBtn').on("click", function () {
        console.log("Id zalogowanego usera ", localStorage.getItem('userLoggedId'));
        window.location.href = "home";
    })
}

function getUserHomes() {
    $('#showHomesBtn').on("click", function (e) {
        e.preventDefault();

        var user_Id = localStorage.getItem('userLoggedId');

        $.get("http://localhost:8080" + "/getHomesUser?" + $.param({userId: user_Id}), function (data) {
            $('#tableUserHomes > tbody').empty();
            var user_homes_data = '';
            $.each(data, function (key, value) {
                user_homes_data += '<tr>';
                user_homes_data += '<td>' + value.id + '</td>';
                user_homes_data += '<td>' + value.area + '</td>';
                user_homes_data += '<td>' + value.price + '</td>';
                user_homes_data += '<td>' + value.type + '</td>';
                user_homes_data += '<td>' + value.street + '</td>';
                user_homes_data += '<td>' + value.nrHome + '</td>';
                user_homes_data += '<td>' + value.nrFlat + '</td>';
                user_homes_data += '<td>' + value.city + '</td>';
                user_homes_data += '<td>' + value.code + '</td>';
                user_homes_data += '</tr>';
            });
            $('#tableUserHomes > tbody').append(user_homes_data);
            deleteUser(user_homes_data);
        })
    });
}
