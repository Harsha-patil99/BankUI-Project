<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<c:import url="header.jsp" />
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-2"></div>
			<div class="col-lg-8">
				<div class="form-group">
					<label class="form-label mt-4">LOGIN</label>
					<div class="form-floating mb-3">
						<input type="email" class="form-control" id="floatingInput"
							placeholder="name@example.com"> <label
							for="floatingInput">Email address</label>
					</div>
					<div class="form-floating">
						<input type="password" class="form-control" id="floatingPassword"
							placeholder="Password"> <label for="floatingPassword">Password</label>
					</div>
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>

</body>
</html>