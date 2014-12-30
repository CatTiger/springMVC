<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="utf-8">
		<title>Home</title>
		<link href="resources/css/bootstrap.css" rel='stylesheet' type='text/css' />
		<link rel="stylesheet" href="resources/css/font-awesome.min.css">
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="resources/js/jquery.min.js"></script>
		<script src="resources/js/Validform_v5.3.2.js"></script>
		 <!-- Custom Theme files -->
		<link href="resources/css/style.css" rel='stylesheet' type='text/css' />
		<link rel="stylesheet" href="resources/css/jquery.remodal.css">
   		 <!-- Custom Theme files -->
   		 <!---- start-smoth-scrolling---->
   		 <script src="resources/js/jquery.remodal.js"></script>
		<script type="text/javascript" src="resources/js/move-top.js"></script>
		<script type="text/javascript" src="resources/js/easing.js"></script>
		<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
		</script>
		 <!---- start-smoth-scrolling---->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		</script>
	</head>
	<body>

		<!----container-->
		<div class="container top_container remodal-bg">
			<!----top-header---->
			<div class="top-header">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" title="barndlogo" /></a>
				</div>
				<div class="top-header-info">
					<div class="cart-details">
						<div class="login-rigister">
							<ul id="reg_log_btn" class="unstyled-list list-inline">
								<!-- <li><a class="login" href="#">Login</a></li> -->
								<li><a class="rigister" href="#modal"><span>发布商品</span></a></li>
								<div class="clearfix"> </div>
							</ul>
							<div id="login_info" style="display:none">
								<img src="./resources/images/kid-r-img.jpg" alt="">
								<div>欢迎：<span>${loginUser.username}</span></div>
								<ul>
									<li><a href="user/userInfo"><i class="icon-user icon-large"></i></a></li>
									<li><a href=""><i class="icon-star icon-large"></i></a></li>
									<li><a id="logout" href="user/userLogout"><i class="icon-remove icon-large"></i></a></li>
								</ul>
							</div>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
			<!---//top-header-->
			<!---top-header-nav-->
			<div class="top-header-nav" id="top_bar">
			<!---start-top-nav-->
				<nav class="top-nav" id="top_menu">
						<ul class="menu_list" id="menu_list">
							<li>
								<a href="products01.html">教材教辅</a>
							</li>
							<li>
								<a href="products02.html">人文社科</a>
							</li>
							<li>
								<a href="products03.html">科技</a>
							</li>
							<li>
								<a href="products04.html">心灵读物</a>
							</li>
						</ul>
						<div class="menu_con" id="menu_con">
							<div class="menu_sep ">
								<ul>
									<li><a href="#">考研</a></li>
									<li><a href="#">教材</a></li>
									<li><a href="#">四六级</a></li>
								</ul>
							</div>
							<div class="menu_sep ">
								<ul class="">
									<li><a href="#">历史</a></li>
									<li><a href="#">小说</a></li>
									<li><a href="#">心理学</a></li>
									<li><a href="#">哲学</a></li>
								</ul>
							</div>
							<div class="menu_sep">
								<ul class="">
									<li><a href="#">互联网</a></li>
									<li><a href="#">通信</a></li>
								</ul>
							</div>
							<div class="menu_sep">
								<ul class="">
									<li><a href="#">励志</a></li>
									<li><a href="#">心灵读物</a></li>
								</ul>
							</div>
						</div>
						<!-- <div class="clearfix"> </div> -->
					<!-- <a href="#" id="pull"><img src="images/nav-icon.png" title="menu" /></a> -->
			  	</nav>

			  <script src="resources/js/topbar.js"></script>
			  <!---End-top-nav-->
			  <!---top-header-search-box-->
			  <div class="top-header-search-box">
			  	<form>
			  		<input type="text" placeholder="Search"  maxlength="22">
			  		<input type="submit" value=" " >
			  	</form>
			  </div>
			  <!---top-header-search-box-->
			  <div class="clearfix"> </div>
			</div>
		</div>
			<!--nav结束-->
			<!-- <script src="resources/js/responsiveslides.min.js"></script>
			 <script>
			    // You can also use "$(window).load(function() {"
			    $(function () {
			      // Slideshow 4
			      // console.log($('#top_header').offset().top);
			      $("#slider4").responsiveSlides({
			        auto: true,
			        pager: true,
			        nav: true,
			        speed: 500,
			        namespace: "callbacks",
			        before: function () {
			          $('.events').append("<li>before event fired.</li>");
			        },
			        after: function () {
			          $('.events').append("<li>after event fired.</li>");
			        }
			      });
			
			    });
			  </script> -->
			<!--主展示页面-->
			<div class="fill_black" style="display:none"></div>
				<div class="content">
					<div class="container">
						<div class="special-products">
							<!-- 列表标题 -->
							<div class="s-products-head">
								<div class="s-products-head-left">
									<h3>热门 <span>图书</span></h3>
								</div>
								<div class="s-products-head-right">
									<a href="products.html"><span> </span>最新发布</a>
								</div>
								<div class="clearfix"> </div>
							</div>
							<!-- 列表标题end -->
							<!--商品列表-->
							<div class="special-products-grids">
								<div class="col-md-3 special-products-grid text-center">
									<a class="brand-name" href="single-page.html"><img src="images/b1.jpg" title="name" /></a>
									<a class="product-here" href="single-page.html"><img src="images/p1.jpg" title="product-name" /></a>
									<h4><a href="single-page.html">Nike Roshe Run</a></h4>
									<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a>
								</div>
								<div class="col-md-3 special-products-grid text-center">
									<a class="brand-name" href="single-page.html"><img src="images/b2.jpg" title="name" /></a>
									<a class="product-here" href="single-page.html"><img src="images/p2.jpg" title="product-name" /></a>
									<h4><a href="single-page.html">Line Link 67009</a></h4>
									<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a>
								</div>
								<div class="col-md-3 special-products-grid text-center">
									<a class="brand-name" href="single-page.html"><img src="images/b3.jpg" title="name" /></a>
									<a class="product-here" href="single-page.html"><img src="images/p3.jpg" title="product-name" /></a>
									<h4><a href="single-page.html">Minimus Zero </a></h4>
									<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a>
								</div>
								<div class="col-md-3 special-products-grid text-center">
									<a class="brand-name" href="single-page.html"><img src="images/b4.jpg" title="name" /></a>
									<a class="product-here" href="single-page.html"><img src="images/p4.jpg" title="product-name" /></a>
									<h4><a href="single-page.html"> Athletic Shoe </a></h4>
									<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a>
								</div>
								<div class="col-md-3 special-products-grid text-center">
									<a class="brand-name" href="single-page.html"><img src="images/b5.jpg" title="name" /></a>
									<a class="product-here" href="single-page.html"><img src="images/p2.jpg" title="product-name" /></a>
									<h4><a href="single-page.html">Veronique </a></h4>
									<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a>
								</div>
								<div class="col-md-3 special-products-grid text-center">
									<a class="brand-name" href="single-page.html"><img src="images/b6.jpg" title="name" /></a>
									<a class="product-here" href="single-page.html"><img src="images/p6.jpg" title="product-name" /></a>
									<h4><a href="single-page.html">Suede Boots </a></h4>
									<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a>
								</div>
								<div class="col-md-3 special-products-grid text-center">
									<a class="brand-name" href="single-page.html"><img src="images/b7.jpg" title="name" /></a>
									<a class="product-here" href="single-page.html"><img src="images/p7.jpg" title="product-name" /></a>
									<h4><a href="single-page.html">Barricade 6.0  </a></h4>
									<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a>
								</div>
								<div class="col-md-3 special-products-grid text-center">
									<a class="brand-name" href="single-page.html"><img src="images/b1.jpg" title="name" /></a>
									<a class="product-here" href="single-page.html"><img src="images/p8.jpg" title="product-name" /></a>
									<h4><a href="single-page.html">Cotu Classic </a></h4>
									<a class="product-btn" href="single-page.html"><span>109.90$</span><small>GET NOW</small><label> </label></a>
								</div>
								<div class="clearfix"> </div>
							</div>
							<!-- 商品列表end -->
						</div>
						<!-- 商品展示end -->
						<!-- 页码 -->
						<div class="pageing">
							<a href="" class="page_arrow_left">上一页</a>
							<a href="" class="page_num">1</a>
							<a href="" class="page_num">2</a>
							<a href="" class="page_num">3</a>
							<a href="" class="page_num">4</a>
							<a href="" class="page_num">5</a>
							<a href="" class="page_num">6</a>
							<a href="" class="page_arrow_right">下一页</a>
						</div>
						<!-- 页码end -->
					</div>
				</div>
			<!--主展示页面结束-->
			<!---copy-right-->
					<div class="copy-right">
						<div class="container">
							<p>Copyright &copy; 2014.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a> - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a></p>
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
										$().UItoTop({ easingType: 'easeOutQuart' });
									});
								</script>
							<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
						</div>
					</div>
			<!--copy-right结束-->
		</div>
		<!----container---->
		<div class="remodal" data-remodal-id="modal">
		   <div id="form_wrapper" class="form_wrapper">
		   		<form id="login" class="login active">
						<h3>登录</h3>
						<div>
							<label>用户名:</label>
							<input type="text" name="username" />
							<span id="username_error" class="error">输入有误哦</span>
						</div>
						<div>
							<label>密码: <!-- <a href="forgot_password.html" rel="forgot_password" class="forgot linkform">Forgot your password?</a> --></label>
							<input type="password" name="pwd" />
							<span id="pwd_error" class="error">输入有误哦</span>
						</div>
						<div class="bottom">
							<!-- <div class="remember"><input type="checkbox" /><span>记住我</span></div> -->
							<input type="submit" class="remodal-login" value="登录"></input>
							<a href="register.html" rel="register" class="linkform">还没有账号吗？加入我们吧!</a>
							<div class="clear"></div>
						</div>
				</form>
				<form class="register" id="register">
						<h3>注册</h3>
						<div class="column">
							<div>
								<label>用户名:</label>
								<input type="text" id="username" name="username" datatype="s3-10" errormsg="用户名至少3个字符,最多10个字符！"  placeholder="请输入用户名" ajaxurl="user/checkname" required/>
								<img id="loading" src="./resources/images/onLoad.gif" alt="" style="display:none">
							</div>
							<div>
								<label>密码:</label>
								<input type="password" id="pwd" name="pwd" datatype="*6-16" errormsg="请输入6-16位密码长度！" required/>
								<!-- <span class=""></span> -->
							</div>
							<div>
								<label>确认密码:</label>
								<input type="password" value="" datatype="*6-16"  recheck="pwd" errormsg="您两次输入的密码不一致！"/>
								<!-- <span class=""></span> -->
							</div>
						</div>
						<div class="column">
							<div>
								<label>手机号:</label>
								<input type="text" id="telphone" datatype="m" name="telphone" errormsg="请输入正确的手机号！" required/>
							</div>
							<div>
								<label>电子邮箱:</label>
								<input type="email" id="email" datatype="e" name="email" errormsg="请输入正确的邮箱格式！" required/>
							</div>
						</div>
						<div class="bottom">
							<input type="submit" class="remodal-register" value="加入我们" />
							<a href="index.html" rel="login" class="linkform">您已经有账号了吗？点击这里</a>
							<div class="clear"></div>
						</div>
				</form>
			</div>
			<div class="clear"></div>
		  	<!-- <a class="remodal-cancel" href="#">Cancel</a>
		    <a class="remodal-confirm" href="#">OK</a>  -->
		</div>
		<!-- 登录前端验证 -->
		<script type="text/javascript">
			$(function() {
				$('#register').Validform({
					tiptype:3,
					btnSubmit:".remodal-register",
					showAllError:true,
					beforeSubmit:function(curform) {
						if(curform.find(':input').hasClass('Validform_error')) {
							return false;
						}
					}
				});

				$.fn.serializeObject = function()
					{
					   var o = {};
					   var a = this.serializeArray();
					   $.each(a, function() {
					       if (o[this.name]) {
					           if (!o[this.name].push) {
					               o[this.name] = [o[this.name]];
					           }
					           o[this.name].push(this.value || '');
					       } else {
					           o[this.name] = this.value || '';
					       }
					   });
					   return o;
					};
				$('#logout').on('click', function(event) {
					event.preventDefault();
					$.ajax({
						url: 'user/userLogout',
						type: 'GET',
						dataType: 'text',
						contentType:'text/plain;charset=UTF-8',
						// data: {param1: 'value1'},
						success: function(data) {
							if(data == 'success') {
								window.login_state = "true";
								$('#reg_log_btn').css('display', 'block');
								$('#login_info').css('display', 'none');
							}
						}
					});
				});
			})
		</script>
		<!-- 表单提交ajax代码 -->
		<!-- <script type="text/javascript" src="resources/js/form-validation.js"></script> -->
		<!-- 注册登录弹出框jquery代码 -->
		<script type="text/javascript">
		$(function() {
				//the form wrapper (includes all forms)
			var $form_wrapper	= $('#form_wrapper'),
				//the current form is the one with class active
				$currentForm	= $form_wrapper.children('form.active'),
				//the change form links
				$linkform		= $form_wrapper.find('.linkform');
			//get width and height of each form and store them for later
			$form_wrapper.children('form').each(function(i){
				var $theForm	= $(this);
				//solve the inline display none problem when using fadeIn fadeOut
				if(!$theForm.hasClass('active'))
					$theForm.hide();
				$theForm.data({
					width	: $theForm.width(),
					height	: $theForm.height()
				});
			});
			//set width and height of wrapper (same of current form)
			setWrapperWidth();
			/*
			clicking a link (change form event) in the form
			makes the current form hide.
			The wrapper animates its width and height to the
			width and height of the new current form.
			After the animation, the new form is shown
			*/
			$linkform.bind('click',function(e){
				var $link	= $(this);
				var target	= $link.attr('rel');
				$currentForm.fadeOut(400,function(){
					//remove class active from current form
					$currentForm.removeClass('active');
					//new current form
					$currentForm= $form_wrapper.children('form.'+target);
					//animate the wrapper
					$form_wrapper.stop()
								 .animate({
									width	: $currentForm.data('width') + 'px',
									height	: $currentForm.data('height') + 'px'
								 },500,function(){
									//new form gets class active
									$currentForm.addClass('active');
									//show the new form
									$currentForm.fadeIn(400);
								 });
				});
				e.preventDefault();
			});
			
			function setWrapperWidth(){
				$form_wrapper.css({
					width	: $currentForm.data('width') + 'px',
					height	: $currentForm.data('height') + 'px'
				});
			}
			
			/*
			for the demo we disabled the submit buttons
			if you submit the form, you need to check the 
			which form was submited, and give the class active 
			to the form you want to show
			*/
			// $form_wrapper.find('input[type="submit"]')
			// 			 .click(function(e){
			// 				e.preventDefault();
			// 			 });
		});
        </script>
		<script>
		window.onload = function() {
			console.log($('#login_info>div>span').html());
			console.log(!($('#login_info>div>span').html() == ""));
			if(!($('#login_info>div>span').html() == "")) {
					$('#reg_log_btn').css('display', 'none');
					$('#login_info').css('display', 'block');
				}
		}
		</script>
</body>
</html>

