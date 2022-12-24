$("#ALL").click(function(){
    $.post("userList", {status: "ALL"}, function () {})
    window.location.reload();
});

$("#AUTHORIZED").click(function(){
    $.post("userList", {status: "AUTHORIZED"}, function () {})
    window.location.reload();
});

$("#BLOCKED").click(function(){
    $.post("userList", {status: "BLOCKED"}, function () {})
    window.location.reload();
});