package com.leejua.web.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
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
		
}
