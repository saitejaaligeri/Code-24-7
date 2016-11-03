<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">

<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<title>Products</title>

<div class="alert alert-success">
<br><br><br>
 <h1> <b> <font size=35> ATHLITIKON! </font></b> <span class="label label-success"> <small> <strong>CUDGEL</strong> your dreamz!!!</small> </span></h1>   
  </div>


</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
    
       <a class="navbar-brand" href="Home"> Home</a>
       </div>
  
    <ul class="nav navbar-nav navbar-right">   
     <li style=padding-left:800><a href="Register"><span class="glyphicon glyphicon-user"></span>Sign up</a></li>
      <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
   </ul>
  </div>
</nav>
 
<h2>ATHLITIKON!</h2>

<div class="container">
<div ng-app="myApp" ng-controller="customersCtrl">
<table class="table table-striped table-hover">
  <tr>
       
       <th>Product Name</th>
       <th>Product Price</th>
       <th>Product Description</th>
       <th>Action</th>
  </tr>
  <tr ng-repeat="x in names | filter:searchBy">
   
    <td>{{x.Name}}</td>
    <td>{{x.Price}}</td>
    <td>{{x.Description}}</td>
    <td>
    <a href="${pageContext.servletContext.contextPath}/VPU?id={{x.id}}" class="btn btn-info"class="btn btn-info"><span>View</span></a>
    
   </td>  
  </tr>
</table>


</div>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
    $http.get("list")
    .then(function (response) {$scope.names = response.data;});
});
</script>
</div>
	<footer class="container-fluid text-center">
		<p>ATHILITIKON!-All Rights Reserved</p>
		<P>2016</P>
	</footer>

</body>
</html>



