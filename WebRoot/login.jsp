<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>用户登录</title>
<link href="css/user.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.8.0.min.js"></script>
<script src="js/login.js"></script>
</head>

<body>
	<!-- 这里是添加用户界面 -->
	<div style="margin-left:400px;margin-top:150px;width: 600px;">
		<form action="login.action" method="post"
			onsubmit="return submitFun()">
			<h1 style="margin-left: 150px">用户登录</h1>
			<table border="0" cellpadding="1" cellspacing="1" width="100%"
				id="login_table">
				<tr>
					<td width="50px"></td>
					<td align="right" id="td1"><s:text name="loginName"/></td>
					<td align="center"><input id="name" name="name"
						type="text"></td>
					<td align="left" width="250px"><span id="warn_name"
						class="warn_span"><span class="warn_span2">*</span></span></td>
				</tr>
				<tr>
					<td width="50px"></td>
					<td align="right" id="td1"><s:text name="password"/></td>
					<td align="center"><input id="password" name="password"
						type="password"></td>
					<td align="left" width="250px"><span id="warn_password"
						class="warn_span"><span class="warn_span2">*</span></span></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td align="center"><input id="login_button" type="submit"
						value="登录" /></td>
					<td></td>
					<td></td>
				</tr>
                <tr align="center"><td></td><td></td><td>${error }</td><td></td><td></td></tr>
			</table>
		</form>
	</div>
</body>

</html>

