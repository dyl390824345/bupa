<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>   
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
<meta name="msapplication-TileImage" content="/<%=request.getContextPath() %>assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">

<link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/amazeui.min.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/app.css">
</head>

<body>

<!-- Slider -->
<div class="am-g" align="center">
<img class="am-radius am-img-responsive" src="<%=request.getContextPath() %>/assets/images/imgtest03.jpg"  />
</div>

<!-- gap -->
<div style="height:5px"></div>
<hr style="background-color:#09C; border:none; height:1px">

<!-- select account -->
<div class="am-container" align="center">
<a href="roomer_homepage.html" class="am-btn am-btn-danger">&nbsp;&nbsp;&nbsp;我是房客&nbsp;&nbsp;&nbsp;</a>
<a href="owner_homepage.jsp" class="am-btn am-btn-danger">我是房东</a>
</div>
<script src="<%=request.getContextPath() %>/assets/js/jquery.min.js"></script>
<script src="<%=request.getContextPath() %>/assets/js/amazeui.min.js"></script>
</body>
</html>
