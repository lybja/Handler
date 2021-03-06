<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    <%
	request.setAttribute("ctx", request.getContextPath());
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=emulateIE7" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta charset="utf-8">
<link rel="stylesheet" href="../../common/css/sapar.css" />
<link rel="stylesheet" type="text/css" href="../../common/css/common.css" />
<script type="text/javascript" src="../../common/js/jquery.js"></script>
<script type="text/javascript" src="../../common/js/sapar.js"></script>
<script type="text/javascript" src="../../common/js/WdatePicker.js"></script>
<title>航空公司信息</title>
</head>

<body>
    <div id="saper-container">
        <div id="saper-hd"></div>
        <div id="saper-bd">
             <div class="subfiled clearfix">
                <h2>权限信息</h2>
            </div>
            <div class="subfiled-content">
                <!--表格开始-->
                <div class="table">

                    <!--表格具体内容-->
                    <div class="table-box">
                        <table>
                            <thead>
                                <tr>
                                    <th>航空公司</th>
                                    <th>二字码</th>
                                    <th>电话</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>四川航空</td>
                                    <td>3U</td>
                                    <td>028-88888888或4008300999</td>
                                </tr>
                                <tr style="background-color: #EFF6FA;">
                                    <td>四川航空</td>
                                    <td>3U</td>
                                    <td>028-88888888或4008300999</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div><!--表格结束-->
            </div>
        </div>
        <div id="saper-ft"></div>
    </div>
    
</body>

<script type="text/javascript">
$('#pagin').pagination(100,{
    callback: function(page){
        alert(page);    
    },
    display_msg: true,
    setPageNo: true
});

</script>
</html>