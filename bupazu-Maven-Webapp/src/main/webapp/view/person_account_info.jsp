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
  <h1 class="am-header-title">我的账号</h1>
  <div class="am-header-right am-header-nav"> 
    <!--<a href="login.html" class="am-btn"><i class="am-header-icon am-icon-user"></i><span class="am-header-nav-title">登录</span> </a> --> 
  </div>
</header>

<!-- 文件选择隐藏 由<a>便签触发 -->
<div class="am-g" style="display:none;">
	<input type="file" id="file_head" onchange="javascript:setImagePreview('file_head','preview');" />
</div>

<!-- gap -->
<div style="height:5px"></div>

<!-- form data -->
<form action="" id="doc-vld-msg">

	<!--  第一段 data-am-modal="{target: '#myalert8'}" -->
	 <ul class="am-list am-collapse admin-sidebar-sub am-in" >
        <li><a id="idphoto">&nbsp;我的图像:&nbsp;&nbsp;
		   <span class="am-margin-right">
		   	 <img class="am-img-thumbnail" id="preview" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"  width="30px;" height="30px;" /> 
		   </span>
           <span class="am-icon-angle-right right-arrow-icon"></span></a>
		</li>

        <li><a href="nickname_modify.html">&nbsp;昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称:&nbsp;&nbsp;
           <span><font color="#999999">yuweiwei</font></span>
           <span class="am-icon-angle-right right-arrow-icon"></span></a>
		</li>        

        <li><a href="person_sign_modify.html">&nbsp;个人签名:&nbsp;&nbsp;
           <span><font color="#999999">请输入个人签名</font></span>
           <span class="am-icon-angle-right right-arrow-icon"></span></a>
		</li>        
    
        <li><a  id="id-myaction1">&nbsp;性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:&nbsp;&nbsp;
           <span id="txt-myaction1"><font color="#999999">男</font></span>
           <span class="am-icon-angle-right right-arrow-icon"></span></a>
		</li>
        
        <li><a id="id-myalert2">&nbsp;年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄:&nbsp;&nbsp;
           <span id="txt-myalert2"><font color="#999999">105岁</font></span>
           <span class="am-icon-angle-right right-arrow-icon"></span></a>
		</li>
        
        <li><a href="phonenumber_modify.jsp">&nbsp;手机认证:&nbsp;&nbsp;
           <span><font color="#999999">185****5624</font></span>
           <span class="am-icon-angle-right right-arrow-icon"></span></a>
		</li>     
		
		<li><a href="person_authentication.jsp">&nbsp;实名认证:&nbsp;&nbsp;
           <span><font color="#999999">未认证</font></span>
           <span class="am-icon-angle-right right-arrow-icon"></span></a>
		</li> 
        
    </ul>

	<!-- gap -->
    <div style="height:10px"></div>
    <button class="am-btn am-btn-danger am-btn-block" type="submit">退&nbsp;&nbsp;出</button>

</form>



<!-- 窗口2 -->
<div class="am-modal-actions" id="myaction1" style="background:none;">
   <div class="am-modal-actions-group">
	<ul class="am-list">
      <li> <a ><input type="radio" name="radiomyaction1" value="男">&nbsp;男&nbsp;</a> </li>
      <li> <a ><input type="radio" name="radiomyaction1" value="女">&nbsp;女&nbsp;</a> </li>
    </ul>
  </div>	

  <div class="am-modal-actions-group">
    <button class="am-btn am-btn-block" data-am-modal-confirm>确定</button>
  </div>
</div>

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
