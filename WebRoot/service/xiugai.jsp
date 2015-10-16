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
    
    <title>My JSP 'addService.jsp' starting page</title>

   <style type="text/css">
   
   body {
	background-image: url(img/head2.PNG);
   }
    #content{
	width:90%;
	margin:0 auto;
	font-size: 16px;
	margin-left:200px;
	
	}
	

.buttonClass 
{ 

border-right:  #CCC      1px   solid;
background: blue;
border-top:  #CCC   1px   solid; 
font-size:   12pt; 
font-weight:bold;
vertical-align:   middle; 
border-left:  #CCC    1px   solid; 
cursor:   hand; 
border-bottom:    #CCC 1px   solid; 
text-align:   center; 
width:80px;

}
	</style>
  </head>
  
  <body>
  <div id="content">
   <s:form action="baoCun" method="post" namespace="/">
  <table align="center" width="550">
        <tr><td width="200">服务名称</td><td><s:textfield label="服务名称"  name="serviceInfo.serviceName"></s:textfield><br><br>
        <tr><td>服务类型 </td>
            <td> <s:select  label="服务类型"  list='#{"投诉服务":"投诉服务","售前服务":"售前服务","售后服务":"售后服务" }' name="serviceInfo.serviceType"></s:select></td></tr>
        <br><br>
        <tr><td>服务客户</td><td><s:textfield label="服务客户" name="serviceInfo.customerName"></s:textfield></td></tr>
        <tr><td>联系电话</td><td><s:textfield label="联系电话" name="serviceInfo.customerTel"></s:textfield></td></tr>
        <br><br>
        <tr><td>服务内容</td><td><s:textarea  rows="5" cols="50" label="服务内容"  name="serviceInfo.serviceContent"></s:textarea>
        </td></tr>
       
        <tr><td>备注信息</td><td><s:textarea    rows="5" cols="50" label="备注信息" name="serviceInfo.beiZhu" ></s:textarea>
        </td></tr>
        <br><br>
        <tr>
            <td></td>
            <td align="center">
             <input type="hidden"  name="users.id" value="${usersId}">
            <s:hidden name="serviceInfo.id"></s:hidden>
            <s:hidden name="serviceInfo.serviceStatus"></s:hidden>
           
             <s:submit label="修改" value="修改"></s:submit>
               </td><td>
              <a href="fenYeServ" class= "buttonClass" style="color:#FFF" >返回</a>
            </td>
        </tr>
     </table>
</s:form>
 </div>
  </body>
</html>
