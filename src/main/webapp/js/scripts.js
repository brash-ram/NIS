function redirect(path, query) {
    const url = [
        window.location.origin,
        'nis',
        path
    ].join('/');

    const queryParams = query ? `?${new URLSearchParams(query).toString()}` : ''

    window.location.href = url + queryParams;
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
