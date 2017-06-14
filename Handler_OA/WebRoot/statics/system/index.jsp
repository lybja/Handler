<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%
	request.setAttribute("ctx", request.getContextPath());
	%>
<!doctype html>
<html>
<head>
<link rel="stylesheet" href="../../common/css/sapar.css" />
<link rel="stylesheet" href="../css/index_inner.css" />

<title>系统</title>
</head>

<body>
<div id="container">
    <div id="bd">
    	<div class="wrap clearfix">
        	<div class="sidebar">
            	<h2 class="sidebar-header"><p>功能导航</p></h2>
                <ul class="nav">
                    <li class="agency"><div class="nav-header"><a href="javascript:;" data-src="system_index.jsp" class="clearfix"><span>人员管理</span><i class="icon"></i></a></div></li>
                  	<li class="konwledge"><div class="nav-header"><a href="javascript:;" data-src="my_info.html" class="clearfix"><span>角色管理</span><i class="icon"></i></a></div></li>
                  	<li class="system"><div class="nav-header"><a href="javascript:;" data-src="airline_info.jsp" class="clearfix"><span>权限管理</span><i class="icon"></i></a></div></li>
                  	
                </ul>
            </div>
            <div class="content">
                <div class="topbar clearfix">
                    <div class="contact clearfix">
                        <a class="wx" href="javascript:;"><img src="../images/wx.png" alt="">微信公众号</a>
                        <a class="qq" href="javascript:;"><img src="../images/QQ.png" alt="">QQ客户</a>
                    </div>
                </div>
            	<iframe src="system_index.html" id="iframe" width="100%" height="100%" frameborder="0"></iframe>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="../../common/js/jquery.js"></script>
<script type="text/javascript" src="../../common/js/sapar.js"></script>
<script type="text/javascript" src="../js/index_inner.js"></script>

</html>
