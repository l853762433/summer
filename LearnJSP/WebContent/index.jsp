<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>
	<tr><th>Column1</th><th>Column2</th></tr>
	<%for (int i=0;i<10;i++){ %>
	<tr><th>Value1</th><th>Value2</th></tr>
	<%} %>
	</table>
	
	
	
</body>
</html>