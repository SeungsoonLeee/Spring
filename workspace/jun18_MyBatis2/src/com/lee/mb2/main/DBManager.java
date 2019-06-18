package com.lee.mb2.main;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBManager {
	public static SqlSession connect() throws IOException{
		String cfgFile = "config.xml"; // 패키지 안에 넣었을 경우 패키지 경로를 모두 써준다("com/lee/mb2/main/config.xml")
		InputStream is = Resources.getResourceAsStream(cfgFile);

		// SqlSession 생성 순서
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = ssfb.build(is);
		return ssf.openSession();
	}
}
