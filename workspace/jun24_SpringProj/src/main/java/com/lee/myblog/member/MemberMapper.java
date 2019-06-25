package com.lee.myblog.member;

public interface MemberMapper {

	public abstract Member getMemberById(Member m);

	public abstract int join(Member m);

}