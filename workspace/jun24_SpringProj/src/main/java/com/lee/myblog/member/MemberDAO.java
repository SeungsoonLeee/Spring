package com.lee.myblog.member;

import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@Service
public class MemberDAO {
	
	@Autowired
	private SqlSession ss;
	
	public void join(Member m, HttpServletRequest request, HttpServletResponse response) {
		// 파입 업로드 경로
		String path = request.getSession().getServletContext().getRealPath("resources/img");
		MultipartRequest mr = null;
		String photo = null;
		try {
			mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "utf-8",	new DefaultFileRenamePolicy());
			photo = mr.getFilesystemName("photo");
			photo = URLEncoder.encode(photo, "utf-8");
			photo = photo.replace("+", " ");
		} catch (Exception e) {
			request.setAttribute("result", "가입실패");
			e.printStackTrace();
			return;
		}
			
		try {
			// 생년월일 처리를 위한 작업
			String b = mr.getParameter("birth2");
			SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
			Date b2 = sdf.parse(b);

			// 인사말 처리를 위한 작업
			String cmt = mr.getParameter("comment").replace("\r\n", "<br>");

			m.setM_id(mr.getParameter("id"));
			m.setM_name(mr.getParameter("name"));
			m.setM_birth(b2);
			m.setM_cmt(cmt);
			m.setM_photo(photo);
			
			if(ss.getMapper(MemberMapper.class).join(m) == 1) {
				request.setAttribute("result", "성공");
			}
			request.setAttribute("m", m);

		} catch (Exception e) {
			try {
				request.setAttribute("result", "실패");
				photo = URLDecoder.decode(photo, "utf-8");
				new File(path + "/" + photo).delete();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			request.setAttribute("result", "가입 실패");
			e.printStackTrace();
		}
	}
	
	public void loignCheck(HttpServletRequest request, HttpServletResponse response) {
		
		
	}
}
