package com.leejua.web.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leejua.web.proxies.Box;

/**
 * @FileName :  Calculator.java
 * @Project : 서비스 이용자의 정보를 분석하여 최적의 대출상품을 추천하고 연결시켜주는 서비스
 * @Date : 2020. 7. 3.
 * @작성자 : 이주아
 */
@Component
public class Calculator {
		@Autowired Box<Integer> box;
		
		public int sum(int a, int b) {
			box.put("res", a+b);
			return box.get("res");
		}
		
		public int substract(int a, int b) {
			return a - b;
		}
		
		public int absoluteVal(int a) {
			return Math.abs(a);
		}
}
