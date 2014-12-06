<jsp:include page="../header.jsp" flush="true" />
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		
	});
</script>
<body>
	<!----content---->
				<div class="content">
					<div class="container">
				<!--- products ---->
				<div class="products">
					<div class="product-filter">
						<h1><a href="#">FILTER</a></h1>
						<div class="product-filter-grids"> 
							<div class="col-md-3 product-filter-grid1-brands">
								<h3>BRANDS</h3>
								<ul class="col-md-6 unstyled-list b-list1">
									<li><a href="#">adidas</a></li>
									<li><a href="#">nike</a></li>
									<li><a href="#">camper</a></li>
									<li><a href="#">superga</a></li>
									<li><a href="#">timberland</a></li>
									<li><a href="#">new balance</a></li>
									<li><a href="#">converse</a></li>
									<li><a href="#">puma</a></li>
									<li><a href="#">kinetix</a></li>
									<div class="clearfix"> </div>
								</ul>
								<ul class="col-md-6 unstyled-list b-list2">
									<li><a href="#">tiger</a></li>
									<li><a href="#">lacoste</a></li>
									<li><a href="#">eebok</a></li>
									<li><a href="#">cat</a></li>
									<li><a href="#">dockers</a></li>
									<div class="clearfix"> </div>
								</ul>
								<div class="clearfix"> </div>
							</div>
							<!---->
							<div class="col-md-6 product-filter-grid1-brands-col2">
									<div class="producst-cate-grids">
										<div class="col-md-4 producst-cate-grid text-center">
											<h2>WOMAN</h2>
											<img class="r-img text-center img-responsive" src="images/img-w.jpg" title="name">
											<span><img src="images/objs1.png" title="name"></span>
											<h4>TOTAL</h4>
											<label>357 PRODUCTS</label>
											<a class="r-list-w" href="#"><img src="images/list-icon.png" title="list"></a>
										</div>
										<div class="col-md-4 producst-cate-grid text-center">
											<h2>MAN</h2>
											<img class="r-img text-center img-responsive" src="images/man-r-img.jpg" title="name">
											<span><img src="images/objs2.png" title="name"></span>
											<h4>TOTAL</h4>
											<label>357 PRODUCTS</label>
											<a class="r-list-w" href="#"><img src="images/list-icon.png" title="list"></a>
										</div>
										<div class="col-md-4 producst-cate-grid text-center">
											<h2>KIDS</h2>
											<img class="r-img text-center img-responsive" src="images/kid-r-img.jpg" title="name">
											<span><img src="images/objs3.png" title="name"></span>
											<h4>TOTAL</h4>
											<label>357 PRODUCTS</label>
											<a class="r-list-w" href="#"><img src="images/list-icon.png" title="list"></a>
										</div>
									</div>
							</div>
							<!---->
							<div class="product-filter-grid1-brands-col3">
								<div class="products-colors">
									<h3>SELECT COLOR </h3>
									<li><a href="#"><span class="color1"> </span></a></li>
									<li><a href="#"><span class="color2"> </span></a></li>
									<li><a href="#"><span class="color3"> </span></a></li>
									<li><a href="#"><span class="color4"> </span></a></li>
									<li><a href="#"><span class="color5"> </span></a></li>
									<li><a href="#"><span class="color6"> </span></a></li>
									<li><a href="#"><span class="color7"> </span></a></li>
									<li><a href="#"><span class="color8"> </span></a></li>
									<li><a href="#"><span class="color9"> </span></a></li>
									<li><a href="#"><span class="color10"> </span></a></li>
									<li><a href="#"><span class="color11"> </span></a></li>
									<li><a href="#"><span class="color12"> </span></a></li>
									<li><a href="#"><span class="color13"> </span></a></li>
									<li><a href="#"><span class="color14"> </span></a></li>
									<li><a href="#"><span class="color15"> </span></a></li>
									<li><a href="#"><span class="color16"> </span></a></li>
									<li><a href="#"><span class="color17"> </span></a></li>
									<li><a href="#"><span class="color18"> </span></a></li>
									<li><a href="#"><span class="color19"> </span></a></li>
									<li><a href="#"><span class="color20"> </span></a></li>
									<div class="clearfix"> </div>
								</div>
							</div>
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
				</div>
				<div class="clearfix"> </div>
				<!-- //products ---->
				<!----product-details--->
				<div class="product-details">
					<div class="container">
					<div class="product-details-row1">
						<div class="product-details-row1-head">
							<h2>Men'sFootwear</h2>
							<p>Hookset Handcrafted Fabric Chukka</p>
						</div>
						<div class="col-md-4 product-details-row1-col1">
							<!----details-product-slider--->
						<!-- Include the Etalage files -->
							<link rel="stylesheet" href="resources/css/etalage.css">
							<script src="resources/js/jquery.etalage.min.js"></script>
						<!-- Include the Etalage files -->
						<script>
								jQuery(document).ready(function($){
					
									$('#etalage').etalage({
										thumb_image_width: 300,
										thumb_image_height: 400,
										source_image_width: 900,
										source_image_height: 1000,
										show_hint: true,
										click_callback: function(image_anchor, instance_id){
											alert('Callback example:\nYou clicked on an image with the anchor: "'+image_anchor+'"\n(in Etalage instance: "'+instance_id+'")');
										}
									});
									// This is for the dropdown list example:
									$('.dropdownlist').change(function(){
										etalage_show( $(this).find('option:selected').attr('class') );
									});
		
							});
						</script>
						<!----//details-product-slider--->
						<div class="details-left">
							<div class="details-left-slider">
								<ul id="etalage">
									<li>
										<a href="optionallink.html">
											<img class="etalage_thumb_image" src="images/product-slide/image1_thumb.jpg" />
											<img class="etalage_source_image" src="images/product-slide/image1_large.jpg" />
										</a>
									</li>
									<li>
										<img class="etalage_thumb_image" src="images/product-slide/image2_thumb.jpg" />
										<img class="etalage_source_image" src="images/product-slide/image2_large.jpg" />
									</li>
									<li>
										<img class="etalage_thumb_image" src="images/product-slide/image3_thumb.jpg" />
										<img class="etalage_source_image" src="images/product-slide/image3_large.jpg" />
									</li>
									<li>
										<img class="etalage_thumb_image" src="images/product-slide/image4_thumb.jpg" />
										<img class="etalage_source_image" src="images/product-slide/image4_large.jpg" />
									</li>
									<li>
										<img class="etalage_thumb_image" src="images/product-slide/image5_thumb.jpg" />
										<img class="etalage_source_image" src="images/product-slide/image5_large.jpg" />
									</li>
									<li>
										<img class="etalage_thumb_image" src="images/product-slide/image6_thumb.jpg" />
										<img class="etalage_source_image" src="images/product-slide/image6_large.jpg" />
									</li>
									<li>
										<img class="etalage_thumb_image" src="images/product-slide/image7_thumb.jpg" />
										<img class="etalage_source_image" src="images/product-slide/image7_large.jpg" />
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="col-md-8 product-details-row1-col2">
						<div class="product-rating">
							<a class="rate" href="#"><span> </span></a>
							<label><a href="#">Read <b>8</b> Reviews</a></label>
						</div>
						<div class="product-price">
							<div class="product-price-left text-right">
								<span>174.00</span>
								<h5>109.00$</h5>
							</div>
							<div class="product-price-right">
								<a href="#"><span> </span></a>
								<label> save <b>40%</b></label>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="product-price-details">
							<p class="text-right">This is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here,e </p>
							<a class="shipping" href="#"><span> </span>Free shipping</a>
							<div class="clearfix"> </div>
							<div class="product-size-qty">
								<div class="pro-size"> 
									<span>Size:</span>
									<select>
										<option>7</option>
										<option>8</option>
										<option>9</option>
										<option>10</option>
										<option>11</option>
									</select>
								</div>
								<div class="pro-qty">
									<span>Qty:</span>
									<select>
										<option>1</option>
										<option>2</option>
										<option>3</option>
										<option>4</option>
										<option>5</option>
									</select>
								</div> 
								<div class="clearfix"> </div>
							</div>
							<div class="clearfix"> </div>
							<div class="product-cart-share">
								<div class="add-cart-btn">
									<input type="button" value="Add to cart" />
								</div>
								<ul class="product-share text-right">
									<h3>Share This:</h3>
									<ul>
										<li><a class="share-face" href="#"><span> </span> </a></li>
										<li><a class="share-twitter" href="#"><span> </span> </a></li>
										<li><a class="share-google" href="#"><span> </span> </a></li>
										<li><a class="share-rss" href="#"><span> </span> </a></li>
										<div class="clear"> </div>
									</ul>
								</ul>
							</div>
						</div>
					</div>
						<div class="clearfix"> </div>
				<!--//product-details--->
				</div>
				<!---- product-details ---->
				<div class="product-tabs">
					<!--Horizontal Tab-->
				    <div id="horizontalTab">
				        <ul>
				            <li><a href="#tab-1">商品简介</a></li>
				            <li><a href="#tab-2">评论</a></li>
				            <li><a href="#tab-3">Customer reviews</a></li>
				        </ul>
				        <div id="tab-1" class="product-complete-info">
				        	<h3>DESCRIPTION:</h3>
				        	<p>With its beautiful premium leather, lace-up oxford styling, recycled rubber outsoles and 9-inch height, this Earthkeepers City Premium style is an undeniably handsome boot. To complement its rustic, commanding outer appearance, we've paid attention to the inside as well - by adding SmartWool庐 faux shearling to the linings and crafting the footbed using our exclusive anti-fatigue comfort foam technology to absorb shock. Imported.</p>
				       		<span>DETAILS:</span>
				       		<div class="product-fea">
				       			<p>Premium burnished full-grain leather and suede upper</p>
				       			<p>Leather is from a tannery rated Silver for its water, energy and waste-management practices</p>
				       			<p>Leather lining and footbed for a premium feel and optimal comfort</p>
				       			<p>SmartWool庐 faux shearling lining is made with 60% merino wool and 40% PET</p>
				       			<p>Reflective insole board for additional warmth under foot</p>
				       			<p>100% organic cotton laces</p>
				       			<p>SmartWool庐 fabric-lined anti-fatigue footbed provides superior, all-day comfort and climate control</p>
				       			<p>Timberland庐 exclusive Gripstick鈩?and Green Rubber鈩?outsole is made with 42% recycled rubber</p>
				       		</div>
				        </div>
				        <div id="tab-2" class="product-complete-info">
				        	<h3>DESCRIPTION:</h3>
				        	<p>With its beautiful premium leather, lace-up oxford styling, recycled rubber outsoles and 9-inch height, this Earthkeepers City Premium style is an undeniably handsome boot. To complement its rustic, commanding outer appearance, we've paid attention to the inside as well - by adding SmartWool庐 faux shearling to the linings and crafting the footbed using our exclusive anti-fatigue comfort foam technology to absorb shock. Imported.</p>
				       		<p>lace-up oxford styling, recycled rubber outsoles and 9-inch height, this Earthkeepers City Premium style is an undeniably handsome boot. To complement its rustic, commanding outer appearance,</p>
				       		<span>DETAILS:</span>
				       		<div class="product-fea">
				       			<p>Premium burnished full-grain leather and suede upper</p>
				       			<p>Leather is from a tannery rated Silver for its water, energy and waste-management practices</p>
				       			<p>Leather lining and footbed for a premium feel and optimal comfort</p>
				       			<p>SmartWool庐 faux shearling lining is made with 60% merino wool and 40% PET</p>
				       			<p>Reflective insole board for additional warmth under foot</p>
				       		</div>
				        </div>
				        <div id="tab-3"  class="product-complete-info">
				        	<h3>DESCRIPTION:</h3>
				        	<p>With its beautiful premium leather, lace-up oxford styling, recycled rubber outsoles and 9-inch height, this Earthkeepers City Premium style is an undeniably handsome boot. To complement its rustic, commanding outer appearance, we've paid attention to the inside as well - by adding SmartWool庐 faux shearling to the linings and crafting the footbed using our exclusive anti-fatigue comfort foam technology to absorb shock. Imported.</p>
				       		<span>DETAILS:</span>
				       		<div class="product-fea">
				       			<p>100% organic cotton laces</p>
				       			<p>SmartWool庐 fabric-lined anti-fatigue footbed provides superior, all-day comfort and climate control</p>
				       			<p>Timberland庐 exclusive Gripstick鈩?and Green Rubber鈩?outsole is made with 42% recycled rubber</p>
				       			<p>Premium burnished full-grain leather and suede upper</p>
				       			<p>Leather is from a tannery rated Silver for its water, energy and waste-management practices</p>
				       			<p>Leather lining and footbed for a premium feel and optimal comfort</p>
				       			<p>SmartWool庐 faux shearling lining is made with 60% merino wool and 40% PET</p>
				       			<p>Reflective insole board for additional warmth under foot</p>
				       			<p>100% organic cotton laces</p>
				       			<p>SmartWool庐 fabric-lined anti-fatigue footbed provides superior, all-day comfort and climate control</p>
				       			<p>Timberland庐 exclusive Gripstick鈩?and Green Rubber鈩?outsole is made with 42% recycled rubber</p>
				       		</div>
				        </div>
				    </div>
				    <!-- Responsive Tabs JS -->
				    <script src="resources/js/jquery.responsiveTabs.js" type="text/javascript"></script>
				
				    <script type="text/javascript">
				        $(document).ready(function () {
				            $('#horizontalTab').responsiveTabs({
				                rotate: false,
				                startCollapsed: 'accordion',
				                collapsible: 'accordion',
				                setHash: true,
				                disabled: [3,4],
				                activate: function(e, tab) {
				                    $('.info').html('Tab <strong>' + tab.id + '</strong> activated!');
				                }
				            });
				
				            $('#start-rotation').on('click', function() {
				                $('#horizontalTab').responsiveTabs('active');
				            });
				            $('#stop-rotation').on('click', function() {
				                $('#horizontalTab').responsiveTabs('stopRotation');
				            });
				            $('#start-rotation').on('click', function() {
				                $('#horizontalTab').responsiveTabs('active');
				            });
				            $('.select-tab').on('click', function() {
				                $('#horizontalTab').responsiveTabs('activate', $(this).val());
				            });
				
				        });
				    </script>
				</div>
				<!-- //product-details ---->
				</div>
				</div>
			<!----content---->			
</body>