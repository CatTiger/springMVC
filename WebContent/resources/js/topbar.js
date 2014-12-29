/**
 *
 * @authors chenzhq
 * @date    2014-12-05 22:38:15
 * @version $Id$
 */(function(){

 	var Topbar = function(elementId){
 		this.eId = elementId||'#top_bar';
 		this.el = $(this.eId).get(0);
 		this.win = $(window);
 		this.$ini_pos = $('#top_bar').offset().top ;
 		var _this = this;
 		this.win.on('scroll', function() {
 			if($(document).scrollTop() > _this.$ini_pos) {
 				_this.stickTotop();
 			}if($(document).scrollTop() < _this.$ini_pos)
 				_this.reduction();
 		});
 	}

 		Topbar.prototype.getBarTop = function(){
 			return $(this.eId).offset().top;
 		};

	 	Topbar.prototype.stickTotop = function(){
	 		if(!$(this.el).hasClass('fixed-header')) {
	 			$(this.el).addClass('fixed-header');
	 			$('.fill_black').css('display', 'block');
	 		}
	 		// $(this.el).css({
	 		// 	opacity: '0.8',
	 		// 	position: 'fixed',
	 		// 	top: '0',
	 		// 	width: '100%',
	 		// 	zIndex: '999'
	 		// });
	 		// return false;
	 	};

	 	Topbar.prototype.reduction = function(){
	 		if($(this.el).hasClass('fixed-header')) {
	 			$(this.el).removeClass('fixed-header');
	 			$('.fill_black').css('display', 'none');
	 		}
	 	};
 	
 	var topbar = new Topbar();


 	 // 菜单JS代码

 	 var Menu = function(elementId){
 	 	this.$menu = $(elementId||'#top_menu');
 	 	this.top_menu = $(elementId||'#top_menu').get(0);
 	 	this.$menu_list_a = $('#menu_list').find('a');
 	 	// 获取菜单内容
 	 	this.$menu_con = $('#menu_con');
 	 	this.$menu_show = $('#menu_con').children('.menu_show');
 	 	var _this = this;
 	 	this.$menu_list_a.on('mouseenter', function(event) {
 	 		_this.sel_index = $(event.target).parent().index();
 	 		$(event.target).css('border-bottom', '2px solid red');
 	 		_this.switchTab(_this.sel_index);
 	 	});
 	 	this.$menu_list_a.on('mouseleave', function(event) {
 				$(event.target).css('border-bottom', '2px solid #fefefe')
 				// $(_this.$menu_con.children('.menu_show')).removeClass('menu_show');
 	 		});
 	 	this.$menu.on('mouseleave', function(event) {
 	 		$(_this.$menu_con.children('.menu_show')).removeClass('menu_show');
 	 	});

 	 	Menu.prototype.switchTab = function(argument){
 	 		$(this.$menu_con.children('.menu_show')).removeClass('menu_show');
 	 		this.$menu_con.children('div').eq(argument).addClass('menu_show');
 	 	};
 	 }
 	 var omenu = new Menu();

 })()
