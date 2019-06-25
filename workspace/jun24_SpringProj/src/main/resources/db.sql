create table jun24_member(
	m_id varchar2(20 char) not null primary key,
	m_pw varchar2(20 char) not null,
	m_name varchar2(20 char) not null,
	m_birth date not null,
	m_cmt varchar2(200 char) not null,
	m_photo varchar2(255 char) not null
)