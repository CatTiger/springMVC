<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<link href="resources/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="resources/js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="resources/css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!---- start-smoth-scrolling---->
<script type="text/javascript" src="resources/js/move-top.js"></script>
<script type="text/javascript" src="resources/js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
</script>
<!---- start-smoth-scrolling---->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
</script>
<!----webfonts--->

<!---//webfonts--->
<!----start-top-nav-script---->
<script>
	$(function() {
		var pull = $('#pull');
		menu = $('nav ul');
		menuHeight = menu.height();
		$(pull).on('click', function(e) {
			e.preventDefault();
			menu.slideToggle();
		});
		$(window).resize(function() {
			var w = $(window).width();
			if (w > 320 && menu.is(':hidden')) {
				menu.removeAttr('style');
			}
		});
	});
</script>
<!----//End-top-nav-script---->
</head>
<body>
	<!----container---->
	<div class="container">
		<!----top-header---->
		<div class="top-header">
			<div class="logo">
				<a href="index.html"><img src="images/logo.png"
					title="barndlogo" /></a>
			</div>
			<div class="top-header-info">
				<div class="top-contact-info">
					<ul class="unstyled-list list-inline">
						<li><span class="phone"> </span>090 - 223 44 66</li>
						<li><span class="mail"> </span><a href="#">help@trendd.com</a></li>
						<div class="clearfix"></div>
					</ul>
				</div>
				<div class="cart-details">
					<div class="add-to-cart">
						<ul class="unstyled-list list-inline">
							<li><span class="cart"> </span>
								<ul class="cart-sub">
									<li><p>0 Products</p></li>
								</ul></li>
						</ul>
					</div>
					<div class="login-rigister">
						<ul class="unstyled-list list-inline">
							<li><a class="login" href="#">Login</a></li>
							<li><a class="rigister" href="#">REGISTER <span>
								</span></a></li>
							<div class="clearfix"></div>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
		<!----//top-header---->
		<!---top-header-nav---->
		<div class="top-header-nav">
			<!----start-top-nav---->
			<nav class="top-nav main-menu">
			<ul class="top-nav">
				<li><a href="products.html">PRODUCTS </a><span> </span></li>
				<li><a href="products.html">CAMPAINGS</a><span> </span></li>
				<li><a href="products.html">SERVICES</a><span> </span></li>
				<li><a href="products.html">BRANDS</a><span> </span></li>
				<li><a href="products.html">ABOUT US</a></li>
				<div class="clearfix"></div>
			</ul>
			<a href="#" id="pull"><img src="images/nav-icon.png" title="menu" /></a>
			</nav>
			<!----End-top-nav---->
			<!---top-header-search-box--->
			<div class="top-header-search-box">
				<form>
					<input type="text" placeholder="Search" required / maxlength="22">
					<input type="submit" value=" ">
				</form>
			</div>
			<!---top-header-search-box--->
			<div class="clearfix"></div>
		</div>
	</div>
	<!--//top-header-nav---->
	<!----start-slider-script---->
	<script src="resources/js/responsiveslides.min.js"></script>
	<script>
		// You can also use "$(window).load(function() {"
		$(function() {
			// Slideshow 4
			$("#slider4").responsiveSlides({
				auto : true,
				pager : true,
				nav : true,
				speed : 500,
				namespace : "callbacks",
				before : function() {
					$('.events').append("<li>before event fired.</li>");
				},
				after : function() {
					$('.events').append("<li>after event fired.</li>");
				}
			});

		});
	</script>
	<!----//End-slider-script---->
	<!-- Slideshow 4 -->
	<div id="top" class="callbacks_container">
		<ul class="rslides" id="slider4">
			<li><img src="images/slide1.png" alt="">
				<div class="caption">
					<div class="slide-text-info">
						<h1>WILL HELM</h1>
						<label>WINTER</label> <a class="slide-btn" href="#"><span>99.90$</span>
							<small>GET NOW</small><label> </label></a>
					</div>
				</div></li>
			<li><img src="images/slide2.png" alt="">
				<div class="caption">
					<div class="slide-text-info">
						<h1>FAST NER2</h1>
						<label>Dress Shoe</label> <a class="slide-btn" href="#"><span>99.90$</span>
							<small>GET NOW</small><label> </label></a>
					</div>
				</div></li>
			<li><img src="images/slide1.png" alt="">
				<div class="caption">
					<div class="slide-text-info">
						<h1>WILL HELM</h1>
						<label>WINTER</label> <a class="slide-btn" href="#"><span>99.90$</span>
							<small>GET NOW</small><label> </label></a>
					</div>
				</div></li>
		</ul>
	</div>
	<div class="clearfix"></div>
	<!----- //End-slider---->
	<!----content---->
	<div class="content">
		<div class="container">
			<!---top-row--->
			<div class="top-row">
				<div class="col-xs-4">
					<div class="top-row-col1 text-center">
						<h2>WOMAN</h2>
						<img class="r-img text-center" src="images/img-w.jpg" title="name" />
						<span><img src="images/obj1.png" title="name" /></span>
						<h4>TOTAL</h4>
						<label>357 PRODUCTS</label> <a class="r-list-w"
							href="single-page.html"><img src="images/list-icon.png"
							title="list" /></a>
					</div>
				</div>
				<div class="col-xs-4">
					<div class="top-row-col1 text-center">
						<h2>MAN</h2>
						<img class="r-img text-center" src="images/man-r-img.jpg"
							title="name" /> <span><img src="images/obj2.png"
							title="name" /></span>
						<h4>TOTAL</h4>
						<label>357 PRODUCTS</label> <a class="r-list-w"
							href="single-page.html"><img src="images/list-icon.png"
							title="list" /></a>
					</div>
				</div>
				<div class="col-xs-4">
					<div class="top-row-col1 text-center">
						<h2>KIDS</h2>
						<img class="r-img text-center" src="images/kid-r-img.jpg"
							title="name" /> <span><img src="images/obj3.png"
							title="name" /></span>
						<h4>TOTAL</h4>
						<label>357 PRODUCTS</label> <a class="r-list-w"
							href="single-page.html"><img src="images/list-icon.png"
							title="list" /></a>
					</div>
				</div>
				<vdi class="clearfix">
			</div>
		</div>
		<!---top-row--->
		<div class="copyrights">
			Collect from <a href="http://www.cssmoban.com/" title="网站模板">网站模板</a>
		</div>
		<div class="container">
			<!----speical-products---->
			<div class="special-products">
				<div class="s-products-head">
					<div class="s-products-head-left">
						<h3>
							SPECIAL <span>PRODUCTS</span>
						</h3>
					</div>
					<div class="s-products-head-right">
						<a href="products.html"><span> </span>view all products</a>
					</div>
					<div class="clearfix"></div>
				</div>
				<!----special-products-grids---->
				<div class="special-products-grids">
					<div class="col-md-3 special-products-grid text-center">
						<a class="brand-name" href="single-page.html"><img
							src="images/b1.jpg" title="name" /></a> <a class="product-here"
							href="single-page.html"><img src="images/p1.jpg"
							title="product-name" /></a>
						<h4>
							<a href="single-page.html">Nike Roshe Run</a>
						</h4>
						<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET
								NOW</small><label> </label></a>
					</div>
					<div class="col-md-3 special-products-grid text-center">
						<a class="brand-name" href="single-page.html"><img
							src="images/b2.jpg" title="name" /></a> <a class="product-here"
							href="single-page.html"><img src="images/p2.jpg"
							title="product-name" /></a>
						<h4>
							<a href="single-page.html">Line Link 67009</a>
						</h4>
						<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET
								NOW</small><label> </label></a>
					</div>
					<div class="col-md-3 special-products-grid text-center">
						<a class="brand-name" href="single-page.html"><img
							src="images/b3.jpg" title="name" /></a> <a class="product-here"
							href="single-page.html"><img src="images/p3.jpg"
							title="product-name" /></a>
						<h4>
							<a href="single-page.html">Minimus Zero </a>
						</h4>
						<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET
								NOW</small><label> </label></a>
					</div>
					<div class="col-md-3 special-products-grid text-center">
						<a class="brand-name" href="single-page.html"><img
							src="images/b4.jpg" title="name" /></a> <a class="product-here"
							href="single-page.html"><img src="images/p4.jpg"
							title="product-name" /></a>
						<h4>
							<a href="single-page.html"> Athletic Shoe </a>
						</h4>
						<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET
								NOW</small><label> </label></a>
					</div>
					<div class="col-md-3 special-products-grid text-center">
						<a class="brand-name" href="single-page.html"><img
							src="images/b5.jpg" title="name" /></a> <a class="product-here"
							href="single-page.html"><img src="images/p2.jpg"
							title="product-name" /></a>
						<h4>
							<a href="single-page.html">Veronique </a>
						</h4>
						<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET
								NOW</small><label> </label></a>
					</div>
					<div class="col-md-3 special-products-grid text-center">
						<a class="brand-name" href="single-page.html"><img
							src="images/b6.jpg" title="name" /></a> <a class="product-here"
							href="single-page.html"><img src="images/p6.jpg"
							title="product-name" /></a>
						<h4>
							<a href="single-page.html">Suede Boots </a>
						</h4>
						<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET
								NOW</small><label> </label></a>
					</div>
					<div class="col-md-3 special-products-grid text-center">
						<a class="brand-name" href="single-page.html"><img
							src="images/b7.jpg" title="name" /></a> <a class="product-here"
							href="single-page.html"><img src="images/p7.jpg"
							title="product-name" /></a>
						<h4>
							<a href="single-page.html">Barricade 6.0 </a>
						</h4>
						<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET
								NOW</small><label> </label></a>
					</div>
					<div class="col-md-3 special-products-grid text-center">
						<a class="brand-name" href="single-page.html"><img
							src="images/b1.jpg" title="name" /></a> <a class="product-here"
							href="single-page.html"><img src="images/p8.jpg"
							title="product-name" /></a>
						<h4>
							<a href="single-page.html">Cotu Classic </a>
						</h4>
						<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET
								NOW</small><label> </label></a>
					</div>
					<div class="clearfix"></div>
				</div>
				<!---//special-products-grids---->
			</div>
			<!---//speical-products---->
		</div>
		<!----content---->
		<!----footer--->
		<div class="footer">
			<div class="container">
				<div class="col-md-3 footer-logo">
					<a href="index.html"><img src="images/flogo.png"
						title="brand-logo" /></a>
				</div>
				<div class="col-md-7 footer-links">
					<ul class="unstyled-list list-inline">
						<li><a href="#"> Faq</a> <span> </span></li>
						<li><a href="#"> Terms and Conditions</a> <span> </span></li>
						<li><a href="#"> Secure Payments</a> <span> </span></li>
						<li><a href="#"> Shipping</a> <span> </span></li>
						<li><a href="contact.html"> Contact</a></li>
						<div class="clearfix"></div>
					</ul>
				</div>
				<div class="col-md-2 footer-social">
					<ul class="unstyled-list list-inline">
						<li><a class="pin" href="#"><span> </span></a></li>
						<li><a class="twitter" href="#"><span> </span></a></li>
						<li><a class="facebook" href="#"><span> </span></a></li>
						<div class="clearfix"></div>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<div class="clearfix"></div>
		<!---//footer--->
		<!---copy-right--->
		<div class="copy-right">
			<div class="container">
				<p>
					Copyright &copy; 2014.Company name All rights reserved.<a
						target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
					- More Templates <a href="http://www.cssmoban.com/" target="_blank"
						title="模板之家">模板之家</a>
				</p>
				<script type="text/javascript">
					$(document).ready(function() {
						/*
						var defaults = {
							containerID: 'toTop', // fading element id
							containerHoverID: 'toTopHover', // fading element hover id
							scrollSpeed: 1200,
							easingType: 'linear' 
						};
						 */

						$().UItoTop({
							easingType : 'easeOutQuart'
						});

					});
				</script>
				<a href="#" id="toTop" style="display: block;"> <span
					id="toTopHover" style="opacity: 1;"> </span></a>
			</div>
		</div>
		<!--//copy-right--->
	</div>
	<!----container---->
</body>
</html>