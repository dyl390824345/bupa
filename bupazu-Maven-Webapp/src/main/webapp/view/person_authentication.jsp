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
<script src="<%=request.getContextPath() %>/assets/js/amazeui.min.js"></script>
<script src="<%=request.getContextPath() %>/assets/js/app_photo.js"></script>

</head>

<body>

<!-- Header -->
<header data-am-widget="header" class="am-header am-header-fixed">
  <div class="am-header-left am-header-nav">
   <a href="javascript:history.go(-1)" class="am-btn"><i class="am-header-icon am-icon-angle-left am-icon-md"></i></a>  
  </div>
    <!--<a href="#" class="">
      <i class="am-header-icon am-icon-phone"></i>
    </a>--> 
  </div>
  <h1 class="am-header-title">实名制认证</h1>
  <div class="am-header-right am-header-nav">
  <!--<a href="login.html" class="am-btn"><i class="am-header-icon am-icon-user"></i>
      <span class="am-header-nav-title">登录</span></a> -->
  </div>
</header>

<!-- gap -->
<div style="height:15px"></div>

<!-- 文件选择隐藏 由<a>便签触发 -->
<div class="am-g" style="display:none;">
	<input type="file" id="file_head" onchange="javascript:setImagePreview('file_head','preview');" />
</div>

<div>
	<span style="color:#FF6633">&nbsp;温馨提示:为了给你更好的支付和金融服务。。。。。。。。。</span>
</div>

<!-- gap -->
<div style="height:15px"></div>

<!-- form data -->
<form action="" id="doc-vld-msg">

	<!--  第一段 -->
	 <ul class="am-list am-collapse admin-sidebar-sub am-in">     

        <li>&nbsp;用&nbsp;&nbsp;户&nbsp;&nbsp;账&nbsp;&nbsp;&nbsp;号:&nbsp;&nbsp;
           <span><font color="#999999">yuweiwei</font></span>
		</li>

		 <li>&nbsp;真&nbsp;&nbsp;实&nbsp;&nbsp;姓&nbsp;&nbsp;&nbsp;名:&nbsp;&nbsp;
           <span><input type="text"></span>
		</li> 
		
		<li>&nbsp;身&nbsp;&nbsp;份&nbsp;&nbsp;证&nbsp;&nbsp;&nbsp;号:&nbsp;&nbsp;
           <span><input type="text"></span>
		</li> 
		
		<li>&nbsp;确认身份证号:&nbsp;&nbsp;
           <span><input type="text"></span>
		</li>
		
		<li>&nbsp;手&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;机&nbsp;&nbsp&nbsp;&nbsp;&nbsp;号:&nbsp;&nbsp;
           <span><font color="#999999">18542005624</font></span>
		</li>
		
		<li><a id="idphoto" >&nbsp;上&nbsp;&nbsp;传&nbsp;&nbsp;证&nbsp;&nbsp;&nbsp;件:&nbsp;&nbsp;
		   <span class="am-margin-right">
		   	 <img class="am-img-thumbnail" src="" id="preview" style="background-color:#C63"  width="30px;" height="30px;" /> 
		   </span>
           <span class="am-icon-angle-right right-arrow-icon"></span></a>
		</li>
   
    </ul>

	<!-- gap -->
    <div style="height:10px"></div>
    <button class="am-btn am-btn-danger am-btn-block" type="submit">提&nbsp;&nbsp;交</button>

</form>

<!--  弹出窗口-->
<div class="am-modal am-modal-alert" tabindex="-1" id="updatepictrue">
  <div class="am-modal-dialog">
    <div class="am-modal-hd" style="background:#504E4E;"><font color="#FFFFFF">请选择方式</font></div>
    <div class="am-modal-bd">
		 <ul class="am-list am-collapse am-in">
			<li><a href="#">拍照上传</a></li>
			<li><a href="#">手机相册</a></li>
		 </ul>
    </div>
	
    <div class="am-modal-footer">
      <span class="am-modal-btn">取消</span>
    </div>
  </div>
</div>

</body>
</html>
