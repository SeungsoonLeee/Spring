package com.lee.mvc3.calculate;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateDAO {
	
	@Autowired
	private CalculateSelect cs;
	
	public void cal(XY xy, HttpServletRequest request, HttpServletResponse response) {
		ArrayList<String> result = new ArrayList<String>();
		String cal = "";
		for(String s : cs.getOp()) {
			if(s.equals("+")) {
				cal = String.format("%d + %d = %d", xy.getX(), xy.getY(), xy.getX() + xy.getY());
				result.add(cal);
			} else if(s.equals("-")) {
				cal = String.format("%d - %d = %d", xy.getX(), xy.getY(), xy.getX() - xy.getY());
				result.add(cal);
			} else if(s.equals("*")) {
				cal = String.format("%d * %d = %d", xy.getX(), xy.getY(), xy.getX() * xy.getY());
				result.add(cal);
			} else if(s.equals("/")) {
				cal = String.format("%d / %d = %.2f", xy.getX(), xy.getY(), (double)xy.getX() / (double)xy.getY());
				result.add(cal);
			}
		}
		
		request.setAttribute("x", xy.getX());
		request.setAttribute("y", xy.getY());
		request.setAttribute("result", result);
	}
	
	public void trans(XY xy, HttpServletRequest request, HttpServletResponse response) {
		ArrayList<String> result = new ArrayList<String>();
		
		request.setAttribute("result2", result);
	}
}
