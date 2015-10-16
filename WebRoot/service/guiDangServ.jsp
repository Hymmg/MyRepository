<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showServ.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 <style type="text/css">
    #uds{
	width:90%;
	
	}
	 #se{
	width:8%;
	
	}
	
	</style>

  </head>
  
  <body>
    
    服务名称：${serviceInfo.serviceName }<br>
  服务类型：${serviceInfo.serviceType }
  服务状态:${serviceInfo.serviceStatus }<br>
  待处理人:${serviceInfo.usersByUsersAllocateId.employeName }
  
  <br>
  
  <hr>
 
 <form action="fenPeiServ.action" method="post">
 <select size="10" id="se" name="users.id" >
 <c:forEach items="${map }" var="s" >
<option value="${s.value.id }">${s.value.employeName }</option>
 
 
 </c:forEach>
 </select>

  <input type="hidden" name="serviceInfo.id" value="${serviceInfo.id }">
    <input type="hidden"  name="users.id" value="${usersId}">
  <input type="submit" name="分配" value="分配">
  <a href="goFenPeiMainServ.action">返回</a>
</form> 
  </body>
</html>
