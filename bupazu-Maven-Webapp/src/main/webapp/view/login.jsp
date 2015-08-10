<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>租房平台</title>
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />

<!-- Add to homescreen for Chrome on Android -->
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192"
	href="<%=request.getContextPath()%>/assets/images/app-icon72x72@2x.png">

<!-- Add to homescreen for Safari on iOS -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI" />
<link rel="apple-touch-icon-precomposed"
	href="<%=request.getContextPath()%>/assets/images/app-icon72x72@2x.png">

<!-- Tile icon for Win8 (144x144 + tile color) -->
<meta name="msapplication-TileImage"
	content="<%=request.getContextPath()%>/assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">

<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/amazeui.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/assets/css/app.css">
</head>


<body>

	<!-- Header -->
	<header data-am-widget="header" class="am-header am-header-fixed">
		<div class="am-header-left am-header-nav">
			<a href="javascript:history.go(-1)" class="am-btn"><i
				class="am-header-icon am-icon-angle-left am-icon-md"></i>
			</a>
		</div>
		<h1 class="am-header-title">用户登录</h1>
		<div class="am-header-right am-header-nav">
			<!--<a href="login.html" class="am-btn"><i class="am-header-icon am-icon-user"></i><span class="am-header-nav-title">登录</span> </a> -->
		</div>
	</header>

	<!-- gap -->
		<div>
		<font color='red'>${msg}</font><br>   
	</div>
	<div style="height:30px"></div>
	<form id="loginForm" method="post" action="">
		<!--  user account -->
		<div class="am-container">
			<div class="am-input-group am-input-group-primary">
				<span class="am-input-group-label"><i
					class="am-icon-user am-icon-fw"></i>
				</span> <input type="text" id="name" class="am-form-field"
					placeholder="手机号/邮箱/登录名">
			</div>
		</div>

		<!-- gap -->
		<div style="height:15px"></div>

		<!--  user account password -->
		<div class="am-container">
			<div class="am-input-group am-input-group-success">
				<span class="am-input-group-label"><i
					class="am-icon-key am-icon-fw"></i>
				</span> <input type="password" id="password" class="am-form-field"
					placeholder="账户密码">
			</div>
		</div>

		<!-- gap -->
		<div style="height:20px"></div>

		<!-- select account -->
		<div class="am-container">
			<div class="am-btn-group doc-js-btn-1 am-btn-group-justify"
				data-am-button>
				<label class="am-btn self-btn-default self_bottom"> 
				<input type="radio" name="options" value="1" id="option_1">我是房客 </label> 
				<label class="am-btn self-btn-default"> 
				<input type="radio" name="options" value="2" id="option_2">我是房东/经纪 </label>
			</div>
		</div>

		<!-- gap -->
		<div style="height:10px"></div>

		<!-- login button -->
		<div class="am-container">
			<button type="button" id="login" class="am-btn am-btn-warning am-btn-block"
				 >登&nbsp;&nbsp;录</button>
		</div>
	</form>
	<!-- register or find pwd -->
	<div class="am-container am-padding-top-sm">
		<span class="am-fl"> <a href="#" tppabs="#"
			class="am-text-danger" res="1" onClick="clickResponse(this)"
			title="快速注册">快速注册</a> </span> <span class="am-fr"> <a href="#"
			tppabs="#" class="am-text-danger" res="1"
			onClick="clickResponse(this)" title="忘记密码">忘记密码</a> </span>
	</div>

	<!-- gap -->
	<!--<div style="height:10px"></div>-->
	<hr>

	<!--快捷登录-->
	<div class="login-app am-padding-horizontal-sm">
		<p class="am-padding-bottom-sm">使用第三方账号登录</p>
		<ul>
			<li class="am-fl"><a href="#" class="am-block" title="QQ"></a>
			</li>
			<li class="am-fl"><a href="#" class="am-block" title="微博"></a>
			</li>
			<li class="am-fl"><a href="#" class="am-block" title="微信"></a>
			</li>
			<li class="am-fl"><a href="#" class="am-block" title="支付宝"></a>
			</li>
		</ul>
		<div class="am-cf"></div>
	</div>
	<!--//快捷登录-->


	<!-- 底部菜单 -->
	<div data-am-widget="navbar" class="am-navbar am-cf am-navbar-default">
		<ul class="am-navbar-nav am-cf am-avg-sm-4">
			<li><a href="owner_homepage.html"
				class="am-btn am-icon-home am-icon-md"><br>首页</a></li>
			<li><a href="owner_message_list.html"
				class="am-btn am-icon-comments-o am-icon-md"><br>消息</a>
			</li>
			<li><a href="owner_person_center.jsp"
				class="am-btn am-icon-user-secret am-icon-md"><br>我的</a>
			</li>
			<li data-am-modal="{target:'#subMenu_info'}"><a
				class="am-btn am-icon-th-list am-icon-md"><br>更多</a></li>
		</ul>
	</div>

	<div class="am-modal-actions" id="subMenu_info">
		<div class="am-modal-actions-group">
			<ul class="am-list">
				<li><a href="#"><i class="am-icon-mars"></i>&nbsp;黑名单管理</a></li>
				<li><a href="#"><i class="am-icon-bell"></i>&nbsp;消息提示音</a></li>
				<li><a href="#"><i class="am-icon-key"></i>&nbsp;修改密码&nbsp;</a>
				</li>
				<li><a href="#"><i class="am-icon-leaf"></i>&nbsp;清除缓存&nbsp;</a>
				</li>
				<li><a href="#"><i class="am-icon-tag"></i>&nbsp;意见反馈&nbsp;</a>
				</li>
				<li><a href="#"><i class="am-icon-flag"></i>&nbsp;软件评价&nbsp;</a>
				</li>
				<li><a href="#"><i class="am-icon-qrcode"></i>&nbsp;关于&nbsp;&nbsp;&nbsp;</a>
				</li>
			</ul>
		</div>
		<div class="am-modal-actions-group">
			<button class="am-btn am-btn-block" data-am-modal-close>取消</button>
		</div>
	</div>

	<!-- 底部菜单 end -->	
	<script src="<%=request.getContextPath()%>/assets/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/assets/js/amazeui.min.js"></script>
	<script type="text/javascript">
	  
