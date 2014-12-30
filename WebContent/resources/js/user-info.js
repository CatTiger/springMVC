/**
 * 
 * @authors chenzhq
 * @date    2014-12-29 18:49:22
 * @version 1.0
 */
(function() {
	var TabMenu = function() {
		this.$nav = $('#menu_nav');
		this.$content = $('#user_info');
		this.$nav_a = $('#menu_nav').find('a');
		var _this = this;
		this.$nav_a.on('click', function(event) {
			event.preventDefault();
			_this.switchTab($(event.target).parent().index());
		});
		TabMenu.prototype.switchTab = function(argument){
			$(this.$content.children('div')).css('display', 'none');
			$(this.$content.children('div').eq(argument)).css('display', 'block');
		};
	}
	var oTabMenu = new TabMenu();
})()
