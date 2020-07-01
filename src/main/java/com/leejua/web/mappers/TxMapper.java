package com.leejua.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.leejua.web.domains.Member;



@Repository
public interface TxMapper { //txMapper에선 mybatis를 사용하지 마라.
	@Insert("insert into member (member_seq, email, password)"
			+ " values (#{memberSeq}, #{email}, #{password})")
	public void insertMember(Member member);
}
