<jsp:include page="header.jsp" flush="true" />
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
						target="_blank" href="">java4th</a>
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