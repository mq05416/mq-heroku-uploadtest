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
	<div id="fb-root"></div>
	<script>
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id))
				return;
			js = d.createElement(s);
			js.id = id;
			js.src = "//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.4";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script>

	<h2>Yamaha Supersport YZF-R6 2011</h2>
	
	<img src='uploads/<s:property value="product.productImg" />'
		style="width: 250px; height: 250px; float: left" />

	<p style="font-size: medium">
		<br> <br> Động cơ 600 phân khối, công suất 127 mã lực và chỉ
		nặng 162 kg, YZF-R6 có sức kéo gấp 10 lần so với một chiếc tay ga 110
		phân khối sản xuất đại trà tại Việt Nam.<br> Yamaha nổi tiếng thế
		giới với các loại xe máy "cào cào" và tốc độ. Nhà sản xuất Nhật Bản
		phân chia phân khúc xe máy thành 8 loại, trong đó "đấu sĩ" YZF-R6
		thuộc dòng siêu môtô thể thao (supersport).<br> Đơn giá: Liên hệ
		để biết giá
	</p>


	<br>
	<br>
	<br>
	<br>
	<br>
	<p>
		Mã sản phẩm:
		<s:property value="product.productID" />
		<br> Tên sản phẩm:
		<s:property value="product.productName" />
		<br> Mô tả:
		<s:property value="product.productDesc" />
		<br> <br> Hệ thống khởi động Khởi động bằng điện<br>
		Hộp số 6-Speed constant mesh<br> Khung xe Hợp kim đúc<br>
		Loại Xe Xe Côn<br> Công suất lớn nhất 91 kW @ 14500 vòng/phút<br>
		Tỉ số nén 13.1: 1<br> Momen xoắn lớn nhất 65,7 Nm @ 10500
		vòng/phút<br> Dung tích buồng đốt (cm3)599<br> Hệ thống làm
		mát Làm mát bằng nước<br> Hệ thống xả 1 ống xả<br> Phanh
		trước Phanh đĩa đôi đường kính 310 mm<br> Phanh sau Phanh đĩa đơn
		đường kính 310 mm<br> Hệ thống giảm xóc trước Upside-down
		telescopic fork<br> Hệ thống giảm xóc sau Swingarm<br> Thể
		tích bình nhiên liệu (lít) 17<br> Chiều cao yên (mm) 850<br>
		Kích thước (mm) 1380<br>
	</p>

	<p>
		<a class="btn btn-success"
			href="addItemToCart?productID=<s:property value="product.productID" />"><i
			class="fa fa-shopping-cart"></i> AddToCart</a>
	</p>

	<div class="fb-like"></div>

	<h2>SẢN PHẨM CÙNG LOẠI</h2>
	<div class="col-md-4">
		<a href="http://www.google.com.vn" class="thumbnail">
			<p>Yamaha FZS 2011</p> <img src="images/sp_anh4cungloai/anh0.jpg"
			alt="Pulpit Rock" style="width: 250px; height: 250px">
		</a>
	</div>

	<div class="col-md-4">
		<a href="http://www.google.com.vn" class="thumbnail">
			<p>Yamaha FZ16</p> <img src="images/sp_anh4cungloai/anh1.jpg"
			alt="Pulpit Rock" style="width: 250px; height: 250px">
		</a>
	</div>

	<div class="col-md-4">
		<a href="http://www.google.com.vn" class="thumbnail">
			<p>Yamaha Fazer 150</p> <img src="images/sp_anh4cungloai/anh2.jpg"
			alt="Pulpit Rock" style="width: 250px; height: 250px">
		</a>
	</div>

</body>
</html>