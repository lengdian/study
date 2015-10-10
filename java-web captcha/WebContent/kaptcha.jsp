<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	<input name="captcha">
	<img alt="验证码" src="KaptchaServlet" id="image">
	<a href="#">看不清楚</a>

	<!-- 后台使用session.getAttribute(com.google.code.kaptcha.	Constants.KAPTCHA_...)获取生成的校验码-->

</body>
</html>