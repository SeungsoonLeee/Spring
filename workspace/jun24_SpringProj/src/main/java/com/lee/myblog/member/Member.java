package com.lee.myblog.member;

import java.util.Date;

public class Member {
	private String m_id;
	private String m_pw;
	private String m_name;
	private Date m_birth;
	private String m_cmt;
	private String m_photo;

	public Member() {

	}

	public Member(String m_id, String m_pw, String m_name, Date m_birth, String m_cmt, String m_photo) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_birth = m_birth;
		this.m_cmt = m_cmt;
		this.m_photo = m_photo;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public Date getM_birth() {
		return m_birth;
	}

	public void setM_birth(Date m_birth) {
		this.m_birth = m_birth;
	}

	public String getM_cmt() {
		return m_cmt;
	}

	public void setM_cmt(String m_cmt) {
		this.m_cmt = m_cmt;
	}

	public String getM_photo() {
		return m_photo;
	}

	public void setM_photo(String m_photo) {
		this.m_photo = m_photo;
	}

}
