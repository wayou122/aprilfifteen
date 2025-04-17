<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lottery Numbers</title>
</head>
<body>
	<h1>Here are your lottery numbers</h1>
	<%--numbers是Servlet設定的名稱 --%>
	<p>${numbers}</p>
	<p>second<%=request.getAttribute("numbers") %> </p>
</body>
</html>