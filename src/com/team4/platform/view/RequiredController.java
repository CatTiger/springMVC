package com.team4.platform.view;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.team4.platform.service.ILoginService;

@Controller
public class RequiredController {
	
	@Autowired
	@Qualifier("iLoginService")
	private ILoginService iLoginService;
	
	@RequestMapping({ "/required", "/requiredBook" })
	public String showRequiredBookPage(Map<String, Object> model) {
		return "required/requiredBook";
	}
}
