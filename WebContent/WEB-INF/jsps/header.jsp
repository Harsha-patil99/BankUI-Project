<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyBank</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><span style="color: white;"> AZY-Bank</span></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor01">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link active" href="#">Home
            <span class="visually-hidden">(current)</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Deposit</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Transfer</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Statement</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Settings</a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href="#">Account Settings</a>
            <a class="dropdown-item" href="#">Help</a>
          
          </div>
        </li>
      </ul>
       
       <%
        String username = (String)session.getAttribute("username"); 
         
         if(username == null){
        	%>
        	<a class="btn btn-danger my-2 my-sm-0" href="${pageContext.request.contextPath }/login">Login</a>
        	 
        <% 	 
        }else{
        	%>
        	<span style="font-family: monospace; color: white; font-weight: bold; font-size:x-large; ">Welcome <%=username %></span> 
        	&nbsp;&nbsp;&nbsp; <a class="btn btn-warning my-2 my-sm-0" href="${pageContext.request.contextPath }/logout">Logout</a>
        	<%
        }
       %>  
        
      
    </div>
  </div>
</nav>
</body>
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</html>