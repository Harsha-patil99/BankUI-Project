<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
.content {
	margin-top: 4em;
}
a{
	color: black;

}
a:link {
	color: black;
	
}

a:active {
	color: black;
}

a:hover {
	color: grey;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<c:import url="header.jsp" />
<body>
	<div class="container">
		<div class="content">

			<div class="row">

				<div class="col-sm-4">
					<a href="${pageContext.request.contextPath }/transfer" style="text-decoration: none; ">
						<div class="card bg-light mb-3"
							style="max-width: 20rem;">

							<div class="card-body">
								<h4 class="card-title">Account Transfer</h4>
								<p class="card-text">Transfer the amount from one account to another. <br />
								Max limit allowed: 50K</p>
							</div>
						</div>
					</a>
				</div>
				<div class="col-sm-4">
					<a href="${pageContext.request.contextPath }/deposit" style="text-decoration: none; ">
						<div class="card bg-light mb-3"
							style="max-width: 20rem;">

							<div class="card-body">
								<h4 class="card-title">Deposit Amount</h4>
								<p class="card-text">Deposit the amount in the account.<br /> Maximum limit per
								transaction is INR 2,00,000. </p>
							</div>
						</div>
					</a>
				</div>
				<div class="col-sm-4">
					<a href="${pageContext.request.contextPath }/statement" style="text-decoration: none; ">
						<div class="card bg-light mb-3"
							style="max-width: 20rem;">

							<div class="card-body">
								<h4 class="card-title">Account Statement</h4>
								<p class="card-text">Get transaction details of your account filtered by custom dates.</p>
							</div>
						</div>
					</a>
				</div>
				
				
			</div>
			
			<br /><br /><br />
			
			<div class="row">

				<div class="col-sm-4">
					<a href="${pageContext.request.contextPath }/balance" style="text-decoration: none; ">
						<div class="card bg-light mb-3"
							style="max-width: 20rem;">

							<div class="card-body">
								<h4 class="card-title">Account Balance</h4>
								<p class="card-text">Transfer the amount from one account to another. <br />
								Max limit allowed: 50K</p>
							</div>
						</div>
					</a>
				</div>
				<div class="col-sm-4">
					<a href="${pageContext.request.contextPath }/settings" style="text-decoration: none; ">
						<div class="card bg-light mb-3"
							style="max-width: 20rem;">

							<div class="card-body">
								<h4 class="card-title">Account Settings</h4>
								<p class="card-text">Deposit the amount in the account.<br /> Maximum limit per
								transaction is INR 2,00,000. </p>
							</div>
						</div>
					</a>
				</div>
				<div class="col-sm-4">
					<a href="${pageContext.request.contextPath }/help" style="text-decoration: none; ">
						<div class="card bg-light mb-3"
							style="max-width: 20rem;">

							<div class="card-body">
								<h4 class="card-title">Help/FAQ</h4>
								<p class="card-text">Get transaction details of your account filtered by custom dates.</p>
							</div>
						</div>
					</a>
				</div>
				
				
			</div>
			
		</div>
	</div>
</body>
</html>