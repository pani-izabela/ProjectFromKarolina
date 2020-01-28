function prepareAdressData() {
$('#addingAdressBtn').click(function () {
    let adresData = {
        street: $('#street').val(),
        nrHome: $('#nrHome').val(),
        nrFlat: $('#nrFlat').val(),
        city: $('#city').val(),
        postalCode: $('#postalCode').val(),
        home:{
            id: localStorage.getItem('homeLoggedId')
        },
        user:{
            id: localStorage.getItem('userLoggedId')
        }
    };
    addAdress(adresData);
})
}

function addAdress(data) {
    $.ajax({
        url: "http://localhost:8080" + '/addAdress',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data: JSON.stringify(data)
    })
        .done(function () {
            window.location.href = "usersList"
            alert('Udało się dodać adres');
        })
        .error(function () {
            alert('Nie udało się dodać adresu');
        })
}