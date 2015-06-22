<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.autoinc.dao.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Free Cars-Online Website Template | Home :: w3layouts</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<link href='http://fonts.googleapis.com/css?family=Playball'
	rel='stylesheet' type='text/css'>
<!--slider-->
<script src="js/jquery.min.js"></script>
<script src="js/script.js" type="text/javascript"></script>
<script src="js/superfish.js"></script>
</head>
<body>
	<%
		ProductDetailsDAO pd=new ProductDetailsDAO();
						  	pd=(ProductDetailsDAO)request.getAttribute("product");
						  	
	%>

	<div class="header-bg">
		<div class="wrap">
			<div class="h-bg">
				<div class="total">
					<div class="header">
						<div class="box_header_user_menu">
							<ul class="user_menu">
								<li class="act first"><a href=""><div class="button-t">
											<span>Shipping &amp; Returns</span>
										</div></a></li>
							</ul>
						</div>
						<div class="header-right">
							<ul class="follow_icon">
								<li><a href="#"><img src="images/icon.png" alt="" /></a></li>
								<li><a href="#"><img src="images/icon1.png" alt="" /></a></li>
								<li><a href="#"><img src="images/icon2.png" alt="" /></a></li>
								<li><a href="#"><img src="images/icon3.png" alt="" /></a></li>
							</ul>
						</div>
						<div class="clear"></div>
						<div class="header-bot">
							<div class="logo">
								<a href="index.html"><img src="images/logo.png" alt="" /></a>
							</div>
							<div class="search">
								<input type="text" class="textbox" value=""
									onfocus="this.value = '';"
									onblur="if (this.value == '') {this.value = '';}">
								<button class="gray-button">
									<span>Search</span>
								</button>
							</div>
							<div class="clear"></div>
						</div>
					</div>
					<div class="menu">
						<div class="top-nav">
							<ul>
								<li class="active"><a href="index.html">Home</a></li>
								<li><a href="about.html">About</a></li>
								<li><a href="specials.html">Specials</a></li>
								<li><a href="new.html">New</a></li>
								<li><a href="contact.html">Contact</a></li>
							</ul>
							<div class="clear"></div>
						</div>
					</div>
					<div class="banner-top">
						<div class="header-bottom">
							<div class="header_bottom_right_images">
								<div id="slideshow">
									<ul class="slides">
										<li><a href="details.html"><canvas></canvas><img
												src="images/banner4.jpg"
												alt="Marsa Alam underawter close up"></a></li>
										<li><a href="details.html"><canvas></canvas><img
												src="images/banner2.jpg" alt="Turrimetta Beach - Dawn"></a></li>
										<li><a href="details.html"><canvas></canvas><img
												src="images/banner3.jpg" alt="Power Station"></a></li>
										<li><a href="details.html"><canvas></canvas><img
												src="images/banner1.jpg" alt="Colors of Nature"></a></li>
									</ul>
									<span class="arrow previous"></span> <span class="arrow next"></span>
								</div>
								<div class="content-wrapper">
								  <div class="contact-form">
				  	<h3>Product Details</h3>
					    <form method="post" action="Servlet4">
					    	<div>
						    	<span><label>Modelnumber</label></span>
						    	<span><%=pd.getProduct().getModelnumber() %></span>
						    </div>
						    <div>
						    	<span><label>Brand</label></span>
						    	<span><%=pd.getProduct().getBrand() %></span>
						    </div>
						    <div>
						     	<span><label>Color</label></span>
						    	<span><%=pd.getProduct().getColor() %></span>
						    </div>
						    <div>
						    	<span><label>Manufacturer</label></span>
						    	<span><%=pd.getProduct().getManufacturer()%></span>
						    </div>
						    <div>
						     	<span><label>BodyStyle</label></span>
						    	<span><%=pd.getBodyStyle() %></span>
						    </div>
						    <div>
						    	<span><label>Engine</label></span>
						    	<span><%=pd.getEngine() %></span>
						    </div>
						      <div>
						     	<span><label>BodyStyle</label></span>
						    	<span><%=pd.getBodyStyle() %></span>
						    </div>
						    <div>
						    	<span><label>Mileage</label></span>
						    	<span><%=pd.getMileage() %></span>
						    	
						    </div>
						    <div>
						    	<span><label>Price</label></span>
						    	<span><%=pd.getProduct().getPrice()   %></span>
						    	
						    </div>
						   <div>
						   		<span><input type="submit" value="Check Availability"></span>
						  </div>
					    </form>
				  </div>
								</div>
							</div>
							<div class="header-para">
								<div class="categories">
									<div class="list-categories">
										<div class="first-list">
											<div class="div_2">
												<a href="">Cars</a>
											</div>
											<div class="div_img">
												<img src="images/car1.jpg" alt="Cars" title="Cars"
													width="60" height="39">
											</div>
											<div class="clear"></div>
										</div>
										<div class="first-list">
											<div class="div_2">
												<a href="">Rental</a>
											</div>
											<div class="div_img">
												<img src="images/car2.jpg" alt="Cars" title="Cars"
													width="60" height="39">
											</div>
											<div class="clear"></div>
										</div>
										<div class="first-list">
											<div class="div_2">
												<a href="">Banking</a>
											</div>
											<div class="div_img">
												<img src="images/car3.jpg" alt="Cars" title="Cars"
													width="60" height="39">
											</div>
											<div class="clear"></div>
										</div>
										<div class="first-list">
											<div class="div_2">
												<a href="">Trucks</a>
											</div>
											<div class="div_img">
												<img src="images/car4.jpg" alt="Cars" title="Cars"
													width="60" height="39">
											</div>
											<div class="clear"></div>
										</div>
									</div>
									<div class="box">
										<div class="box-heading">
											<h1>
												<a href="#">Cart:&nbsp;</a>
											</h1>
										</div>
										<div class="box-content">
											Now in your cart&nbsp;<strong> 0 items</strong>
										</div>
									</div>
									<div class="box-title">
										<h1>
											<span class="title-icon"></span><a href="">Branches</a>
										</h1>
									</div>
									<div class="section group example">
										<div class="col_1_of_2 span_1_of_2">
											<img src="images/pic21.jpg" alt="" /> <img
												src="images/pic24.jpg" alt="" /> <img
												src="images/pic25.jpg" alt="" /> <img
												src="images/pic27.jpg" alt="" />
										</div>
										<div class="col_1_of_2 span_1_of_2">
											<img src="images/pic22.jpg" alt="" /> <img
												src="images/pic23.jpg" alt="" /> <img
												src="images/pic26.jpg" alt="" /> <img
												src="images/pic28.jpg" alt="" />
										</div>
										<div class="clear"></div>
									</div>
									<div class="clear"></div>
								</div>
							</div>
							<div class="clear"></div>
							<div class="footer-bottom">
								<div class="copy">
									<p>
										All rights Reserved | Design by <a href="http://w3layouts.com">W3Layouts</a>
									</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
</body>

</html>