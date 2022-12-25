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
    $.post("deleteUser", {user_id: userId}, function () {
        console.log("deleteUser");
    }).fail(function () {
        console.log("deleteUser error!");
    });
    window.location.reload();
}

function changeUser(userId) {
    $.post("changeUser", {user_dd: userId}, function () {
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

function approvePassenger(requestId) {
    $.post("approvePassenger", {request_id: requestId}, function () {
        console.log("approvePassenger");
    }).fail(function () {
        console.log("approvePassenger error!");
    });
    window.location.reload();
}

function disapprovePassenger(requestId) {
    $.post("disapprovePassenger", {request_id: requestId}, function () {
        console.log("disapprovePassenger");
    }).fail(function () {
        console.log("disapprovePassenger error!");
    });
    window.location.reload();
}

function completeTrip(tripId) {
    $.post("completeTrip", {trip_id: tripId}, function () {
        console.log("completeTrip");
    }).fail(function () {
        console.log("completeTrip error!");
    });
    window.location.reload();
}

function blockUser(userId) {
    $.post("blockUser", {user_id: userId}, function () {
        console.log("blockUser");
    }).fail(function () {
        console.log("blockUser error!");
    });
    window.location.reload();
}

function unblockUser(userId) {
    $.post("unblockUser", {user_id: userId}, function () {
        console.log("unblockUser");
    }).fail(function () {
        console.log("unblockUser error!");
    });
    window.location.reload();
}
$(document).ready(() => {
    const formElements = document.querySelectorAll('.some_form');

    [...formElements].forEach(formEl => {
        formEl.addEventListener('submit', e => {
            e.preventDefault();

            $.post('createMark', $(formEl).serialize(), function () {
                console.log("createMark");
            }).fail(function () {
                console.log("createMark error!");
            });
        });
    });
});

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
