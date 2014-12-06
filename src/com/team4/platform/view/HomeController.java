package com.team4.platform.view;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.base.core.exception.AppException;
import com.team4.platform.model.BaseUser;
import com.team4.platform.service.ILoginService;
import com.team4.platform.service.IUserService;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("iLoginService")
	private ILoginService iLoginService;
	
	@Autowired
	@Qualifier("iUserService")
	private IUserService userService;
	
	@RequestMapping({ "/", "/addUser" })
	public String doAddUser(Map<String, Object> model) {
		BaseUser user = (BaseUser) model.get("user");
		try {
			iLoginService.insert(user);
		} catch (AppException e) {
			e.printStackTrace();
		}
		return "home";
	}
	
	@RequestMapping({ "/", "/userLogin" })
	public String doUserLogin(Map<String, Object> model) {
		String str = "loginFalse";
		BaseUser user = (BaseUser)model.get("user");
		String username = user.getContactName();
//		loginService.search(baseModel, pageIndex, pageRows);
//		String username =
		return str;
	}
	@RequestMapping({ "/", "/toUserRegister" })
	public String toUserRegister(Map<String, Object> model) {
		return "user/userRegister";
	}
	
	/**
	 * 跳转到关于我们页面
	 * @param model
	 * @return
	 */
	@RequestMapping({ "/", "/toContactUs" })
	public String toContactUs(Map<String, Object> model) {
		return "ContactAboutUS";
	}
	
	@RequestMapping({ "/", "/userRegister" })
	public String doUserRegister(Map<String, Object> model, @ModelAttribute( "baseUser" ) BaseUser baseUser) {
		baseUser.setUsername("aaa");
		baseUser.setPwd("123");
		baseUser.setEmail("gzc@qq.com");
		baseUser.setTelphone("12312312312");
		baseUser.setContactName("李先生");
		baseUser.setRegistTime(new Date());
		baseUser.setContactAddress("-----------");
		try {
			userService.insert(baseUser);
		} catch (AppException e) {
			e.printStackTrace();
		}
		return "...";
	}

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Map<String, Object> model) {
		return "home";
	}
}
