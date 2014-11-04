package com.team4.platform.view;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.base.core.exception.AppException;
import com.team4.platform.model.User;
import com.team4.platform.service.ILoginService;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("iLoginService")
	private ILoginService iLoginService;
	
	@RequestMapping({ "/", "/addUser" })
	public String doAddUser(Map<String, Object> model) {
		User user = (User) model.get("user");
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
		User user = (User)model.get("user");
		String username = user.getName();
//		loginService.search(baseModel, pageIndex, pageRows);
//		String username =
		return str;
	}

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Map<String, Object> model) {
		return "home";
	}
}
