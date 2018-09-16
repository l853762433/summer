<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
</head>
<body>
<div align="right" style="margin-right: 150px; margin-bottom: 8px;">
	<input type="button" value="添加" onclick="javascript:window.location.href='/show/add'">
</div>
<table width="100%" border="1px;">
	<thead>
		<tr>
			<th>序号</th>
			<th>名称</th>
			<th>规格/个</th>
			<th>库存件数</th>
			<th>单价/元</th>
			<th>总价/元</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${ productList}" var="list" varStatus="vs">
			<tr align="center">
				<td>${vs.index +1}</td>
				<td>${list.name }</td>
				<td>${list.spec }</td>
				<td>${list.stock }</td>
				<td>${list.price }</td>
				<td>${list.price*list.stock }</td>
				<td><a href="product_delete/${list.id}" style="margin-right: 10px;">删除</a>
					<a href="product_edit/${list.id}">修改</a>
			   </td>
			</tr>
		</c:forEach>
	</thead>
</table>
</body>
</html>