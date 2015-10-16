<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

  </head>
  
  <body>
    <s:form  action="feedBackServ.action" method="post">
    服务名称：${serviceInfo.serviceName }<br>
  服务类型：${serviceInfo.serviceType }
  服务状态:${serviceInfo.serviceStatus }<br>
  待处理人:${serviceInfo.usersByUsersAllocateId.employeName }
  <br>反馈结果<s:select label="反馈结果" list='#{"已反馈":"已反馈","未反馈":"未反馈" }' name="serviceFeedback.feedbackResult"></s:select>
  
  <hr>
 
  
  
  反馈说明"<s:textarea  rows="5" cols="50" label="反馈说明" name="serviceFeedback.feedbackInstruction" >
  </s:textarea>
  <s:hidden name="serviceFeedback.id"></s:hidden>
   <s:hidden name="serviceInfo.id"></s:hidden>
  <s:submit value="保存" label="保存"  id="s1"></s:submit>
    <a href="goFeedBackMainServ" class= "buttonClass" style="color:#FFF" >返回</a>
    
 </s:form>
  </body>
</html>
