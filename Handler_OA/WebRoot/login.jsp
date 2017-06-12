<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%
	request.setAttribute("ctx", request.getContextPath());
	%>
<!doctype html>
<html>
<head>
<!-- 	<link rel="stylesheet" href="css/login.css" type="text/css"/> -->
	<link rel="stylesheet" href="${ctx }/statics/css/login.css" type="text/css"/>
	
	<title>移动办公自动化系统</title>
</head>
<body>
	<div id="container">
		<div id="bd">
			<div class="login">
			<form id="fm">
            	<div class="login-top"><h1 class="logo"></h1></div>
                <div class="login-input">
                	<p class="user ue-clear">
                    	<label>用户名</label>
                        <input type="text" name="user.name"/>
                    </p>
                    <p class="password ue-clear">
                    	<label>密&nbsp;&nbsp;&nbsp;码</label>
                        <input type="text" name="user.pwd"/>
                    </p>
                </div>
                <div class="login-btn ue-clear">
                	<!-- <a href="login_portal.vhtml" class="btn">登录</a> -->
                	<a href="##" class="btn" id="login">登录</a>
                    <div class="remember ue-clear">
                    	<input type="checkbox" id="remember" />
                        <em></em>
                        <label for="remember">记住密码</label>
                    </div>
                </div>
                </form>
            </div>
		</div>
	</div>
    <div id="ft">CopyRight&nbsp;2016&nbsp;&nbsp;版权所有&nbsp;&nbsp;handler.com专注于ui设计&nbsp;&nbsp;我们是最专业的团队</div>
</body>
<script type="text/javascript" src="common/js/jquery.js"></script>
<script type="text/javascript">
var height = $(window).height();
$("#container").height(height);
$("#bd").css("padding-top",height/2 - $("#bd").height()/2);

$(window).resize(function(){
	var height = $(window).height();
	$("#bd").css("padding-top",$(window).height()/2 - $("#bd").height()/2);
	$("#container").height(height);
	
});

$('#remember').focus(function(){
   $(this).blur();
});

$('#remember').click(function(e) {
	checkRemember($(this));
});

function checkRemember($this){
	if(!-[1,]){
		 if($this.prop("checked")){
			$this.parent().addClass('checked');
		}else{
			$this.parent().removeClass('checked');
		}
	}
}
$(function(){
	$("#login").click(function(){
			$.post(
				"login_login.vhtml",
				$("#fm").serialize(),
				function(r){
					if(r){
						alert("登录成功")
						location="login_portal.vhtml";
					}else{
						alert("账号或密码错误");
					}
				},
				"json"
			
			)
	})
	
})
</script>
</html>
