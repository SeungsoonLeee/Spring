package com.lee.mb2.main;

import java.math.BigDecimal;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

public class InsertMain2 {
	public static void main(String[] args) {
		SqlSession ss = null;
		Scanner sc = null;

		try {
			ss = DBManager.connect();

			sc = new Scanner(System.in);
			System.out.print("메뉴 이름 : ");
			String m = sc.next();
			System.out.print("가격 : ");
			int p = sc.nextInt();
			// BigDemal이기 떄문에 형변환을 해주어야 함.
			BigDecimal p2 = new BigDecimal(p);
			// 반대로 할때에는
			int p3 = p2.intValue();

			// 값을 받은 후 객체를 생성하여 MyBatis에 넘겨주어야 함.
			Menu menus = new Menu(m, p2);

			// insert 할 때 객체를 넣어서 실행.
			if (ss.insert("menuMapper.insertMenu2", menus) == 1) {
				System.out.println("메뉴 추가 성공");
				ss.commit(); // commit을 해주어야 완전히 들어간다 -> 주의할 것!
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메뉴 추가 실패");
		} finally {
			ss.close();
			sc.close();
		}
	}
}