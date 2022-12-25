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

$(document).ready(function () {
    $('#ALL').click(function () {
        redirect('userList',{status: "ALL"});
    });
    // $.post('deleteUser', {}, function () {
    //     window.location.reload();
    // })


    $('#AUTHORIZED').click(function () {
        redirect('userList',{status: "AUTHORIZED"});
    });

    $('#BLOCKED').click(function () {
        redirect('userList',{status: "BLOCKED"});
    });
});
