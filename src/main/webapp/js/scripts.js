function redirect(path, query) {
    const url = [
        window.location.origin,
        'nis',
        path
    ].join('/');

    const queryParams = query ? `?${new URLSearchParams(query).toString()}` : ''

    window.location.href = url + queryParams;
}

function deleteUser(userId) {
    $.post("deleteUser", {userId: userId}, function () {
        console.log("deleteUser");
    }).fail(function () {
        console.log("deleteUser error!");
    });
    window.location.reload();
}

function changeUser(userId) {
    $.post("changeUser", {userId: userId}, function () {
        console.log("deleteUser");
    }).fail(function () {
        console.log("deleteUser error!");
    });
    window.location.reload();
}

function createRequest(tripId) {
    $.post("createRequest", {trip_id: tripId}, function () {
        console.log("createRequest");
    }).fail(function () {
        console.log("createRequest error!");
    });
    window.location.reload();
}

function deleteRequest(requestId) {
    $.post("activeRequests", {request_id: requestId}, function () {
        console.log("deleteRequest");
    }).fail(function () {
        console.log("deleteRequest error!");
    });
    window.location.reload();
}

// $(document).ready(function () {
//     $('#ALL').click(function () {
//         redirect('userList',{status: "ALL"});
//     });
//     // $.post('deleteUser', {}, function () {
//     //     window.location.reload();
//     // })
//
//
//     $('#AUTHORIZED').click(function () {
//         redirect('userList',{status: "AUTHORIZED"});
//     });
//
//     $('#BLOCKED').click(function () {
//         redirect('userList',{status: "BLOCKED"});
//     });
// });