// 	function login(){
// 		var name = document.getElementById("name").value;
// 		var password = document.getElementById("password").value;	
// 		var yonghushenfenId = document.getElementsByName("options");
// 		var yonghushenfen ;
	
		/*
		for(var i=0;i<yonghushenfenId.length;i++){
			if(yonghushenfenId[0].checked){    
				yonghushenfen=yonghushenfenId[i].value.toString();
				} 
			alert(yonghushenfen) ;
			break ; 
		}
		*/
// 		if(yonghushenfenId[0].checked){    
// 			yonghushenfen=2 ;
// 		} else{
// 			yonghushenfen=1;
// 			}
// 		var parm="name="+name+"&password="+password+"&yonghushenfen="+yonghushenfen;
// 		var url="<%=request.getContextPath()%>/login.do?method=login&"+ parm;
// 		alert(url);
// 		window.location.href=url; 
		
// 	}
$(document).ready(function(){
	$("#login").click(function(){
	var name = document.getElementById("name").value;
		var password = document.getElementById("password").value;
		var yonghushenfenId = document.getElementsByName("options");
		var yonghushenfen ;
		if(yonghushenfenId[0].checked){    
			yonghushenfen=2 ;
		} else{
			yonghushenfen=1;
			}
	$.ajax({
		 type:"POST",   //http请求方式
		 url:"<%=request.getContextPath()%>/login.do?method=login",
		 data:"name="+name+"&password="+password+"&yonghushenfen="+yonghushenfen,
		 dataType:"json",
		 success:function(data) {
		 		alert("登录成功！");
		 		window.location="owner_person_center.jsp";
		 },
		 error:function(data){
		 	alert("用户名和密码不正确!") ;
		 }
	});	
		
	});
	
});
</script>
</body>
</html>
<!-- this is a test html -->