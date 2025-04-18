<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Order a Java Coffee</title>
</head>
<body>
	<h1>Let's have a Java Coffee!</h1>
	<fieldset>
		<legend>Choose your coffee</legend>
		coffee: ${ coffeeOrder.type }<br/>
		size: ${coffeeOrder.size } <br/>
		sugar: ${coffeeOrder.sugar }<br/>
		${coffeeOrder.info }<br/>
	</fieldset>

</body>
</html>