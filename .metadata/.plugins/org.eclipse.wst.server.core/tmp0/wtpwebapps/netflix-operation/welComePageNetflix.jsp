<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bootstrap 4 Example</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"52011",secure:"52020"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>


<body
	background="C:/Users/bhara/eclipse-workspace/netflix-operation/src/main/webapp/img/lofoten-fishing-village-nordland-county-norway-europe-mountains-geography.jpg" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-2" data-genuitec-path="/netflix-operation/src/main/webapp/welComePageNetflix.jsp">
	<div class="container-fluid" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-2" data-genuitec-path="/netflix-operation/src/main/webapp/welComePageNetflix.jsp">
		<h1 style="color: red; float: left; display: inline;">
			<strong>NETFLIX</strong>
		</h1>
	</div>
	<ul class="nav" style="float: right; padding: 20px 20px 0 20px">
		<li class="nav-item">
			<button type="button" class="btn btn-danger">Sign In</button>
		</li>
	</ul>
	<br>

	<div class="container-fluid" style="float: left;">
		<div class="col-sm-6" style="padding: 90px 0 0 0">
			<h1 style="font-size: 42px; color: #ffffff;">See What's Next.</h1>
			<h2 style="font-size: 28px; color: #ffffff;">WATCH ANYWHERE.
				CANCEL ANYTIME.</h2>
			<button type="button" class="btn btn-danger">JOIN FREE FOR A
				MONTH</button>
		</div>
	</div>
	<br>
	<div class="container"  style="display:inline;">
		
			<button type="button" class="btn btn-info" align="center" data-toggle="collapse" data-target="#demo">Simple collapsible</button>
			<div id="demo" class="collapse">Lorem ipsum dolor sit amet,
				consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
				labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
				exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat.
			</div>
			<button type="button" class="btn btn-info" align="center" data-toggle="collapse" data-target="#demo">Simple	collapsible</button>
			<div id="demo" class="collapse">Lorem ipsum dolor sit amet,
				consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
				labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
				exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat.
			</div>
			<button type="button" class="btn btn-info" align="center" data-toggle="collapse" data-target="#demo">Simple collapsible</button>
			<div id="demo" class="collapse">Lorem ipsum dolor sit amet,
				consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
				labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
				exercitation ullamco laboris nisi ut aliquip ex ea commodo
				consequat.
			</div>
		</div>
		<br>
	<div id="myCarousel" class="carousel-slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
       <li data-target="#myCarousel" data-slide-to="3"></li>
        <li data-target="#myCarousel" data-slide-to="4"></li>
         <li data-target="#myCarousel" data-slide-to="5"></li>
          <li data-target="#myCarousel" data-slide-to="6"></li>
           <li data-target="#myCarousel" data-slide-to="7"></li>
            <li data-target="#myCarousel" data-slide-to="8"></li>
             <li data-target="#myCarousel" data-slide-to="9"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="1.jpg" class="img-fluid" style="width:20%;">
      </div>
      <div class="item">
        <img src="2.jpg" class="img-fluid" style="width:20%;">
      </div>
      <div class="item">
        <img src="3.jpg" class="img-fluid" style="width:20%;">
      </div>
       <div class="item ">
        <img src="4.jpg" class="img-fluid" style="width:20%;">
      </div>
       <div class="item ">
        <img src="5.jpg" class="img-fluid" style="width:20%;">
      </div>
       <div class="item ">
        <img src="6.jpg" class="img-fluid" style="width:20%;">
      </div>
       <div class="item">
        <img src="7.jpg" class="img-fluid" style="width:20%;">
      </div>
       <div class="item">
        <img src="8.jpg" class="img-fluid" style="width:20%;">
      </div>
       <div class="item">
        <img src="9.jpg" class="img-fluid" style="width:20%;">
      </div>
      <div class="item">
        <img src="10.jpg" class="img-fluid" style="width:20%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
		
	<%@ include file="footerNetflix.jsp"%>
</body>

</html>