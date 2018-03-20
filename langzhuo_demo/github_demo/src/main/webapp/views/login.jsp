<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0" />
<title>这是一个登陆界面</title>

<script type="text/javascript">
	var result = ${result};
	alert(result);
</script>
</head>
<body>
	<div style="">
		<form id="form" method="post" action="${pageContext.request.contextPath}/ks/login.action">
			用户名:<input type="text" name="username">
			密    码:<input type="password" name="password">
			<button type="submit">登陆</button>
		</form>
	</div>
</body>
</html>