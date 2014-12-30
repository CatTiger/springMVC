/**
 * 
 * @authors chenzhq
 * @date    2014-12-30 10:21:02
 * @version 2.0
 */
		$(function() {
			// 所有的输入框变化后就将错误提示框隐藏
			// $(':input').on('change', function(event) {
			// 	event.preventDefault();
			// 	$(this).next('span').css('visibility', 'hidden');
			// });
			/*验证用户名*/
			$('#username').on('change', function(event) {
				// if($(this).val().length < 2 || $('#username').val().length > 10){
				// 	$(this).next('span').html('长度不正确！');
				// 	$(this).next('span').css('visibility', 'visible');
				// 	$(this).css('box-shadow','0 0 5px #FF0033');
				// 	$('.remodal-register').attr("disabled",true);
				// }
				// if($('#username').val().length > 1 && $('#username').val().length < 11) {
					check_name();
				// 	$('.remodal-register').attr("disabled",false);
				// }
			});

			function check_name() {
				$.ajax({
					url: 'user/checkname',
					type: 'post',
					dataType: 'text',
					contentType:'text/plain;charset=UTF-8',
					data:  $('#username').val(),
					success: function(data) {
						if(data == 'notExist'){
							console.log("用户名可以注册！");
							// $('#username').css('box-shadow','0 0 5px #00CC66');
						}
						else {
							console.log("用户名已被注册！");
							// $('#username').next('span').html("用户名已经被注册了");
							// $('#username').next('span').css('visibility', 'visible');
							// $('#username').css('box-shadow','0 0 5px #FF0033');
						}
					},
					beforeSend: function(data) {
						$('#loading').fadeIn('300');
					},
					complete: function(data) {
						$('#loading').fadeOut('300');
					}
				});
			};
			/*验证密码*/
			// $('#pwd').on('change', function(event) {
			// 	event.preventDefault();
			// 	if($(this).val().length < 6 || $('#username').val().length > 16){
			// 		$(this).next('span').html('长度不正确！');
			// 		$(this).next('span').css('visibility', 'visible');
			// 		$(this).css('box-shadow','0 0 5px #FF0033');
			// 		$('.remodal-register').attr("disabled",true);
			// 	}
			// 	if($('#username').val().length > 5 && $('#username').val().length < 17) {
			// 		check_pwd();
			// 		$('.remodal-register').attr("disabled",false);
			// 	}
			// });

			// function check_pwd() {

			// }


			// 用户退出
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
							$('#reg_log_btn').css('display', 'block');
							$('#login_info').css('display', 'none');
						}
					}
				});
			});
		});