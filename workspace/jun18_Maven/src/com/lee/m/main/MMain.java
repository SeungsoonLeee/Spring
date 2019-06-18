package com.lee.m.main;

//Maven 
// 프로젝트 관리 프레임워크
// 간단히 말해 .jar파일을 관리해 주는 프레임워크
// 중앙저장소(MVNrepository.com)에 .jar들이 업로드 되어 있음
// 필요한 .jar를 로컬저장소(C:\사용자\계정\.m2\repository)에 받아와 프로젝트에 넣어줌.

// xml을 파싱 하고 싶다  -> kxml 필요
// json을 파싱하고 싶ㄷ -> json-parsing 필요

// 1. java 프로젝트를 maven 프로젝트로 변경
//  project 우클릭 -> configure -> convert to maven project
// 2. MVNrepository.com 에서 원하는 .jar파일 검색 후 maven xml코드 복사
// 3. pom.xml에 source 상태로 붙여넣기 
//	  </build>
//	   <dependencies>
//	     <!-- https://mvnrepository.com/artifact/net.sf.kxml/kxml2 -->
//	     <dependency>
//		   <groupId>net.sf.kxml</groupId>
//		   <artifactId>kxml2</artifactId>
//		   <version>2.3.0</version>
//	   </dependency>
//	   <dependency>
//		   <groupId>com.googlecode.json-simple</groupId>
//		   <artifactId>json-simple</artifactId>
//		   <version>1.1.1</version>
//	   </dependency>
//	  </dependencies>
//	 </project>

public class MMain {
	public static void main(String[] args) {
		
	}
}
