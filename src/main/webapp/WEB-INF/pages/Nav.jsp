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
	<nav class="navbar navbar-default">
	<div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="index.jsp" class="hvr-pulse"><img
					src="images/house.png" />TRANG CHỦ </a></li>
			<li><a href="gioithieu.html" class="hvr-pulse">GIỚI THIỆU</a></li>
			<li><a href="#" class="hvr-pulse">SẢN PHẨM </a></li>
			<li><a href="CartController" class="hvr-pulse">GIỎ HÀNG</a></li>

			<li><a href="#" class="hvr-pulse">TƯ VẤN</a></li>
			<li><a href="#" class="hvr-pulse">TIN TỨC</a></li>
			<li><a href="contact.html" class="hvr-pulse">LIÊN HỆ</a></li>
			<li><a href="#" class="hvr-pulse">TUYỂN DỤNG</a></li>
		</ul>

		<s:if test='#session.userName!=null'>
			<ul class="nav navbar-nav">
				<s:if test='#session.userName.username=="admin"'>
					<li><a href="adminview" class="hvr-pulse"><span
							class="glyphicon glyphicon-log-in"></span> Dashboard</a></li>
				</s:if>
				<s:else>
					<li><a href="" class="hvr-pulse"><span
							class="glyphicon glyphicon-user"></span> Logged in as
							${sessionScope.userName.username}</a></li>
				</s:else>

				<li><a href="signout" class="hvr-pulse"><span
						class="glyphicon glyphicon-log-in"></span> Sign Out</a></li>
			</ul>
		</s:if>
		<s:else>
			<ul class="nav navbar-nav">
				<li><a href="signupview" class="hvr-pulse"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="loginview" class="hvr-pulse"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</s:else>


	</div>
	</nav>
</body>
</html>