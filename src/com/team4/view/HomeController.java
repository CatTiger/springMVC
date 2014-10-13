package com.team4.view;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team4.service.BaseService;

@Controller
public class HomeController {
	
	private BaseService baseService;
	
	@Autowired
	public HomeController(BaseService baseService) {
		this.baseService = baseService;
	}
	
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model) {
		return "home";
		
	}
}
