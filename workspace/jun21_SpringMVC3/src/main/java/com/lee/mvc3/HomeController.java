package com.lee.mvc3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("contentPage", "home.jsp");
		return "index";
	}

	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String goHome(HttpServletRequest request, HttpServletResponse response) {

		return home(request, response);
	}
}
