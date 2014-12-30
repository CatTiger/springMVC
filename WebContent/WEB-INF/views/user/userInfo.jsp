<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
		<title>Home</title>
		<link href="../resources/css/bootstrap.css" rel='stylesheet' type='text/css' />
		<link rel="stylesheet" href="../resources/css/font-awesome.min.css">
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="../resources/js/jquery.min.js"></script>
		 <!-- Custom Theme files -->
		<link href="../resources/css/style.css" rel='stylesheet' type='text/css' />
<!-- 		<link rel="stylesheet" href="../resources/css/jquery.remodal.css"> -->
		<!-- 这个页面的css -->
		<link rel="stylesheet" href="../resources/css/user-info.css">
   		 <!-- Custom Theme files -->
   		 <!---- start-smoth-scrolling---->
   		 <!-- <script src="../resources/js/jquery.remodal.js"></script> -->
		<script type="text/javascript" src="../resources/js/move-top.js"></script>
		<script type="text/javascript" src="../resources/js/easing.js"></script>
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
</head>
<body>
    <div class="container top_container">
			<!----top-header---->
			<div class="top-header">
				<div class="logo">
					<a href="index.html"><img src="../images/logo.png" title="barndlogo" /></a>
				</div>
				<div class="top-header-info">
					<div class="cart-details">
						<div class="login-rigister">
							<!-- <ul id="reg_log_btn" class="unstyled-list list-inline">
								<li><a class="rigister" href="#modal"><span>发布商品</span></a></li>
								<div class="clearfix"> </div>
							</ul> -->
							<div id="login_info" style="display:block">
								<img src="./resources/images/kid-r-img.jpg" alt="">
								<div>欢迎：<span>${loginUser.username}</span></div>
								<ul>
									<li><a href=""><i class="icon-user icon-large"></i></a></li>
									<li><a href=""><i class="icon-star icon-large"></i></a></li>
									<li><a id="logout" href="userLogout"><i class="icon-remove icon-large"></i></a></li>
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

			  <script src="../resources/js/topbar.js"></script>
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
		<div class="fill_black" style="display:none"></div>
		<!-- 主展示区 -->
		<div class="container">
			<!-- 头像和nav -->
			<div id="info_nav">
				<img id="user_phote" src="../images/kid-r-img.jpg" alt="">
				<ul id="menu_nav">
					<li><a href="">个人信息</a></li>
					<li><a href="">发布的商品</a></li>
					<li><a href="">我的收藏</a></li>
				</ul>
			</div><!-- 头像和nav end-->
			<!-- 展示Tab -->
			<div id="user_info">
				<!-- 个人信息 -->
				<div id="my_info" style="display:block">
					<div id="account_info">
						<h2>账户信息</h2>
						<ul class="infos">
							<li>用户名:</li>
							<li></li>
						</ul>
						<ul class="infos">
							<li>Email:</li>
							<li></li>
						</ul>
						<ul class="infos">
							<li>密码：</li>
							<li></li>
						</ul>
					</div>
					<div id="base_info">
						<h2>基本信息</h2>
						<ul class="infos">
							<li>真实姓名：</li>
							<li></li>
						</ul>
						<ul class="infos">
							<li>手机号：</li>
							<li></li>
						</ul>
						<ul class="infos">
							<li>QQ：</li>
							<li></li>
						</ul>
						<ul class="infos">
							<li>地址：</li>
							<li></li>
						</ul>
					</div>
				</div><!-- 个人信息end -->
				<!-- 发布的商品 -->
				<div id="my_book" style="display:none">
					<h2>发布的商品</h2>
					<ul class="book_list">
						<li class="book_each">
							<div class="book_one">
								<h3><a href="">标题</a></h3>
								<p>这是关于这本书的简单介绍！</p>
								<section>
									<span class="book_state">未售出</span>
									<span class="change_state">这是按钮</span>
								</section>
							</div>
							<img class="book_pic" src="../images/a1.jpg" alt="">
						</li>
						<li class="book_each">
							<div class="book_one">
								<h3><a href="">标题</a></h3>
								<p>这是关于这本书的简单介绍！</p>
								<section>
									<span class="book_state">未售出</span>
									<span class="change_state">这是按钮</span>
								</section>
							</div>
							<img class="book_pic" src="../images/a2.jpg" alt="">
						</li>
						<li class="book_each">
							<div class="book_one">
								<h3><a href="">标题</a></h3>
								<p>这是关于这本书的简单介绍！</p>
								<section>
									<span class="book_state">未售出</span>
									<span class="change_state">这是按钮</span>
								</section>
							</div>
							<img class="book_pic" src="../images/a3.jpg" alt="">
						</li>
					</ul>
				</div><!-- 发布的商品end -->
				<!-- 我的收藏 -->
				<div id="my_store" style="display:none">
					<h2>我的收藏</h2>
					<ul class="book_list">
						<li class="book_each">
							<div class="book_one">
								<h3><a href="">标题</a></h3>
								<p>这是关于这本书的简单介绍！</p>
								<section>
									<span class="book_state">未售出</span>
									<span class="change_state">这是按钮</span>
								</section>
							</div>
							<img class="book_pic" src="../images/a4.jpg" alt="">
						</li>
						<li class="book_each">
							<div class="book_one">
								<h3><a href="">标题</a></h3>
								<p>这是关于这本书的简单介绍！</p>
								<section>
									<span class="book_state">未售出</span>
									<span class="change_state">这是按钮</span>
								</section>
							</div>
							<img class="book_pic" src="../images/a5.jpg" alt="">
						</li>
					</ul>
				</div><!-- 我的收藏end -->
			</div><!-- 展示Tab end -->
		</div><!-- 主展示区 end-->
		<script src="../resources/js/user-info.js"/>
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
</body>
</html>