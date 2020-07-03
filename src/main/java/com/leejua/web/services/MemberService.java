package com.leejua.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.leejua.web.domains.Member;

@Component
public interface MemberService {

	public void register(Member member);

	public List<Member> findAll();



}
