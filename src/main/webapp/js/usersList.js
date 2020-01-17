
// const apiUrl = "http://localhost:8080";
/*const $btn = $("#button")
const $table = $("#table")*/

function getUsersList() {
    $('#button').on("click", function (e) {
        e.preventDefault();

        $.get("http://localhost:8080" + "/getUsers", function (data) {
            $('#table').empty();
            var users_data = '';
            $.each(data, function (key, value) {
                users_data += '<tr>';
                users_data += '<td>' + value.id + '</td>';
                users_data += '<td>' + value.firstname + '</td>';
                users_data += '<td>' + value.lastname + '</td>';
                users_data += '<td>' + value.email + '</td>';
                users_data += '<td><button id="deleteBtn' + key + '" type="button" class="btn btn-success">Usuń</button></td>';
                users_data += '</tr>';
            });
            $('#table').append(users_data);
        })
    });
 }

/*function deleteUser() {

        $.delete(apiUrl + "/deleteUser", function (res) {

        })
}*/
