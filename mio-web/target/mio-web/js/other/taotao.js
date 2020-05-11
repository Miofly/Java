var TT = TAOTAO = {
	checkLogin : function(){
		var _ticket = $.cookie("TT_TOKEN");
		if(!_ticket){
			return ;
		}
		$.ajax({
			url : "http://localhost:8080/user/token/" + _ticket,
			dataType : "jsonp",
			type : "GET",
			success : function(data){
				if(data.status == 200){
					var username = data.data.username;
					var html ="<span  id='mio-loginUser' class='fa fa-user-circle'>" +
						"</span>"+"<span class='mio-username'>"+username+"</span>"+
						"<span title='退出' id='mio-logoutIcon' onclick='TT.doLogout();' class=\"link-logout fa fa-power-off fa-lg\"></span>";
					$("#loginbar").html(html);
				}
			}
		});

	},
    doLogout:function() {
        var _ticket = $.cookie("TT_TOKEN");
        if(!_ticket){
            return ;
        }
        $.post("/user/logout/"+_ticket,$(".link-logout").serialize(), function(data){
            if(data.status == 200){
                TAOTAO.login();
            } else {
                alert("退出失败！");
            }
        });
    },
    login:function() {
        location.href = "/login";
        return false;
    },
};

$(function(){

	TT.checkLogin();
});