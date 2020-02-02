$(document).ready(function () {
    prepareWantedAdressData();
});

function prepareWantedAdressData() {
    $('#searchBtn').on("click", function (e) {
        let homeData = {
            street: $('#street').val(),
            nrHome: $('#nrHome').val(),
            nrFlat: $('#nrFlat').val(),
            city: $('#city').val(),
            postalCode: $('#postalCode').val()
        };
        prepareAdressData(homeData);
        getHomesByAdress(e);
    });
}

function prepareAdressData(data) {
    $.ajax({
        url: "http://localhost:8080" + '/getDataWantedAdress',
        method: "POST",
        contentType: "application/json",
        dataType: "json",
        data:JSON.stringify(data),
        success: function (res) {
            localStorage.setItem('adressWantedId', res.id);
        }
    });
}

function getHomesByAdress(e) {
    //$('#searchBtn').on("click", function (e) {
        e.preventDefault();

        var adress_Id = localStorage.getItem('adressWantedId');

        $.get("http://localhost:8080" + "/getHomeAdress?" + $.param({adressId: adress_Id}), function (data) {
            $('#tableHomes > tbody').empty();
            var homes_adress_data = '';
            $.each(data, function (key, value) {
                homes_adress_data += '<tr>';
                homes_adress_data += '<td>' + value.id + '</td>';
                homes_adress_data += '<td>' + value.area + '</td>';
                homes_adress_data += '<td>' + value.price + '</td>';
                homes_adress_data += '<td>' + value.type + '</td>';
                homes_adress_data += '<td>' + value.street + '</td>';
                homes_adress_data += '<td>' + value.home + '</td>';
                homes_adress_data += '<td>' + value.flat + '</td>';
                homes_adress_data += '<td>' + value.city + '</td>';
                homes_adress_data += '<td>' + value.code + '</td>';
                homes_adress_data += '</tr>';
            });
            $('#tableHomes > tbody').append(homes_adress_data);
        })
    //});
}

