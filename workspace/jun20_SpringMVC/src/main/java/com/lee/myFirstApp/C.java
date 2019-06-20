package com.lee.myFirstApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//JSP의 주소 : IP주소:PORT번호/프로젝트 명/컨트롤러 명
//-> Controller가 get하나 post하나뿐이기 때문에 많은 Controller가 필요하게 된다.

//Spring의 주소 : IP주소:PORT번호/패키지의 마지막자리/임의의 이름(@RequestMapping 에 매핑된 value)
//-> Controller 하나로 모든 사이트에 요청 주고 받기 가능

//MVC중 C를 Servlet이 아니라 @Controller가 붙은 일반 클래스로
@Controller
public class C {
	//메서드를 요청에 매핑 시켜준다.
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String danfjgrpsk() {
		System.out.println("아무렇게나");
		return "index"; //index.jsp로 포워딩한다는 의미
	}
}
