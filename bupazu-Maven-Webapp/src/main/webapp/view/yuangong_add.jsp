<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  

<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>学生添加</title>  
<mce:script type="text/javascript"><!--   
function turnback(){   
    window.location.href="<%=request.getContextPath() %>/student.do";   
}   
// --></mce:script>  
</head>  
<body>  
<div><c:out value="${addstate}"></c:out></div>  
<form method="post" action="" >  
<table>  
    <tr><td>姓名</td><td><input id="name" name="name" type="text" /></td></tr>  
    <tr><td>密码</td><td><input id="password" name="password"  type="text" /></td></tr>  
    <tr>
    	<td colSpan="2" align="center">
    	<input type="button" onclick="login()" value="提交"/><input type="button"  value="返回" /> </td></tr>  
</table>  
  
</form>  
</body>
<script type="text/javascript">  
function login(){
	var name = document.getElementById("name").value;
	alert(name) ;
	var password = document.getElementById("password").value;
	var parm="name="+name+"&password="+password;
	var url="<%=request.getContextPath() %>/student.do?method=save&"+parm;
	alert(url);
    window.location.href=url;   
}   
  
function del(id){   
$.ajax( {   
    type : "POST",   
    url : "<%=request.getContextPath()%>/student.do?method=del&id=" + id,   
    dataType: "json",   
    success : function(data) {   
        if(data.del == "true"){   
            alert("删除成功！");   
            $("#" + id).remove();   
        }   
        else{   
            alert("删除失败！");   
        }   
    },   
    error :function(){   
        alert("网络连接出错！");   
    }   
});   
}   
</script>  
</html>  