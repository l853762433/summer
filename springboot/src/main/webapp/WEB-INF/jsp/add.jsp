<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> <c:if test="${product !=null }">修改</c:if><c:if test="${product == null }">添加</c:if>商品</title>
</head>
<body>
<form action="<c:if test="${product !=null }">/product/edit/${product.id }</c:if>
			  <c:if test="${product == null }">/product/add</c:if>" 
	  method="post">
名称：<input type="text" name="name" value="${product.name }"><br/>
规格：<input type="text" name="spec" value="${product.spec }"><br/>
库存件数：<input type="text" name="stock" value="${product.stock }"><br/>
单价：<input type="text" name="price" value="${product.price }"><br/>
<input type="submit" value="<c:if test="${product !=null }">修改</c:if><c:if test="${product == null }">添加</c:if>"><br/>
</form>
</body>
</html>