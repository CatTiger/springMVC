package com.team4.platform.view;

import java.util.Date;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ResponseBody;



import com.team4.base.core.exception.AppException;
import com.team4.platform.model.BaseUser;
import com.team4.platform.service.IUserService;


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
	 * @param user 
	 * @param session
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
		System.out.println(((BaseUser)session.getAttribute("loginUser")).getUsername());
		return user;
	}
	
	/**
	 * 验证用户名是否已被注册
	 * @param username
	 * @return
	 * @throws JSONException 
	 */
	
	@RequestMapping(value="/checkname",method = RequestMethod.POST)
	public @ResponseBody String checkName(HttpServletRequest username) throws JSONException {
		JSONObject json = new JSONObject();
		return userService.getUserByUserName(username.getParameter("param")) == null ?  json.put("info", "可以注册").put("status", "y").toString() : json.put("info", "已被注册").put("status", "n").toString();
	}
	
	/**
	 * 用户登录
	 * @param login_Info
	 * @param session
	 * @return
	 * @throws JSONException
	 */
	@RequestMapping(value="/userLogin",method = RequestMethod.POST)
	public @ResponseBody ModelMap userLogin(@RequestBody String login_Info,HttpSession session) throws JSONException {
		JSONObject json = new JSONObject(login_Info);
		ModelMap mm = new ModelMap();
		BaseUser user = userService.getUserByUserName(json.getString("username"));
		if(user == null) {
			mm.addAttribute("msg", "userNotExist");
			System.out.println("不存在用户名");					
		}else if(!user.getPwd().equals(json.getString("pwd"))) {
			mm.addAttribute("msg", "NotMatch");
			System.out.println("密码不正确");
		}else {
			session.setAttribute("loginUser", user);
			mm.addAttribute("msg", "success");
			mm.addAttribute("loginUser", user);
			System.out.println("登录成功");
		}
		System.out.println(mm);	
		return mm;
		
	}
	
	/**
	 * 用户退出
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/userLogout",method=RequestMethod.GET)
	public @ResponseBody String userLogout(HttpSession session) {
		System.out.println("退出之前：" + session.getAttribute("loginUser"));
		session.removeAttribute("loginUser");
		System.out.println("退出之后：" + session.getAttribute("loginUser"));
		return "success";
	}
	
	@RequestMapping(value="/userInfo")
	public String userInfo(HttpSession session) {
		System.out.println("跳转" + session.getAttribute("loginUser"));
		return "user/userInfo";
	}
}
