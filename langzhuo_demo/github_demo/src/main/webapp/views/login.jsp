<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<title>这是一个登陆界面</title>

<!-- 引入JQuery -->
    <script type="text/javascript" src="${pageContext.request.contextPath }easyUI/jquery.min.js"></script>
    <!-- 引入EasyUI -->
    <script type="text/javascript" src="${pageContext.request.contextPath }easyUI/jquery.easyui.min.js"></script>
    <!-- 引入EasyUI的中文国际化js，让EasyUI支持中文 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }easyUI/locale/easyui-lang-zh_CN.js"></script>
    <!-- 引入EasyUI的样式文件-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }easyUI/themes/default/easyui.css" type="text/css"/>
    <!-- 引入EasyUI的图标样式文件-->
    <link rel="stylesheet" href="${pageContext.request.contextPath }easyUI/themes/icon.css" type="text/css"/>

	<link rel="stylesheet" href="${pageContext.request.contextPath }css/style.css" type="text/css" />
	
	<script type="text/javascript">
		function login(){ 
			var username = $("#username").val();
			var password = $("#password").val();
			console.log("用户名"+username+"密码"+password);
			if(username == null || username == ""){
// 				$("#win span").text("用户名不能为空");
// 				$("#win").window('open');
				alert("用户名不能为空");
				return;
			}if(password == null || password == ""){
// 				$("#win span").text("密码不能为空");
// 				$("#win").window('open');
				alert("密码不能为空");
				return;
			}
			  
			$.ajax({
				type:"post",
				url:"${pageContext.request.contextPath}/ks/login.action?username="+username+"&password="+password,
				dataType:"json",
				error:function(data){
// 					$("#win span").text(data);
// 					$("#win").window('open');
					alert(result);
					console.log(data);
				},
				success:function(data){
					var result = data.result;
					alert(result);
					if(result == "success"){
						window.location.href = "${pageContext.request.contextPath}/ks/funcList.action?uid="+username;
					}else{
// 						$("#win span").text(result);
// 						$("#win").window('open');
						alert(result);
						console.log(data);
					}
				}
			
			});
		}
	</script>
</head>
<body>
	<div style="padding: 5px; text-align: center; margin-top: 300px">
		<form id="form" method="post" action="${pageContext.request.contextPath}/ks/login.action">
				<p>
					用户名: <input type="text" name="username" id="username" title="请输入用户名">
				</p>
					密&nbsp;&nbsp;&nbsp;码: <input type="password" name="password" id="password" title="请输入密码">
				</p>
				<div style="padding: 5px; text-align: center;">
					<button class="easyui-linkbutton" icon="icon-ok" onclick="login()">登陆</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<button class="easyui-linkbutton" icon="icon-cancel">退出</button>
				</div>
		</form>
	</div>
	
	<div id="win" class="easyui-window" title="提示" closed="true"  style="width:300px;height:100px;padding:5px;">
    	<span></span>
	</div>
</body>
</html>