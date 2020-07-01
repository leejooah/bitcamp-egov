package com.leejua.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leejua.web.domains.Member;
import com.leejua.web.emuns.Messenger;
import com.leejua.web.proxies.MemberProxy;
import com.leejua.web.services.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	@Autowired MemberService memberService;
	@Autowired MemberProxy memberProxy;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
	
	@PostMapping("/join")
	public Messenger join(@RequestBody Member member ) {
		System.out.println("넘어온 회원 정보"+member.toString());
		memberProxy.insertMembers(10);
		
		return Messenger.SUCCESS ;
	}


}
