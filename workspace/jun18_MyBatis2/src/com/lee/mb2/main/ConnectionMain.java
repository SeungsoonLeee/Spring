package com.lee.mb2.main;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//필요한 .jar파일
//mybatis, 관련 .jar파일
//ojdbc

//ojdbc는 maven에 없기 떄문에 사설 저장소에서 불러와야함.
//1. pom.xml 에 dependeucies 바로 위에 아래 코드 추가
//	<repositories>
//		<repository>
//			<id>codelds</id>
//			<url>https://code.lds.org/nexus/content/groups/main-repo</url>
//		</repository>
//	</repositories>
//2. 해당 사이트(https://code.lds.org/nexus/content/groups/main-repo/)에 들어가 써줌
//		<dependency>
//			<groupId>com.oracle</groupId>
//			<artifactId>ojdbc7</artifactId>
//			<version>12.1.0.2</version>
//		</dependency>

//Mybatis : DB ORM(Object Relation Mapping) Framework
// 자바 객체와 자동으로 맵핑

//DB연결				연결정보			sql문
//JDBC				.java에			.java에
//Connection Pool	context.xml에	.java에
//Mybatis			임의의.xml에		임의의.xml에
//			통상적으로	config.xml		mapper.xml

//JDBC와 ConnectionPool : Connectio 객체 사용
//MyBatis : SqlSession 객체 사용

public class ConnectionMain {
	public static void main(String[] args) {
		SqlSession ss = null;

		try {
			// 서버 연결 정보가 있는 파일명을 가져온다.
			String cfgFile = "config.xml"; // 패키지 안에 넣었을 경우 패키지 경로를 모두 써준다("com/lee/mb2/main/config.xml")
			InputStream is = Resources.getResourceAsStream(cfgFile);

			// SqlSession 생성 순서
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			SqlSessionFactory ssf = ssfb.build(is);
			ss = ssf.openSession();

			System.out.println("DB연결 성공");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		} finally {
			ss.close();
		}
	}
}
