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
		String err = "";
		if (request.getAttribute("err") != null) {
			err = (String) request.getAttribute("err");
		}
	%>
	<div class="row  pad-top">

		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<strong> Đăng ký thành viên </strong>
				</div>
				<div class="panel-body">
					<form action="register" method="POST">
						<br />
						<div style="color: red"><%=err%></div>
						<div class="form-group input-group">
							<span class="input-group-addon"><i
								class="fa fa-circle-o-notch"></i></span> <input type="text"
								class="form-control" placeholder="Your Name" name="fullname" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon"><i class="fa fa-tag"></i></span>
							<input type="text" class="form-control"
								placeholder="Desired Username" name="username" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon">@</span> <input type="text"
								class="form-control" placeholder="Your Email" name="email" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon"><i class="fa fa-lock"></i></span>
							<input type="password" class="form-control"
								placeholder="Enter Password" name="password" />
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon"><i class="fa fa-lock"></i></span>
							<input type="password" class="form-control"
								placeholder="Retype Password" name="password2"/>
						</div>

						<input type="submit" class="btn btn-success " value="Submit" />
						<hr />
						Already Registered ? <a href="#">Login here</a>
					</form>


				</div>

				

			</div>
		</div>


	</div>
</body>
</html>