package com.leejua.web.controllers;


import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leejua.web.domains.Member;
import com.leejua.web.emuns.Messenger;
import com.leejua.web.proxies.Box;
import com.leejua.web.proxies.MemberProxy;
import com.leejua.web.services.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {
	@Autowired MemberService memberService;
	@Autowired MemberProxy memberProxy;
	@Autowired Box<String> box;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	
	
	@PostMapping("/join")
	public Messenger join(@RequestBody Member member ) {
		System.out.println("넘어온 회원 정보"+member.toString());
		//memberProxy.insertMembers(30);
		memberService.register(member);
		return Messenger.SUCCESS ;
	}

@PostMapping("/login")
public Map<?,?> login(@RequestBody Member member,HttpSession session) {
	System.out.println("넘어온 회원 정보"+member.toString());
	if(member.getEmail().equals("test1@test.com")){
		session.setAttribute("auth","admin");
	}else {
		session.setAttribute("auth", "user");
	}
	logger.info("session에 담긴 값 = "+session.getAttribute("auth"));
	box.clear();
	box.put("email", member.getEmail());
	box.put("auth", (String) session.getAttribute("auth"));
	
	return box.get();
}
	
@GetMapping("/{email}")
public Messenger logout(@PathVariable String email,HttpSession session) {
	logger.info("logout으로 넘어옴 = "+email);
	session.removeAttribute("auth"); //jsp에서 처리함
	return Messenger.SUCCESS;  //js에서 처리함
}	




}
