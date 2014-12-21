package com.team4.platform.view;

import java.util.Date;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpEntity;

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
	
	/*@RequestMapping({ "/", "/addUser" })
	public String doAddUser(Map<String, Object> model) {
		BaseUser user = (BaseUser) model.get("user");
		try {
			iLoginService.insert(user);
		} catch (AppException e) {
			e.printStackTrace();
		}
		return "home";
	}*/
	
	/*@RequestMapping({ "/", "/userLogin" })
	public String doUserLogin(Map<String, Object> model) {
		String str = "loginFalse";
		BaseUser user = (BaseUser)model.get("user");
		String username = user.getContactName();
		loginService.search(baseModel, pageIndex, pageRows);
		String username =
		return str;
	}*/
//	原页面跳转至注册
	@RequestMapping({"/toUserRegister" })
	public String toUserRegister(Map<String, Object> model) {
		return "user/userRegister";
	}
	
	/**
	 * ��ת����������ҳ��
	 * @param model
	 * @return
	 */
	@RequestMapping({ "/", "/toContactUs" })
	public String toContactUs(Map<String, Object> model) {
		return "ContactAboutUS";
	}
	
	@ResponseBody
	@RequestMapping(value="/userRegister",method = RequestMethod.POST)
	public String doUserRegister(@RequestBody String reg_info) throws JSONException  {
		
		System.out.println("111");
		System.out.println(reg_info);
		JSONObject json = new JSONObject(reg_info);
		System.out.println(json.getString("username"));
		/*JSONArray jsonarr = new JSONArray(userinfo);
		JSONObject jsonobj = (JSONObject)jsonarr.get(0);
		System.out.println(jsonobj.get("name"));*/
//		System.out.println(user.getUsername()); 
//		try {
//			userService.insert(baseUser);
//		} catch (AppException e) {
//			e.printStackTrace();
//		}
		return "";
	}

	@RequestMapping({ "/", "/home" })
	public String showHomePage(Map<String, Object> model) {
		return "home";
	}
	@RequestMapping(value="/index")
	public String showIndex(Map<String, Object> model) {
		return "index";
	}
}
