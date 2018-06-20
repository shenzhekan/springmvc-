<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
		<td>角色编号</td>
		<td><c:out value="${role.id}"/></td>
	</tr>
	<tr>
		<td>角色名称</td>
		<td><c:out value="${role.role_name}"/></td>
	</tr>
	<tr>
		<td>角色备注</td>
		<td><c:out value="${role.note}"/></td>
	</tr>
</table>
</body>
</html>