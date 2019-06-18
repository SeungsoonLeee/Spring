package com.lee.mb2.main;

import org.apache.ibatis.session.SqlSession;

public class InsertMain {
	public static void main(String[] args) {
		SqlSession ss = null;

		try {
			ss = DBManager.connect();

			if (ss.insert("menuMapper.insertMenu") == 1) {
				System.out.println("메뉴 추가 성공");
				ss.commit(); // commit을 해주어야 완전히 들어간다 -> 주의할 것!
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메뉴 추가 실패");
		} finally {
			ss.close();
		}
	}
}
