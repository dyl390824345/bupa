<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>租房平台</title>
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />

<!-- Add to homescreen for Chrome on Android -->
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192" href="<%=request.getContextPath() %>/assets/images/app-icon72x72@2x.png">

<!-- Add to homescreen for Safari on iOS -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Amaze UI"/>
<link rel="apple-touch-icon-precomposed" href="<%=request.getContextPath() %>/assets/images/app-icon72x72@2x.png">

<!-- Tile icon for Win8 (144x144 + tile color) -->
<meta name="msapplication-TileImage" content="<%=request.getContextPath() %>/assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">
<link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/amazeui.min.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/app.css">

<script src="<%=request.getContextPath() %>/assets/js/jquery.min.js"></script> 
<script src="<%=request.getContextPath() %>/assets/js/app_account.js"></script>
<script src="<%=request.getContextPath() %>/assets/js/amazeui.min.js"></script>

</head>

<body>

<!-- Header -->
<header data-am-widget="header" class="am-header am-header-fixed">
  <div class="am-header-left am-header-nav"> 
  <a href="javascript:history.go(-1)" class="am-btn"><i class="am-header-icon am-icon-angle-left  am-icon-md"></i></a> </div>
  <h1 class="am-header-title">修改手机号</h1>
  <div class="am-header-right am-header-nav"> 
    <!--<a href="login.html" class="am-btn"><i class="am-header-icon am-icon-user"></i><span class="am-header-nav-title">登录</span> </a> --> 
  </div>
</header>

<!-- gap -->
<div style="height:5px"></div>

<!-- form data -->
<form action="" id="doc-vld-msg">

	<!--  第一段 data-am-modal="{target: '#myalert8'}" -->
	 <ul class="am-list am-collapse admin-sidebar-sub am-in self-list_padding">
	 
	 	<li>&nbsp;用&nbsp;&nbsp;户&nbsp;&nbsp;名:&nbsp;&nbsp;
           <span><font color="#999999">yuweiwei</font></span>
		</li> 

        <li>&nbsp;原手机号:&nbsp;&nbsp;
           <span><font color="#999999">185****5624</font></span>
		</li>        

        <li>&nbsp;新手机号:&nbsp;&nbsp;
           <span><input type="text" placeholder="请输入新的手机号码"></span>
		</li>        
    
        
		<li>&nbsp;验&nbsp;&nbsp;证&nbsp;&nbsp;码:&nbsp;&nbsp;
           <span><input type="text" placeholder="请输入验证码" style="width:100px;"></span>
           <span class="am-margin-right am-fr">
                <input type="button" class="am-btn am-btn-default" value="获取验证码">
           </span>  
		</li>
        
    </ul>

	<!-- gap -->
    <div style="height:10px"></div>
    <button class="am-btn am-btn-danger am-btn-block" type="submit">确认修改</button>

</form>

<!-- 窗口2 -->
<div class="am-modal-actions" id="myaction1" style="background:#f2f2f2;">
  <div class="am-modal-actions-group">
  		<div class="am-container" align="justify">
             <label class="am-radio"><input type="radio" name="radiomyaction1" value="男" data-am-ucheck checked>男</label>
             <label class="am-radio"><input type="radio" name="radiomyaction1" value="女" data-am-ucheck >女</label>
        </div>
  </div>
  <div class="am-modal-actions-group">
    <button class="am-btn am-btn-default am-btn-block" data-am-modal-confirm>确定</button>
  </div>
</div>

</body>
</html>
