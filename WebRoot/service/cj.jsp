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
    
    <title>My JSP 'cj.jsp' starting page</title>
    
<!--  <link rel="stylesheet" type="text/css" href="cj.css">-->
 
   <style type="text/css">
    #content{
	width:90%;
	margin:auto;
	font-size: 16px;
	margin-top:60px;
	margin-left:100px;
	}
	td{
	text-align: center;
	}
	</style>
	<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
	<script type="text/javascript">
		$(function(){
		
		
		$("#s1").click(function(){
		
		var sta=$(".ra");
	  $.each(sta, function(){
  	if($(this).attr("checked")=="checked"){
  	 var st=	$(this).next().val();
  
  	 if("已提交"==st){
  	 return false;
  	 }
  	 $("#f1").attr("action","goXiuGaiServ.action");
		$("#f1").submit();
  	}
  	
	});
	 
	  
	
		
		});
		$("#s2").click(function(){
		var sta=$(".ra");
	  $.each(sta, function(){
  	if($(this).attr("checked")=="checked"){
  	 var st=	$(this).next().val();
  	 alert("确定要删除？");
  	 if("已提交"==st){
  	 return false;
  	 }
  	 $("#f1").attr("action","quDeleteServ.action");
		$("#f1").submit();
  	}
  	
	});
	 
	  });
	
		
		
		$("#s3").click(function(){
	
		$("#f1").attr("action","quSubmitServ.action");
		$("#f1").submit();
		});
		
		$("#s4").click(function(){
	
		$("#f1").attr("action","showServ.action");
		$("#f1").submit();
		});
		
		});
		function fanYe(ym){
   document.getElementById("dq").value=ym;
   document.getElementById("f2").submit();
   }
   
	
	</script>
  </head>
  
  <body>
  <div id="content">
    <div id="div1" >
    <form action="souSuoServ.action" method="post">
    <table width="700"  align="center" >
  <tr><td>  服务名称<input type="text" name="serviceInfo.serviceName"></td>
      <td> 类型<select id="u127_input" class="text_sketch" name="serviceType">
        <option  value="不限">不限</option>
        <option value="投诉服务">投诉服务</option>
        <option value="售前服务">售前服务</option>
        <option value="售后服务">售后服务</option>
        <option value="咨询服务">咨询服务</option>
      </select></td>
      <td> 状态：<select id="u130_input" class="text_sketch" name="serviceStatus">
        <option  value="不限">不限</option>
        <option value="新创建">新创建</option>
        <option value="已提交">已提交</option>
        <option value="已分配">已分配</option>
        <option value="已处理">已处理</option>
        <option value="已反馈">已反馈</option>
         <option value="已归档">已归档</option>
      </select></td>
      <td><input type="submit" value="查询"></td>
      
      </table>
      </form>
    </div><br>
    <hr width:90%;>
    <br><br>
    
    <div id="div2">
    <table width="700"  align="center" >
    
  <tr> <td> 服务信息列表</td>
       <td> <a href="/CRMproject/service/addService.jsp">添加</a></td>
       <td><input type="submit"  value="修改" id="s1" ></td>
       <td><input type="submit" value="删除" id="s2" ></td>
       <td><input type="submit" value="提交" id="s3"></td>
       <td width=""><input type="submit" value="查看" id="s4"></td>
   </tr>
    </table>
    </div>
    
    <br>
    <div id="div3">
    <form action="" id="f1">
    <table width="800" height="100" border="1" align="center"
			cellpadding="10" cellspacing="0" style="color:#666">
    
    
    <tr><td width="50"></td><td width="40"></td><td width="380">服务名称</td><td width="80">类型</td><td width="80">状态</td><td width="190">最后操作时间</td><td  width="100"  >操作人</td><td width="120">待处理人</td></tr>
  
   <s:iterator id="ser" value="list" status="s">
  
    <tr><td>${s.count }</td><td><input type="radio" class="ra" value="${ser.id }" name="serviceInfo.id" >
    <input type="hidden" id="zt${ ser.id}" value="${ser.serviceStatus }">
    </td><td>${ser.serviceName }</td><td>${ser.serviceType }</td><td>${ser.serviceStatus }</td><td >${ser.lastTime }</td><td>${ser.usersByUsersOperateId.employeName }</td><td>${ser.usersByUsersAllocateId.employeName }</td></tr>
    </s:iterator>
    </table>
    </form>
    
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a  onclick="fanYe(1)">首页</a>
   <a  onclick="fanYe(${zongYe})">末页</a>
   共${zongJiLu }条共${zongYe }页 当前第${dangQianYe }页
   																																																																																																																																										
   <s:if test="dangQianYe!=1">
   <a  onclick="fanYe(${dangQianYe-1})">上一页</a>
   </s:if>
   <s:if test="dangQianYe!=zongYe">
   <a  onclick="fanYe(${dangQianYe+1})">下一页</a>
   </s:if>
   
   <form action="souSuoServ.action" name="f2" method="post" id="f2">
  <input type="hidden" name="serviceInfo.serviceName" value="${serviceInfo.serviceName}">
   <input type="hidden" name="serviceType" value="${serviceType }">
  <input type="hidden" name="serviceStatus" value="${serviceStatus }">
  <input type="hidden" value="${dangQianYe }" name="dangQianYe" id="dq">
   </form>
    </div>
    
    
    </div>
  </body>
</html>
