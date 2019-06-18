package com.lee.mb2.main;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

public class PracticeSQL {
	public static void main(String[] args) {
		SqlSession ss = null;
		Scanner sc = null;

		try {
			SelectMain allMenu = new SelectMain();

			ss = DBManager.connect();

			System.out.println("모드 선택(1.조회  2.수정  3.삭제  4.상세조회)");
			System.out.print("입력 : ");
			sc = new Scanner(System.in);
			int op = sc.nextInt();

			switch (op) {
			case 1: // 조회
				System.out.print("얼마부터 : ");
				BigDecimal startP = sc.nextBigDecimal();
				System.out.print("얼마까지 : ");
				BigDecimal endP = sc.nextBigDecimal();

				// 기존의 Menu객체는 price를 하나만 받을 수 있기 때문에 새로운 객체를 만들어서 값을 전달할 수 밖에 없다.
				Price p1 = new Price(startP, endP);
				List<Menu> m1 = ss.selectList("menuMapper.selectStartEndMenu", p1);

				for (Menu m : m1) {
					System.out.println(m.getName());
					System.out.println(m.getPrice());
					System.out.println();
				}

				break;
			case 2: // 수정
				System.out.print("얼마 이하 : ");
				BigDecimal lowerP = sc.nextBigDecimal();
				System.out.print("올릴 가격 : ");
				BigDecimal upP = sc.nextBigDecimal();

				// 기존의 Menu객체는 price를 하나만 받을 수 있기 때문에 새로운 객체를 만들어서 값을 전달할 수 밖에 없다.
				Price p2 = new Price(lowerP, upP);

				if (ss.update("menuMapper.updateUpperMenu", p2) >= 1) {
					ss.commit();
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}

				allMenu.getMenu();
				break;
			case 3: // 삭제
				System.out.print("얼마 이하 삭제 : ");
				BigDecimal upperP = sc.nextBigDecimal();

				Menu m3 = new Menu(null, upperP);

				if (ss.delete("menuMapper.deleteLowerMenu", m3) >= 1) {
					ss.commit();
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}

				allMenu.getMenu();
				break;

			case 4: // 상세조회
				System.out.print("메뉴명 : ");
				String searchName = sc.next();
				System.out.print("얼마부터 : ");
				BigDecimal searchStartP = sc.nextBigDecimal();
				System.out.print("얼마까지 : ");
				BigDecimal searchEndP = sc.nextBigDecimal();

				Menu m4 = new Menu(searchName, searchStartP, searchEndP);
				List<Menu> menus = ss.selectList("menuMapper.detailSearchMenu", m4);
				
				for(Menu m : menus) {
					System.out.println(m.getName());
					System.out.println(m.getPrice());
					System.out.println();
				}
				
				System.out.println("조회 성공");

				break;
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			ss.close();
			sc.close();
		}
	}
}
