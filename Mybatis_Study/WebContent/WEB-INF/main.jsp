<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<b>内容列表</b>
	<hr>
	<form action="ListServlet" method="post">
		指令名称： <input type="text" name="command" value="${command}">
		描述： <input type="text" name="description" value="${description }">
		<input type="submit" value="查询">
		<table>
			<tr>
				<th><input type="checkbox"></th>
				<th>序号</th>
				<th>指令名称</th>
				<th>描述</th>
				<th>回复</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${commandList}" var="command">
				<tr>
					<td><input type="checkbox"></td>
					<td>${command.id}</td>
					<td>${command.command }</td>
					<td>${command.description}</td>
					<td>${command.content }</td>
					<td><a href="#">修改</a> <a href="#">删除</a></td>
				</tr>
			</c:forEach>

		</table>
	</form>

</body>
</html>