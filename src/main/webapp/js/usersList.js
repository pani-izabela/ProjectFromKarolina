
// const apiUrl = "http://localhost:8080";
/*const $btn = $("#button")
const $table = $("#table")*/


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
