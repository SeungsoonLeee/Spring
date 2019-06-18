package com.lee.mb2.main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class SelectMain {
	public static void main(String[] args) {
		SqlSession ss = null;

		try {
			ss = DBManager.connect();

			List<Menu> menus = ss.selectList("menuMapper.selectMenu"); // list 객체로 바로 불러옴

			for (Menu m : menus) {
				System.out.println(m.getName());
				System.out.println(m.getPrice());
				System.out.println();
			}

			System.out.println("메뉴 조회 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메뉴 조회 실패");
		} finally {
			ss.close();
		}
	}

	public void getMenu() {
		SqlSession ss = null;

		try {
			ss = DBManager.connect();

			List<Menu> menus = ss.selectList("menuMapper.selectMenu"); // list 객체로 바로 불러옴

			for (Menu m : menus) {
				System.out.println(m.getName());
				System.out.println(m.getPrice());
				System.out.println();
			}

			System.out.println("메뉴 조회 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메뉴 조회 실패");
		} finally {
			ss.close();
		}
	}
}
