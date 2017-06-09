<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%
	request.setAttribute("ctx", request.getContextPath());
	%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="${ctx }/common/css/sapar.css"  type="text/css"/>
<link rel="stylesheet" href="${ctx }/statics/css/index.css" type="text/css"/>

<title>Handler OA自动化系统</title>
</head>

<body>
<div id="container">
	<div id="hd">
    	<div class="hd-wrap clearfix">
        	<div class="top-light"></div>
            <h1 class="logo"></h1>
            <ul class="main-nav clearfix">
                <li class="current" data-src="statics/system/index.jsp"><a href="javascript:;">系统(lyb)</a></li>
                <li data-src="${ctx }/statics/ticket/index.html"><a href="javascript:;">人事(zl)</a></li>
                <li data-src="${ctx }/statics/msg/index.html"><a href="javascript:;">个人办公(gyq)</a></li>
                <li data-src="${ctx }/statics/msg/index.html"><a href="javascript:;">公文管理(gyq)</a></li>
                <li data-src="${ctx }/statics/xingchengdan/index.html"><a href="javascript:;">行政管理(wsf)</a></li>
                <li data-src="${ctx }/statics/insurance/index.html"><a href="javascript:;">公共信息(wsq)</a></li>
                <li data-src="${ctx }/statics/insurance/index.html"><a href="javascript:;">公共信息(wsq)</a></li>
                <li data-src="${ctx }/statics/user/index.html"><a href="javascript:;">资产管理(ngs)</a></li>
                <li data-src="${ctx }/statics/caiwu/index.html"><a href="javascript:;">财务</a></li>
            </ul>
            <div class="notice clearfix">
                <ul class="clearfix">
                    <li class="current"><a href="javascript:;">关于客票行程单打印通知</a></li>
                    <li><a href="javascript:;">关于网银付款升级通知</a></li>
                    <li><a href="javascript:;">关于客票行程单打印通知</a></li>
                </ul>
                <div class="notice-btn">
                    <a href="javascript:;" class="prev"></a>
                    <a href="javascript:;" class="next"></a>
                </div>
            </div>
            <div class="toolbar">
                <div class="login-info clearfix">
                    <div class="welcome clearfix"><span>欢迎您,</span><a href="javascript:;" class="user-name">Admin</a></div>
                    <div class="login-msg clearfix">
                        <a href="javascript:;" class="msg-txt">消息</a>
                        <a href="javascript:;" class="msg-num">10</a>
                    </div>
                </div>
                <div class="tool clearfix">
                    <a class="tips" href="javascript:;">合作须知</a>
                    <a class="tips" href="javascript:;">购票协议</a>
                    <a href="javascript:;" class="help-btn">帮助</a>
                    <a href="javascript:;" class="quit-btn exit">退出</a>
                </div>
            </div>          
        </div>
    </div>
    <div id="bd">
    	<div class="wrap clearfix">
        	
     <iframe src="${ctx }/statics/system/index.jsp" id="iframe" width="100%" height="100%" frameborder="0"></iframe>
 </div>
 </div>
    <div id="ft" class="clearfix">
    	<div class="ft-left">
            <span>Handler OA自动化系统</span>
            <em>Office&nbsp;System</em>
        </div>
        <div class="ft-right">
            <span>Automation</span>
            <em>V2.0&nbsp;2014</em>
        </div>
    </div>
</div>
<div class="exitDialog">
	<div class="dialog-content">
    	<div class="ui-dialog-icon"></div>
        <div class="ui-dialog-text">
        	<p class="dialog-content">你确定要退出系统？</p>
            <p class="tips">如果是请点击“确定”，否则点“取消”</p>
            
            <div class="buttons">
                <input type="button" class="button long2 ok" value="确定" />
                <input type="button" class="button long2 normal" value="取消" />
            </div>
        </div>
        
    </div>
</div>
</body>
<script type="text/javascript" src="${ctx }/common/js/jquery.js"></script>
<script type="text/javascript" src="${ctx }/common/js/sapar.js"></script>
<script type="text/javascript" src="${ctx }/statics/js/index.js"></script>

</html>
