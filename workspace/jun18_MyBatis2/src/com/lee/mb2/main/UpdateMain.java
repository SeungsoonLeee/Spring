package com.lee.mb2.main;

import java.math.BigDecimal;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

public class UpdateMain {
	public static void main(String[] args) {
		SelectMain allmenu = new SelectMain();
		SqlSession ss = null;
		Scanner sc = null;
		try {
			allmenu.getMenu();

			ss = DBManager.connect();
			sc = new Scanner(System.in);

			System.out.print("수정할 메뉴 : ");
			String search = sc.next();
			System.out.print("수정할 가격 : ");
			int p = sc.nextInt();
			BigDecimal p2 = new BigDecimal(p);

			Menu updateM = new Menu(search, p2);

			if (ss.update("menuMapper.updateMenu", updateM) == 1) {
				System.out.println("수정 성공");
				ss.commit(); // 항상 commit을 해주어야 한다는 것에 주의!
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("수정실패");
		} finally {
			ss.close();
			sc.close();
		}
	}
}
