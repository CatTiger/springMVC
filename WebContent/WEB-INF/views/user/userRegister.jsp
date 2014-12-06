<jsp:include page="../header.jsp" flush="true" />
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		
	});
</script>
<div class="contact_form">
	<div class="form_subtitle">create new account</div>
	<form name="register" action="userRegister">
		<div class="form_row">
			<label class="contact"><strong>用户名:</strong></label> <input
				type="text" class="contact_input" name="username"/>
		</div>


		<div class="form_row">
			<label class="contact"><strong>密码:</strong></label> <input
				type="text" class="contact_input" name="pwd"/>
		</div>

		<div class="form_row">
			<label class="contact"><strong>邮箱:</strong></label> <input
				type="text" class="contact_input" name="email"/>
		</div>


		<div class="form_row">
			<label class="contact"><strong>手机号码:</strong></label> <input
				type="text" class="contact_input" name="telphone"/>
		</div>

		<div class="form_row">
			<label class="contact"><strong>联系名称:</strong></label> <input
				type="text" class="contact_input" name="contactName"/>
		</div>

		<div class="form_row">
			<label class="contact"><strong>常用住址:</strong></label> <input
				type="text" class="contact_input" name="contactAddress"/>
		</div>
		
		<div class="form_row">
			<label class="contact"><strong>qq号:</strong></label> <input
				type="text" class="contact_input" name="userQq"/>
		</div>

		<div class="form_row">
			<input type="submit" class="register" value="register" />
		</div>
	</form>
	
	
</div>
