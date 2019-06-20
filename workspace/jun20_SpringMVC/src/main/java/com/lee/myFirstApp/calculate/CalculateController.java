package com.lee.myFirstApp.calculate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 프로젝트 생성 시 com.lee.myFirstApp -> base-package
// 패키지를 새로 만들 때 base-package + 알파  -> base-package는 손상되면 안됨.
// com.lee.myFirstApp.alpha  이런 식으로 생성해야 한다.

@Controller
public class CalculateController {
	// 요청으로부터 값을 받아오는 방법은 여러가지.
	// 1번째. jsp와 같은 방법
//	@RequestMapping(value = "/calPlus.do", method = RequestMethod.GET)
//	public String calPlus(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("더하기 계산");
//
//		int x = Integer.parseInt(request.getParameter("x"));
//		int y = Integer.parseInt(request.getParameter("y"));
//		System.out.println(x + y);
//
//		return "index"; // index.jsp로 포워딩한다는 의미
//	}

	// 2번째. Spring 방법
//	@RequestMapping(value = "/calPlus.do", method = RequestMethod.GET)
//	public String calPlus(@RequestParam(value = "x") int x, @RequestParam(value = "y") int y) {
//		System.out.println("더하기 계산");
//
//		System.out.println(x + y);
//
//		return "index"; // index.jsp로 포워딩한다는 의미
//	}
	
	// 3번째. 가장 많이 사용(객체로 만듦)
	@RequestMapping(value = "/calPlus.do", method = RequestMethod.GET)
	public String calPlus(XY xy) {
		System.out.println("더하기 계산");
		
		System.out.println(xy.getX() + xy.getY());

		return "index"; // index.jsp로 포워딩한다는 의미
	}
}
