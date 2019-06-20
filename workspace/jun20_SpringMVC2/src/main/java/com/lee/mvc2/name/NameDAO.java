package com.lee.mvc2.name;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

@Service
public class NameDAO {
	public void getFullName(Name name, HttpServletRequest request, HttpServletResponse response) {
		//model 방식은 세션과 쿠키를 사용할 수 없으므로 jsp에서 썼던 방법을 따르는 것이 좋다.
		System.out.println("성 : " + name.getLastName());
		System.out.println("이름 : " + name.getFirstName());
		
		String fullName = name.getLastName() + name.getFirstName(); 
		request.setAttribute("fullName", fullName);
	}
}
