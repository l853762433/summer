package com.xiaou.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.xiaou.pojo.User;

public class LoginInterceptor implements HandlerInterceptor{
	public  boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user == null) {
			response.sendRedirect("/");
			return false;
		}
		return true;
	}
}
