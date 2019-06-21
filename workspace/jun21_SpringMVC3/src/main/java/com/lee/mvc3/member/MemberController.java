package com.lee.mvc3.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
	@Autowired
	MemberDAO MDAO;
	
	@RequestMapping(value = "/join.go", method = RequestMethod.GET)
	public String calculate(Member m, HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("contentPage", "member/join.jsp");
		
		return "index";
	}
	
	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public String join(Member m, HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("contentPage", "member/joinSuccess.jsp");
		MDAO.join(m, request, response);
		
		return "index";
	}
}
