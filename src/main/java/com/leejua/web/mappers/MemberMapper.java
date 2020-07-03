package com.leejua.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.leejua.web.domains.Member;



@Repository
public interface MemberMapper {

	public void insertMember(Member member);

	public List<Member> selectAll();
	

}
