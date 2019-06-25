package com.lee.myblog.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {

	@Autowired
	MemberDAO MDAO;

	@RequestMapping(value = "/join.go", method = RequestMethod.GET)
	public String joinGo(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("loginPage", "member/login.jsp");
		request.setAttribute("contentPage", "member/join.jsp");
		return "index";
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String joinDo(Member m, HttpServletRequest request, HttpServletResponse response) {
		MDAO.join(m, request, response);
		request.setAttribute("loginPage", "member/login.jsp");
		request.setAttribute("contentPage", "member/joinSuccess.jsp");
		return "index";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String loginDo(Member m, HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("loginPage", "member/login.jsp");
		request.setAttribute("contentPage", "home.jsp");
		return "index";
	}
}
