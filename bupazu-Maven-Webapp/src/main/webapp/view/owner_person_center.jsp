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
<meta name="msapplication-TileImage" content="<%=request.getContextPath() %>/assets/i/app-icon72x72@2x.png">
<meta name="msapplication-TileColor" content="#0e90d2">
<link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/amazeui.min.css">
<link rel="stylesheet" href="<%=request.getContextPath() %>/assets/css/app.css">
</head>

<body>

<!--  个人中心头部 -->
<div class="am-scrollable-horizontal table-bck-color">
  <table class="am-table am-table-compact" align="center">
    <tbody>
      <tr>
	  	<td></td>
        <td align="center"> 
			 <ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item"> 
					<a href="person_account_info.html">
					 <img class="am-img-thumbnail am-circle" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"/>
					 <h3 class="am-gallery-title" style="color:#FFFFFF">yuweiwei</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
		<td align="center"><a href="owner_message_list.html" style="color:#FFFFFF"><i class="am-icon-comments-o"></i></a></td>
      </tr>

	  <tr class="am-gallery-item" align="center" style="font-size:12px;">
        <td class="td-right-line"><a href="owner_wallet.html" style="color:#FFFFFF">￥0.00<br>我的钱</a></td>
		<td class="td-right-line"><a href="#" style="color:#FFFFFF">0<br>优惠劵</a></td>
		<td ><a href="#" style="color:#FFFFFF">0<br>积分</a></td>
      </tr>

    </tbody>
  </table>
</div>

<div style="height:15px;"></div>

<!--  个人中心菜单项 -->
<div class="am-scrollable-horizontal body-white-bgcolor">
  <table class="am-table am-table-compact self-table-td-active" align="center">
    <tbody>
	
	<!--  第一行 -->
      <tr>
	  	<td class="txt-bottom-line td-right-line">
			<ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item" align="center">
					<a href="owner_houses.html">
					 <!--<img class="am-img-thumbnail am-circle" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"/>-->
					 <i class="am-icon-university am-icon-md" ></i><br>
					 <h3 class="am-gallery-title">我的房源</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
		
        <td class="txt-bottom-line td-right-line">
			<ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item" align="center">
					<a href="owner_contract.html">
					 <!--<img class="am-img-thumbnail am-circle" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"/>-->
					 <i class="am-icon-file-text-o am-icon-md"></i><br>
					 <h3 class="am-gallery-title">我的合同</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
		
		<td class="txt-bottom-line">
			<ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item" align="center">
					<a href="owner_message_list.html">
					 <!--<img class="am-img-thumbnail am-circle" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"/>-->
					 <i class="am-icon-comments am-icon-md"></i><br>
					 <h3 class="am-gallery-title">我的消息</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
      </tr>
	  
	  <!--  第三行 -->
	  <tr>
	  	<td class="txt-bottom-line td-right-line">
			<ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item" align="center">
					<a href="owner_wallet.html">
					 <!--<img class="am-img-thumbnail am-circle" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"/>-->
					 <i class="am-icon-google-wallet am-icon-md" ></i><br>
					 <h3 class="am-gallery-title">我的钱包</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
		
        <td class="txt-bottom-line td-right-line">
			<ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item" align="center">
					<a href="owner_bill.html">
					 <!--<img class="am-img-thumbnail am-circle" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"/>-->
					 <i class="am-icon-indent am-icon-md"></i><br>
					 <h3 class="am-gallery-title">我的账单</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
		
		<td class="txt-bottom-line">
			<ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item" align="center">
					<a href="owner_trade_record.html">
					 <!--<img class="am-img-thumbnail am-circle" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"/>-->
					 <i class="am-icon-ils am-icon-md"></i><br>
					 <h3 class="am-gallery-title">交易记录</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
      </tr>
	  
	  	  <!--  第二行 -->
	  <tr>
	  		
        <td class="txt-bottom-line td-right-line">
			<ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item" align="center">
					<a href="person_account_info.jsp">
					 <!--<img class="am-img-thumbnail am-circle" src="<%=request.getContextPath() %>/assets/images/man.png" style="background-color:#C63"/>-->
					 <i class="am-icon-male am-icon-md"></i><br>
					 <h3 class="am-gallery-title">账号信息</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
		
		<td class="txt-bottom-line td-right-line">
			<ul data-am-widget="gallery" class="am-gallery am-avg-sm-1 am-avg-md-1 am-avg-lg-1 am-gallery-default" >
				<li>
				  <div class="am-gallery-item" align="center">
					<a href="#">
					 <i class="am-icon-users am-icon-md"></i><br>
					 <h3 class="am-gallery-title">我的房客</h3>
					</a> 
				  </div>
				</li>
			</ul>
		</td>
		
		<td class="txt-bottom-line td-right-line">
		</td>
		
      </tr>
	  


    </tbody>
  </table>
</div>


<!-- 底部菜单 -->
<div data-am-widget="navbar" class="am-navbar am-cf am-navbar-default">
  <ul class="am-navbar-nav am-cf am-avg-sm-4">
    <li> <a href="owner_homepage.html" class="am-btn am-icon-home am-icon-md"><br>首页</a> </li>
    <li> <a href="owner_message_list.html" class="am-btn am-icon-comments-o am-icon-md"><br>消息</a></li>
   <li> <a href="owner_person_center.html" class="am-btn am-icon-user-secret am-icon-md am-active"><br>我的</a></li>
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
