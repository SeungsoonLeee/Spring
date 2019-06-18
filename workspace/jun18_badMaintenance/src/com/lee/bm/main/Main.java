package com.lee.bm.main;

import java.util.Scanner;

//개발(.java 작성)
//-> 컴파일(.class)
//-> 테스트
//-> 고객이 사용할 수 있는 형태로 출시(.class들을 압축 -> .jar) 
//-> 실행을 편하게 할 수 있게(.bat) [java -jar 파일명.jar]

//.java 수정
//-> 테스트
//-> 다시 컴파일(.class)
//-> 다시 압축(.jar)
//-> .bat 다시 작성

//구매한 금액을 입력하면
//해당 금액의 5%를 포인트로.
//금액 입력시 포인트를 출력.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("금액 입력 : ");
		int price = sc.nextInt();
		double point = (price * 0.05);

		System.out.printf("포인트 : %.0f\n", point);
		sc.close();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
