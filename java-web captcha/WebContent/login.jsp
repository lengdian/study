<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	//解决图片缓存的好办法，在后面添加参数（时间），让每次的参数不一致，缓存就不起作用！！！
	function reload() {
		document.getElementById("image").src = "GetCaptchaImageServlet?id="
				+ new Date().getTime();
	}
</script>
</head>
<body>
	<%-- <%=request.getScheme() %><br>
<%=request.getServerName() %><br>
<%=request.getServerPort() %><br>
<%=request.getContextPath() %> --%>
	<input name="captcha">
	<img alt="验证码" src="GetCaptchaImageServlet" id="image">
	<a href="javascript:reload();">看不清楚</a>

</body>
</html>