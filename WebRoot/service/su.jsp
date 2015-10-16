<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'su.jsp' starting page</title>
    
  </head>
  
  <body>
  <s:iterator id="ser" value="list" status="s">
  ${ser.serviceName }
  
  </s:iterator>
   success <br>
   
  </body>
</html>
