package com.lee.mvc2.name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// GET방식 요청의 한글처리 : tomcat
// POST방식 요청의 한글처리
//  JSP - 최초로 파라메터 값을 읽기 전 requset.setCharacerEncoding("");
//  Spring - web.xml에 한글처리를 위한 코드 추가
@Controller
public class NameController {
	
	@Autowired
	private NameDAO NDAO;
	
	@RequestMapping(value = "/print.name", method = RequestMethod.POST)
	public String printName(Name n, HttpServletRequest request, HttpServletResponse response) {
		NDAO.getFullName(n, request, response);
		
		return "index";
	}
}
