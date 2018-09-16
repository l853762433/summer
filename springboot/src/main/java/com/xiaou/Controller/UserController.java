package com.xiaou.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaou.pojo.User;
import com.xiaou.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/")
	public String Login() {
		return "redirect:index.jsp";
	}
	@RequestMapping("/show/{jsp}")
	public String productShow(@PathVariable String jsp) {
		return jsp;
	}
	
	@RequestMapping("/login.action")
	public String UserLogin(User user,HttpSession session) {
		User reUser = userService.UserLogin(user);
		if(null == reUser) {
			return "index";
		}
		session.setAttribute("user", reUser);
		return "redirect:/productList";
	}
	
}
