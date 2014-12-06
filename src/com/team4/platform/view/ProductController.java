package com.team4.platform.view;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.platform.service.ILoginService;
import com.team4.platform.service.IUserService;

@Controller
public class ProductController {
	
	@Autowired
	@Qualifier("iLoginService")
	private ILoginService iLoginService;
	
	@Autowired
	@Qualifier("iUserService")
	private IUserService userService;
	
	@RequestMapping({ "/", "/toPublishPage" })
	public String toUserRegister(Map<String, Object> model) {
		return "product/publishPage";
	}
	
	

}
