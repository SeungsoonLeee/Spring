package com.lee.myblog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.myblog.member.MemberDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("loginPage", "member/login.jsp");
		request.setAttribute("contentPage", "home.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/home.go", method = RequestMethod.GET)
	public String goHome(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("loginPage", "member/login.jsp");
		request.setAttribute("contentPage", "home.jsp");
		return "index";
	}
}
