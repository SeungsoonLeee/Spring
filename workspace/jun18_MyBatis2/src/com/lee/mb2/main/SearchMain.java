package com.lee.mb2.main;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

public class SearchMain {
	public static void main(String[] args) {
		SqlSession ss = null;
		Scanner sc = null;
		try {
			ss = DBManager.connect();
			sc = new Scanner(System.in);

			System.out.print("검색 : ");
			String search = sc.next();

			Menu searchM = new Menu(search, null);

			List<Menu> menus = ss.selectList("menuMapper.searchMenu", searchM); // list 객체로 바로 불러옴

			for (Menu m : menus) {
				System.out.println(m.getName());
				System.out.println(m.getPrice());
				System.out.println();
			}

			System.out.println("검색 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("검색 실패");
		} finally {
			ss.close();
			sc.close();
		}
	}
}
