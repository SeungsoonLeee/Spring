package com.lee.mvc3.member;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Service
public class MemberDAO {

//	public void join(Member m, HttpServletRequest request, HttpServletResponse response) {
//		m.setPhone(request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3"));
//		
//		//줄바꿈을 위한 작업
//		String cmt = m.getComment().replace("\r\n", "<br>");
//		m.setComment(cmt);
//		
//		//생년월일 처리를 위한 작업
//		String b = request.getParameter("birth2");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//		try {
//			Date b2 = sdf.parse(b);
//			m.setBirth(b2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		request.setAttribute("m", m);
//	}
	
	
	//파일 업로드를 하기 위해 enctype을 설정해주면 spring 방식은 전혀 사용할 수 없음.
	//파일 업로드를 위해서는 아래의 JSP 때의 코드로 모두 바꾸어주어야 한다.
	public void join(Member m, HttpServletRequest request, HttpServletResponse response) {
		
		try {
			//파입 업로드 처리를 위한 작업
			String path = request.getSession().getServletContext().getRealPath("resources/img");
			System.out.println(path);
			
			MultipartRequest mr = new MultipartRequest(request, path, 30*1024*1024, "utf-8", new DefaultFileRenamePolicy());
			String photo = mr.getFilesystemName("photo");
			
			//생년월일 처리를 위한 작업
			String b = mr.getParameter("birth2");
			SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
			Date b2 = sdf.parse(b);
			
			//인사말 처리를 위한 작업
			String cmt = mr.getParameter("comment").replace("\r\n", "<br>");
			
			m.setId(mr.getParameter("id"));
			m.setName(mr.getParameter("id"));
			m.setBirth(b2);
			m.setPhone(mr.getParameter("phone1") + "-" + mr.getParameter("phone2") + "-" + mr.getParameter("phone3"));
			m.setComment(cmt);
			m.setPhoto(photo);
			
			request.setAttribute("m", m);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
