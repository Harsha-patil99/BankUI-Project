<%@page import="com.bankui.beans.Transaction"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 
</head>
<c:import url="../header.jsp" />
<body>
	<div class="container-fluid" style="margin-top: 3em">
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-10">
			<div class="alert alert-dismissible alert-warning" style="height: 55px">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="${pageContext.request.contextPath }/dashboard" style="text-decoration: none;">Dashboard</a></li>
						<li class="breadcrumb-item"><a href="${pageContext.request.contextPath }/transfer" style="text-decoration: none;">Transfer</a></li>
						<li class="breadcrumb-item active" aria-current="page">Transfer Confirmation</li>
					</ol>
				</nav>
				</div>
			</div>
			<div class="col-lg-1"></div>
		</div>
		
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-10">
			 
			<% Transaction transaction = (Transaction)request.getAttribute("transaction"); %> 
			 <div class="card border-primary mb-3">
  <div class="card-header">Transfer Confirmation/Success</div>
   <h5>Transferred FROM Account Number: </h5>
    <%=transaction.getAccountFrom() %>
    <h5>Transferred TO Account Number: </h5>
    <%=transaction.getAccountTo() %>
    <h5>Amount: </h5>
    <%=transaction.getAmount() %>
    <h5>Date/Time of Transfer: </h5>
    <%=transaction.getDateOfTransaction() %>
 
</div>
			</div>
			<div class="col-lg-1"></div>
		</div>
	</div>
</body>
</html>