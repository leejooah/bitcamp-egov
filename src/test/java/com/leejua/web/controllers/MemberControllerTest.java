package com.leejua.web.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.leejua.web.proxies.MemberProxy;
import com.leejua.web.services.MemberService;

/**
 * @FileName :  MemberControllerTest.java
 * @Project : 서비스 이용자의 정보를 분석하여 최적의 대출상품을 추천하고 연결시켜주는 서비스
 * @Date : 2020. 7. 3.
 * @작성자 : 이주아
 */
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:META-INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})
public class MemberControllerTest {
	private MemberService memberService;
	
	   
	@Test
	public void testJoin() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.leejua.web.controllers.MemberController#login(com.leejua.web.domains.Member, javax.servlet.http.HttpSession)}.
	 */
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.leejua.web.controllers.MemberController#logout(java.lang.String, javax.servlet.http.HttpSession)}.
	 */
	@Test
	public void testLogout() {
		fail("Not yet implemented");
	}

}
