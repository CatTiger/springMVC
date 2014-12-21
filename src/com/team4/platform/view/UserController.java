package com.team4.platform.view;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.team4.base.core.exception.AppException;
import com.team4.platform.model.BaseUser;
import com.team4.platform.service.IUserService;
import com.team4.platform.service.impl.UserServiceImpl;

/**
 * @author chenzhq
 *用户登录注册控制类
 */
@Controller
@RequestMapping("/user")
//@SessionAttributes("user")
public class UserController {

	@Autowired
	@Qualifier("iUserService")
	private IUserService userService;
	
	
	
	/**
	 * 注册用户
	 * @param user session
	 * @return
	 * @throws AppException
	 * @throws JSONException 
	 */

	@RequestMapping(value="/userRegister",method = RequestMethod.POST)
	public @ResponseBody Object doUserRegister(@RequestBody String reg_info, HttpSession session) throws AppException, JSONException  {		
		BaseUser user = new BaseUser();
		JSONObject json = new JSONObject(reg_info);
		user.setUsername(json.getString("username"));
		user.setPwd(json.getString("pwd"));
		user.setTelphone(json.getString("telphone"));
		user.setEmail(json.getString("email"));
		user.setRegistTime(new Date());
		userService.insert(user);
		session.setAttribute("loginUser", user);
		System.out.println(session.getAttribute("loginUser"));
		return session.getAttribute("loginUser");
	}
	
	/**
	 * 验证用户名是否已被注册
	 * @param username
	 * @return
	 */
	
	@RequestMapping(value="/checkname",method = RequestMethod.POST)
	public @ResponseBody String checkName(@RequestBody String username) {
		System.out.println(username);
		if(userService.isExist(username)) {
			return "exist";
		}		
		return "noExist";
	}
	
	
	@RequestMapping(value="/userLogin",method = RequestMethod.POST)
	public @ResponseBody String userLogin() {
		return null;
	}
}
