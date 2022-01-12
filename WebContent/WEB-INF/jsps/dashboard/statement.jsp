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
						<li class="breadcrumb-item active" aria-current="page">Account Statement</li>
					</ol>
				</nav>
				</div>
			</div>
			<div class="col-lg-1"></div>
		</div>
		
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-10">
			 
			 
			 <div class="card border-primary mb-3">
  <div class="card-header">Account Statement</div>
  <div style="font-size:medium;  color: red" > <%=request.getAttribute("msg") %></div>
  <form method="get" action="${pageContext.request.contextPath }/process-statement"> 
  <div class="card-body">
    <h5 class="card-title">Select FROM date from the calendar</h5>
    <p class="card-text">
    You can transfer to the account that belongs only to our bank</p>
    
    <div class="form-group">
   <input class="form-control" type="date" placeholder="select from date" 
   name="startDate" />
</div>

	<hr />
	
	 <h5 class="card-title">Select END date from the calendar</h5>
    <p class="card-text">
    Maximum limit for transfer is 20000</p>
    
    <div class="form-group">
   <input class="form-control" type="date" placeholder="select to date" 
   name="endDate" />
</div>
	
	<br /><br />
	<input type="submit" class="btn btn-primary btn-lg" value="Generate Statement" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="reset" class="btn btn-primary btn-lg" value="reset" />
  </div>
  
  </form>
</div>
			</div>
			<div class="col-lg-1"></div>
		</div>
		<br /><br /> <hr/> <br /><br />
		<div class="row">
			<div class="col-lg-1"></div>
			<div class="col-lg-10"> 
				<table class="table table-hover">
					  <thead>
					    <tr>
					      <th scope="col">Date of Transaction</th>
					      <th scope="col">Transfered From Account</th>
					      <th scope="col">Beneficiary Account</th>
					      <th scope="col">Amount</th>
					      <th scope="col">Operation Type</th>
					    </tr>
					  </thead>
					  <tbody>
					   <c:forEach var="t" items="${list }">
						    <tr class="table-light">
						      <th scope="row"> <c:out value="${t.dateOfTransaction }" /></th>
						      <td><c:out value="${t.accountFrom }" /></td>
						      <td><c:out value="${t.accountTo }" /></td>
						      <td><c:out value="${t.amount }" /></td>
						      <td><c:out value="${t.operationType }" /></td>
						    </tr>
					    </c:forEach>
					  </tbody>
				 </table>	    
			</div>
			<div class="col-lg-1"></div>
		</div>
		
		
	</div>
	<br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br /><br />
</body>
</html>