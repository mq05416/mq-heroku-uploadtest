<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String err="";
		if (request.getAttribute("err") != null) {
			err = (String) request.getAttribute("err");
		} 
	%>
	<div class="wrapper">
		<form action="login" method="post" name="Login_Form"
			class="form-signin">
			<h3 class="form-signin-heading">Welcome Back! Please Sign In</h3>
			<div style="color: red"><%=err%></div>
			<hr class="colorgraph">
			<br> <input type="text" class="form-control" name="username"
				placeholder="Username" required="" autofocus="" /> <input
				type="password" class="form-control" name="password"
				placeholder="Password" required="" />

			<button class="btn btn-lg btn-primary btn-block" name="Submit"
				value="Login" type="Submit">Login</button>
		</form>
	</div>
</body>
</html>