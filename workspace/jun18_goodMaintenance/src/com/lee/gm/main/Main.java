package com.lee.gm.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

//.java -> 컴파일 -> .class(수정이 어려움)
//따라서 수저잉 일어날 만한 부분을 .java 외부로 보내고
//프로그램에서 그 파일을 읽어와 사용하도록

//전자정부표준프레임워크
//MyBatis : DB연결, CRUD작업 유지보수에 용이하게 
//Maven : 프로젝트(.jar)관리 유지보수에 용이하게
//Spring : 자바 개발 유지보수에 용이하게 해주는 프레임워크
//프레임워크 : 규칙대로 하면 자동으로 처리되는 환경
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력 : ");
		int price = sc.nextInt();
		
		try {
			FileReader fr = new FileReader("D:/point.txt");
			BufferedReader br = new BufferedReader(fr);
			String percent = br.readLine();
			
			double percent2 = Double.parseDouble(percent);
			double point = price * percent2;

			System.out.printf("포인트 : %.0f\n", point);
			sc.close();
		
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
