package com.leejua.web.controllers;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.leejua.web.services.MemberService;



@Controller
@SessionAttributes({"context","css","javascript","img"})
public class HomeController {
	@Autowired HttpSession session;
	@Autowired HttpServletRequest request;
	@Autowired MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("")
	public String home(HttpSession session, HttpServletRequest request) {
		logger.info("홈컨트롤러 들어옴");
			session.setAttribute("context", request.getContextPath());
			session.setAttribute("javascript", request.getContextPath()+"/resources/js");
			session.setAttribute("css", request.getContextPath()+"/resources/css");
			session.setAttribute("img", request.getContextPath()+"/resources/img");
		
		return "main/Home.tiles";
	}
		@GetMapping("loan/home")
		public String loanHome() {
			logger.info("대출 홈으로");
			return "loan/LoanHome.tiles";
		}
		
		@GetMapping("loan/personal_loans")
		public String PersonalLoans() {
			logger.info("신용대출리스트");
			return "loan/PersonalLoans.tiles";
		}
		@GetMapping("member/list")
		public String MemberList(Model model) {
			logger.info(memberService.findAll().toString());
			model.addAttribute("members", memberService.findAll());
			return "member/UserList.tiles";
		}
}
