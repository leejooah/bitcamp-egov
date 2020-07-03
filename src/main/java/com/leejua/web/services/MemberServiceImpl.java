package com.leejua.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leejua.web.domains.Member;
import com.leejua.web.mappers.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService{
 @Autowired MemberMapper memberMapper;

@Override
public void register(Member member) {
	memberMapper.insertMember(member);
	
}

@Override
public List<Member> findAll() {
	return memberMapper.selectAll();
}



}
