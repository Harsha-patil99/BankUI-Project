<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:import url="header.jsp" />
 

<div class="container-fluid">
	<div class="row">
		<div class="col-lg-2"> </div>
	  	<div class="col-lg-8">
	  		
	  		<sf:form method="post" action="${pageContext.request.contextPath}/create-account" modelAttribute="customer">
  <fieldset>
    <legend>Account Creation</legend>
     
    <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">Name</label>
      <sf:input type="text" class="form-control" id="exampleInputEmail1" 
      		aria-describedby="emailHelp" path="name"
     	 	placeholder="Enter full name" />
     	 	
      <small id="emailHelp" class="form-text text-muted">This should match with your name from Pan Card </small>
    </div>
     
     <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">City</label>
      <sf:input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" 
      placeholder="Enter city" path="city" />
     </div>
    
    <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">Address</label>
       <sf:textarea class="form-control" path="address"  aria-describedby="addressHelp" /></textarea>
             <small id="addressHelp" class="form-text text-muted">This should match with your address from aadhar card </small>
       
     </div>
     
     <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">Pan Number</label>
      <sf:input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" 
      placeholder="Enter your pan number" path="panNumber" />
      	
     </div>
     
     <hr>
     <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">Username</label>
      <sf:input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" 
      placeholder="Enter your username" path="userInfo.username" />
      	
     </div>
     
     <div class="form-group">
      <label for="exampleInputEmail1" class="form-label mt-4">Password</label>
      <sf:input type="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" 
      placeholder="Enter your password" path="userInfo.password" />
      	
     </div>
       <br /><br />
    <button type="submit" class="btn btn-primary">Create Account</button>
   
  </fieldset>
</sf:form>
	  		
	  	</div>
	  	<div class="col-lg-2"> </div>
	</div>
</div>
</body>
</html>