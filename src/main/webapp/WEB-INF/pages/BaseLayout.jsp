<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/login.css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<tiles:insertAttribute name="nav" />
	</div>

	<div class="container">
		<tiles:insertAttribute name="jumbotron" />
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<tiles:insertAttribute name="category" />
				<br> <br>
				<tiles:insertAttribute name="news" />
			</div>
			<div class="col-md-9">
				<tiles:insertAttribute name="carousel" />
				<tiles:insertAttribute name="body" />
			</div>
		</div>
	</div>
	<div class="clearfix visible-lg"></div>
	<div class="container">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
<script src="js/login.js"></script>
</html>