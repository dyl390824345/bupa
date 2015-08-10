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
</head>

<body>

<!-- Header -->
<header data-am-widget="header" class="am-header am-header-fixed">
  <div class="am-header-left am-header-nav"> 
   <a href="javascript:history.go(-1)" class="am-btn"><i class="am-header-icon am-icon-angle-left am-icon-md"></i></a>  </div>
  <h1 class="am-header-title">我的房源</h1>
  <div class="am-header-right am-header-nav">
  <!--<a href="login.html" class="am-btn"><i class="am-header-icon am-icon-user"></i><span class="am-header-nav-title">登录</span> </a> -->
  </div>
</header>

<!-- gap -->
<div style="height:15px"></div>

<div class="am-container" align="center">
<button type="button" class="am-btn am-btn-primary ">&nbsp;&nbsp;在出租&nbsp;&nbsp;</button> &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" class="am-btn am-btn-primary " value="&nbsp;&nbsp;已出租&nbsp;&nbsp;" />
</div>

<!-- gap -->
<div style="height:5px"></div>

<!--  房源列表 -->
<div data-am-widget="list_news" class="am-list-news am-list-news-default">

  <div class="am-list-news-bd">
    <ul class="am-list">
    
      <!--缩略图在标题左边-->
      <li class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left">
        <div class="am-u-sm-4 am-list-thumb">
          <a href="owner_house_info.html">
            <img src="<%=request.getContextPath() %>/assets/images/imgtest01.jpg" alt=""/>
          </a>
        </div>
        
        <div class="am-u-sm-8 am-list-main">
          
            <a href="owner_house_info.html" class="">澳门银座 A号楼 1单元 整租</a>

          <div class="prouduct_list_content">
            <span>两室两厅1卫</span>&nbsp;&nbsp;&nbsp;&nbsp;2000元/月<br>
            <span>武汉市武昌区徐东销品茂</span><br>
            <span class="am-badge am-badge-success">免中介费</span>
          </div>
        </div>
      </li>
      
      <li class="am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-left">
        <div class="am-u-sm-4 am-list-thumb">
          <a href="owner_house_info.html">
            <img src="<%=request.getContextPath() %>/assets/images/imgtest02.jpg"/>
          </a>
        </div>
        <div class=" am-u-sm-8 am-list-main">
          <h3 class="am-list-item-hd">
            <a href="owner_house_info.html" class="">澳门银座 A号楼 1单元 整租</a>
          </h3>
          <div class="prouduct_list_content">
            <span>两室两厅1卫</span>&nbsp;&nbsp;&nbsp;&nbsp;2000元/月<br>
            <span>武汉市武昌区徐东销品茂</span><br>
            <span class="am-badge am-badge-success">免中介费</span>
          </div>
        </div>
      </li>
      
    </ul>
  </div>
</div>
<!-- // 房源列表 -->


<!-- 底部菜单 -->
<div data-am-widget="navbar" class="am-navbar am-cf am-navbar-default">
  <ul class="am-navbar-nav am-cf am-avg-sm-4">
    <li> <a href="owner_homepage.html" class="am-btn am-icon-home am-icon-md"><br>首页</a> </li>
    <li> <a href="owner_message_list.html" class="am-btn am-icon-comments-o am-icon-md"><br>消息</a></li>
   <li> <a href="owner_person_center.html" class="am-btn am-icon-user-secret am-icon-md"><br>我的</a></li>
    <li data-am-modal="{target:'#subMenu_info'}">
     <a class="am-btn am-icon-th-list am-icon-md"><br>更多</a>
     </li>
  </ul>
</div>

<div class="am-modal-actions" id="subMenu_info">
  <div class="am-modal-actions-group">
    <ul class="am-list">
      <li > <a href="#"><i class="am-icon-mars"></i>&nbsp;黑名单管理</a> </li>
      <li > <a href="#"><i class="am-icon-bell"></i>&nbsp;消息提示音</a> </li>
      <li > <a href="#"><i class="am-icon-key"></i>&nbsp;修改密码&nbsp;</a> </li>
      <li > <a href="#"><i class="am-icon-leaf"></i>&nbsp;清除缓存&nbsp;</a> </li>
      <li > <a href="#"><i class="am-icon-tag"></i>&nbsp;意见反馈&nbsp;</a> </li>
      <li > <a href="#"><i class="am-icon-flag"></i>&nbsp;软件评价&nbsp;</a> </li>
      <li > <a href="#"><i class="am-icon-qrcode"></i>&nbsp;关于&nbsp;&nbsp;&nbsp;</a> </li>
    </ul>
  </div>
  <div class="am-modal-actions-group">
    <button class="am-btn am-btn-block" data-am-modal-close>取消</button>
  </div>
</div>

<!-- 底部菜单 end --> 

<script src="<%=request.getContextPath() %>/assets/js/jquery.min.js"></script>
<script src="<%=request.getContextPath() %>/assets/js/amazeui.min.js"></script>
</body>
</html>
