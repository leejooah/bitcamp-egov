package com.leejua.web.proxies;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.leejua.web.controllers.HomeController;
import com.leejua.web.domains.Member;
import com.leejua.web.mappers.TxMapper;


@Component("manager")
public class MemberProxy extends Proxy {
@Autowired TxMapper txMapper; 
@Autowired Box<String> box;
private int seq;
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

public MemberProxy() {
	seq=1;
}
public String makeEmail() {
	String email = "test"+seq+"@test.com";
	return email;
}

public void add() {
		seq++;
}

public String makePassword() {
	return "1234";
}
public Member makeMember() {
	Member member = new Member();
	member.setMemberSeq(seq);
	member.setEmail(makeEmail());
	member.setPassword(makePassword());
	return member;
}


//포인트컷 시킨다 그런데 따로 뽑아도 됨( 다른 쿼리문이 들어가지 않기 위해 lock을 걸어준다.)
@Transactional
public void insertMembers(int count) {
	for (int i = 0; i <count; i++) {
		txMapper.insertMember(makeMember());
		add();
	}
}



}
