package com.lee.myFirstApp.calculate;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

// Spring에서의 singleton 처리는 jsp와 다르다.
// servlet-context.xml에 아무곳에 자리를 잡고 beans:bean으로 객체를 생성 후
// Controller에서 불러다 사용한다.

// @Service를 통해 servlet-context.xml에 내부적으로 등록을 해줌
// servlet-context.xml에 코딩해주지 않아도 @AutoWired로 땡겨 쓸 수 있음
@Service
public class M {
	void test() {
		System.out.println("하하 테스트");
	}
	
	//값을 넘겨주기 위해서 Model 객체를 사용.
	public void calPlus(XY xy, Model mo) {
		System.out.println("더하기 계산");
		
		int r = xy.getX() + xy.getY();
		System.out.println(r);
		
		//결과값 r을 result라는 파라메터로 넘겨줌
		mo.addAttribute("result",r);
	}
}
