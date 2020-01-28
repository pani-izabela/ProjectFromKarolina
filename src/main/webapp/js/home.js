
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
        data: JSON.stringify(data),
        success: function (res) {
            localStorage.setItem('homeLoggedId', res.id);
            alert('Udało się dodać dom');
            window.location.href = "adress";
        }
    });
}
