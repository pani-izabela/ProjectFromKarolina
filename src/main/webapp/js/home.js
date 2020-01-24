
function prepareHomeData() {
    $('#addingHomeBtn').click(function () {
        let homeData = {
            area: $('#area').val(),
            price: $('#price').val(),
            type: $('#type').val()
        };
        addHome(homeData);
    })
}

function addHome(data) {
    $.ajax({
        url: "http://localhost:8080" + '/addHome',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(data)
    })
        .done(function () {
            window.location.href = "login"
            alert('Udało się dodać dom');
        })
        .error(function () {
            alert('Nie udało się dodać domu');
        })
}
