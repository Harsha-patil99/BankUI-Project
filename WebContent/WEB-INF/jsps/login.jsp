<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 
</head>
<c:import url="header.jsp" />
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-2"></div>
			<div class="col-lg-8">
			
			<sf:form method="post" action="${pageContext.request.contextPath }/process-login" modelAttribute="user">
				<div class="form-group">
					<label class="form-label mt-4">LOGIN</label>
					<div style="font-size:medium;  color: red" > <%=request.getAttribute("msg") %></div>
					<div class="form-floating mb-3">
						<sf:input type="text" class="form-control" id="floatingInput"
							placeholder="name@example.com" path="username" /> <label
							for="floatingInput">Username</label>
					</div>
					<div class="form-floating">
						<sf:input type="password" class="form-control" id="floatingPassword"
							placeholder="Password" path="password" /> <label for="floatingPassword" >Password</label>
					</div>
					<br />
					<button type="submit" class="btn btn-primary">LOGIN</button>
				</div>
				</sf:form>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>

</body>
</html>