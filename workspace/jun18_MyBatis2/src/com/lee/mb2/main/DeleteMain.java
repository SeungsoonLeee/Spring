package com.lee.mb2.main;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

public class DeleteMain {
	public static void main(String[] args) {
		SelectMain allmenu = new SelectMain();

		SqlSession ss = null;
		Scanner sc = null;
		try {
			allmenu.getMenu();

			ss = DBManager.connect();
			sc = new Scanner(System.in);

			System.out.print("삭제할 메뉴 : ");
			String del = sc.next();

			Menu deleteM = new Menu(del, null);

			if (ss.delete("menuMapper.deleteMenu", deleteM) == 1) {
				System.out.println("삭제 성공");
				ss.commit();
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("삭제 실패");
		} finally {
			ss.close();
			sc.close();
		}
	}
}
