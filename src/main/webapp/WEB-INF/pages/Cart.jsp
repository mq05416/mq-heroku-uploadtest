<%@page import="model.Cart"%>
<%@page import="model.Category"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	

	<div class="panel panel-primary">
		<div class="panel-heading">Shopping cart</div>
		<div class="panel-body">
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th colspan="2">Item Name</th>
						<th>Raw weight</th>
						<th>Price</th>
						<th>Quantity</th>

					</tr>
				</thead>
				<tbody>






					<s:iterator value="#session.cartsSession">

		
						<tr>
							<td><img src='uploads/<s:property value="product.productImg" />' style="display:block;" width="30%" height="30%"  /></td>
							<td><s:property value="product.productName" /></td>
							<td>---g</td>
							<td><s:property value="product.productPrice" /></td>
							<td><s:property value="quantity" />x</td>
						</tr>




					</s:iterator>



					<!-- <tr>
						<td><img src="http://lorempixel.com/40/40/food?L5EddA5"
							class="img-thumbnail" alt="Item description"
							title="Some shop item"></td>
						<td>Royal Hamburger</td>
						<td>1,800g</td>
						<td>$30.00</td>
						<td>2x</td>
					</tr> -->
					<tr>
						<th>Total</th>
						<th>&nbsp;</th>
						<th>&nbsp;</th>
						<th>$68.00</th>
						<td>1x</td>
					</tr>
				</tbody>
			</table>
			<a href="TestController" class="btn btn-primary btn-bg pull-right">View
				and Checkout</a>
		</div>
	</div>
</body>
</html>