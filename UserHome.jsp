<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
<title>ATHLITIKON!!</title>


<div class="alert alert-success">
<br><br><br>
 <h1> <b> <font size=35> ATHLITIKON! </font></b> <span class="label label-success"> <small> <strong>CUDGEL</strong> your dreamz!!!</small> </span></h1>   
  </div>
  
  
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1"> 
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style> 
 
  
  .carousel-inner > .item > img,{
  .carousel-inner > .item > a > img 
      width: 100%;
      margin:auto;
  
  }
  </style>
</head>
<body>



<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      
    </div>
          
       
        <ul class="nav navbar-nav navbar-right ">
        <li><a href="ManageProducts">Products</a></li>
       
       <li><a href="LogoutSuccess"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
       
              
       
      
      <li><a href=""></a></li>
     </ul>
  </div>
</nav>
 
<div class="container-fluid">
  
    <div class="center-block">  
    
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
    
   <!-- Wrapper for slides -->
    
    
    <div class="carousel-inner" role="listbox">
    
    
    
    
      <div class="item ">
         <img class="img-responsive" src="<c:url value="/resources/images/image11.jpg"/>" alt="watch" style="width:10000px; height:1000px">
         <div class="carousel-caption">
          <h3>Any Thing You Need</h3>
          <p>We provide all sports equipments!</p>
        </div>
      </div>

      <div class="item active">
        <img class="img-responsive" src="<c:url value="/resources/images/image2.jpg"/>" alt="watch" style="width:10000px; height:1000px">
        <div class="carousel-caption">
          <h3>Any Kit</h3>
          <p>Kits available in any brand you needed</p>
        </div>
      </div>
    
      <div class="item">
        <img class="img-responsive" src="<c:url value="/resources/images/image7.jpg"/>" alt="watch" style="width:10000px;height:1000px">
        <div class="carousel-caption">
          <h3>Highly Qualified</h3>
          <p>Quality defined by us!</p>
        </div> 
      </div>
      
     
      
      
       
          <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div></div></div>
 
<div class="container">
            
  <div class="row">
    <div class="col-md-4">
          <br><br><br>
          
         <img src="<c:url value="/resources/images/image3.jpg"/>" alt="Pulpit Rock" style="width:300px;height:150px">
         
             </div>
             
           <br><br><br>
    <div class="col-md-4">
           
         <img src="<c:url value="/resources/images/image4.jpg"/>" alt="Mustiers Sainte Marie" style="width:300px;height:150px">
         
    </div>
    <div class="col-md-4">
           <img src="<c:url value="/resources/images/image6.jpg"/>" alt="Cinque Terre" style="width:300px;height:150px">
      
    </div>
  </div>
</div>
</body>
</html>