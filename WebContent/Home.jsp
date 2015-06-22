<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.autoinc.dao.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>AutoInc Factory</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Playball'
	rel='stylesheet' type='text/css'>
<!--slider-->
<script src="js/jquery.min.js"></script>
<script src="js/script.js" type="text/javascript"></script>
<script src="js/superfish.js"></script>
<script type="text/javascript">function showDetails()
{
	
}</script>
</head>
<body  onload="showDetails()">
	<%
		List<ProductDAO> pd=new ArrayList<ProductDAO>();
						  	pd=(ArrayList<ProductDAO>)request.getAttribute("pdList");
						  	int size =pd.size();
	%>

	<div class="header-bg">
		<div class="wrap">
			<div class="h-bg">
				<div class="total">
					<div class="header">
						<div class="box_header_user_menu">
							<ul class="user_menu">
								<li class="act first"><a href="OrderStatus.jsp"><div class="button-t">
											<span>Order &amp; Status</span>
										</div></a></li>
								<li class=""><a href="Signup.jsp"><div class="button-t">
											<span>Create an Account</span>
										</div></a></li>
								<li class="last"><a href="LogIn.jsp"><div class="button-t">
											<span>Log in</span>
										</div></a></li>
							</ul>
						</div>
						<div class="clear"></div>
						<div class="header-bot">
							<div class="logo">
								<!-- <a href="Home.jsp"><img src="images/logo.png" alt="" /></a> -->
							</div>
							<div class="clear"></div>
						</div>
					</div>
					<div class="menu">
						<div class="top-nav">
							<ul>
								<li class="active"><a href="">Home</a></li>
								<li><a href="about.html">About</a></li>
									<li><a href="CheckOut.jsp">Buy products</a></li>
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
									<div class="content-top">
										<div class="box_wrapper">
											<h1>
												Welcome
												<%=request.getAttribute("na")%>hii

											</h1>
										</div>
										<%
											for (int i=0;i <(size/3);i++){
										%>
										<div class="text">
											<%
												for(int j =0 ;i<3;i++){
											%>
											<div class="grid_1_of_3 images_1_of_3">
												<div class="grid_1">
													<a href="single.html"><img src="images/pic5.jpg"
														title="continue reading" alt=""></a>
													<div class="grid_desc">
														<p class="title"><%=pd.get(i+j).getModelnumber()%></p>
														<p class="title1"><%=pd.get(i+j).getBrand()%></p>
														<div class="price" style="height: 19px;">
															<span class="reducedfrom"><%=pd.get(i+j).getPrice()%></span>

														</div>
														
														<!--	<form action="Details.jsp?id=<%=i+j%>">-->
															<form action="Servlet4" method="post">
															
															<input type="hidden" name="articleId" value="<%=i+j%>" />
																<input type="submit" value="Details"></span>
															</form>
															
															<div class="clear"></div>
														
													</div>
												</div>
												<div class="clear"></div>
											</div>
											<%
												}%>
											
										</div>
										<%
											}
										%>




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
												src="images/pic24.jpg" alt="" /> <img src="images/pic25.jpg"
												alt="" /> <img src="images/pic27.jpg" alt="" />
										</div>
										<div class="col_1_of_2 span_1_of_2">
											<img src="images/pic22.jpg" alt="" /> <img
												src="images/pic23.jpg" alt="" /> <img src="images/pic26.jpg"
												alt="" /> <img src="images/pic28.jpg" alt="" />
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
										<p>All rights Reserved by AutoInc</p>
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