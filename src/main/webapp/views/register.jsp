<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>${ email }</h3>
	<f:form
		modelAttribute="data"
		action="/fa22b1_sof3021_it17103/register"
	 	method="POST">
	 	<div>
	 		<label>Họ tên</label>
	 		<f:input type="text" name="hoTen" path="hoTen" />
	 		<div style="color: red">
	 			<f:errors path="hoTen" element="small"
	 				delimiter="<br>"></f:errors>
	 		</div>
	 	</div>
	 	<div>
	 		<label>Số điện thoại</label>
	 		<f:input type="text" name="sdt" path="sdt" />
	 	</div>
	 	<div>
	 		<label>Email</label>
	 		<f:input type="email" name="email" path="email" />
	 	</div>
	 	<div>
	 		<label>Password</label>
	 		<f:input type="password" name="password" path="password" />
	 	</div>
	 	<div>
	 		<label>Re-Password</label>
	 		<f:input type="password" name="rePassword" path="rePassword" />
	 	</div>
	 	<div>
	 		<label>Avatar</label>
	 		<f:input type="file" name="avatar" path="avatar" />
	 	</div>
	 	<div>
	 		<label>Địa chỉ</label>
	 		<f:input type="text" name="diaChi" path="diaChi" />
	 	</div>
	 	<div>
	 		<label>Ngày sinh</label>
	 		<f:input type="date" name="ngaySinh" path="ngaySinh" />
	 	</div>
	 	<div>
	 		<label>Giới tính</label>
	 		<f:radiobutton name="gioiTinh" value="1" path="gioiTinh" />
	 		<label>Nam</label>
	 		<f:radiobutton name="gioiTinh" value="0" path="gioiTinh" />
	 		<label>Nữ</label>
	 	</div>
	 	<button>Gửi</button>
	</f:form>
</body>
</html>