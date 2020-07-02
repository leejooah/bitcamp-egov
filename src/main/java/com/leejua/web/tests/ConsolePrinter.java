package com.leejua.web.tests;

/**
 * @FileName :  ConsolePrinter.java
 * @Project : 서비스 이용자의 정보를 분석하여 최적의 대출상품을 추천하고 연결시켜주는 서비스
 * @Date : 2020. 7. 2.
 * @작성자 : 이주아
 */
public class ConsolePrinter  implements Printer{
	  public void print(String message) {
	        System.out.println(message);
	    }
}
