<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>

<head>
<base href="<%=basePath%>">
<title></title>
<link rel="stylesheet" type="text/css" href="css/index.css">

<link rel="stylesheet" type="text/css" href="css/theme.css">
<link rel="stylesheet" href="font-awesome/css/font-awesome.css">

<script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="js/main.js" type="text/javascript"></script>
<script type="text/javascript">
	function skip(url) {
		$("#msgFrame").attr("src", url);
	}
</script>

<style type="text/css">
#line-chart {
	height: 300px;
	width: 800px;
	margin: 0px auto;
	margin-top: 1em;
}

.brand {
	font-family: georgia, serif;
}

.brand .first {
	color: #ccc;
	font-style: italic;
}

.brand .second {
	color: #fff;
	font-weight: bold;
}
</style>
</head>

<body>
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav pull-right">

				<li><a href="#"
					class="hidden-phone visible-tablet visible-desktop" role="button">Settings</a>
				</li>
				<li id="fat-menu" class="dropdown"><a href="#" role="button"
					class="dropdown-toggle" data-toggle="dropdown"> <i
						class="icon-user"></i><s:property value="#session.us.name"/><i class="icon-caret-down"></i>
				</a>

					<ul class="dropdown-menu">
						<li><a tabindex="-1" href="#"><s:property value="#session.us.name"/></a></li>
						<li class="divider"></li>
						<li><a tabindex="-1" class="visible-phone" href="#">个人信息</a>
						</li>
						<li class="divider visible-phone"></li>
						<li><a tabindex="-1" href="index.html">退出</a></li>
					</ul></li>

			</ul>
			<a class="brand" href="index.html"><span class="first">XXX</span>
				<span class="second">客户关系管理系统</span></a>
		</div>
	</div>

	<div class="sidebar-nav">
		<a href="#system-menu" class="nav-header collapsed"
			data-toggle="collapse"><i class="icon-search"></i>系统设置<i
			class="icon-chevron-up"></i></a>
		<ul id="system-menu" class="nav nav-list collapse in">
			<li><a onclick="skip('rolefenYe.action')">角色管理</a></li>
			<li><a onclick="skip('system/page/#')">员工管理</a></li>
			<li><a onclick="skip('system/page/#')">个人信息</a></li>
		</ul>

		<a href="#sale-menu" class="nav-header collapsed"
			data-toggle="collapse"><i class="icon-briefcase"></i>销售管理<i
			class="icon-chevron-up"></i></a>
		<ul id="sale-menu" class="nav nav-list collapse">
			<li><a onclick="skip('sale/page/#')">销售计划</a></li>
			<li><a onclick="skip('sale/page/#')">销售绩效</a></li>
			<li><a onclick="skip('sale/page/#')">机会管理</a></li>
			<li><a onclick="skip('sale/page/#')">联系人管理</a></li>
			<li><a onclick="skip('sale/page/#')">销售分析</a></li>
		</ul>

		<a href="#customer-menu" class="nav-header collapsed"
			data-toggle="collapse"><i class="icon-align-center"></i>客户管理 <i
			class="icon-chevron-up"></i></a>
		<ul id="customer-menu" class="nav nav-list collapse">
			<li><a onclick="skip('customerinfo.action')">客户资源管理</a></li>
			<li><a onclick="skip('customer/page/#')">客户发展计划</a></li>
			<li><a onclick="skip('customer/page/#')">客户价值管理</a></li>
			<li><a onclick="skip('customer/page/#')">客户满意度管理</a></li>
			<li><a onclick="skip('customer/page/#')">客户信誉度管理</a></li>
			<li><a onclick="skip('customer/page/#')">客户关怀</a></li>
		</ul>

		<a href="#service-menu" class="nav-header collapsed"
			data-toggle="collapse"><i class="icon-bell"></i>服务管理<i
			class="icon-chevron-up"></i></a>
		<ul id="service-menu" class="nav nav-list collapse">
			<li><a onclick="skip('fenYeServ.action')">服务创建</a></li>
			<li><a onclick="skip('goFenPeiMainServ.action')">服务分配</a></li>
			<li><a onclick="skip('tackleFenYeServ.action')">服务处理</a></li>
			<li><a onclick="skip('goFeedBackMainServ.action')">服务反馈</a></li>
			<li><a onclick="skip('goGuiDangMainServ.action')">服务归档</a></li>
		</ul>

		<a href="#compact-menu" class="nav-header collapsed"
			data-toggle="collapse"><i class="icon-question-sign"></i>合同管理<i
			class="icon-chevron-up"></i></a>
		<ul id="compact-menu" class="nav nav-list collapse">
			<li><a onclick="skip('init.action?pageFlag=合同创建')">合同创建</a></li>
			<li><a onclick="skip('init.action?pageFlag=合同审核')">合同审核</a></li>
			<li><a onclick="skip('init.action?pageFlag=合同管理')">合同管理</a></li>
		</ul>
		<a href="#statistics-menu" class="nav-header collapsed"
			data-toggle="collapse"><i class="icon-comment"></i>统计分析<i
			class="icon-chevron-up"></i></a>
		<ul id="statistics-menu" class="nav nav-list collapse">
			<li><a onclick="skip('statistics/page/#')">客户构成统计</a></li>
			<li><a onclick="skip('statistics/page/#')">客户流失统计</a></li>
			<li><a onclick="skip('statistics/page/#')">客户贡献统计</a></li>
			<li><a onclick="skip('statistics/page/#')">客户服务统计</a></li>
		</ul>
	</div>
	<div class="content">
		<iframe id="msgFrame" width="100%" height="100%" scrolling="no"></iframe>
	</div>
</body>

</html>