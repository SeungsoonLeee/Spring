package com.lee.mvc3.calculate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculateController {

	@Autowired
	CalculateDAO CDAO;
	
	@RequestMapping(value = "/calculate.go", method = RequestMethod.GET)
	public String calculate(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("contentPage", "calculate/calInput.jsp");

		return "index";
	}
	
	@RequestMapping(value = "/cal.do", method = RequestMethod.GET)
	public String cal(XY xy, HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("contentPage", "calculate/calInput.jsp");
		CDAO.cal(xy, request, response);
		
		return "index";
	}
	
	@RequestMapping(value = "/trans.do", method = RequestMethod.GET)
	public String trans(XY xy, HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("contentPage", "calculate/calInput.jsp");
		CDAO.trans(xy, request, response);
		
		return "index";
	}
}
