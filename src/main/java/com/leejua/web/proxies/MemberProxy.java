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
private int i;
private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

public MemberProxy() {
	i=0;
}
public String makeEmail() {
	String email = "test@test.com";
	return email;
}

public void add() {
		i++;
		logger.info("메소드 add 실행 결과 = "+i);
}

public String makePassword() {
	return "1234";
}

//포인트컷 시킨다 그런데 따로 뽑아도 됨( 다른 쿼리문이 들어가지 않기 위해 lock을 걸어준다.)
@Transactional
public void insertMembers(int count) {
	for (int i = 0; i <count; i++) {
		txMapper.insertMember(makeMember());
		add();
		logger.info("for문 1번 반복함");
	}
}

public Member makeMember() {
	Member member = new Member();
	member.setMemberSeq(i);
	member.setEmail(makeEmail());
	member.setPassword(makePassword());
	return member;
}


}
