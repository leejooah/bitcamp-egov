package com.leejua.web.domains;

import org.springframework.context.annotation.Lazy;
/**
 * @FileName :  Member.java
 * @Project : 서비스 이용자의 정보를 분석하여 최적의 대출상품을 추천하고 연결시켜주는 서비스
 * @Date : 2020. 7. 1.
 * @작성자 : 이주아
 * @설명 : 서비스 이용자 DTO
 * email : 이용자 이메일
 * password : 이용자 패스워드
 */
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Lazy
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Member {
private int memberSeq;
private String email, password;
}
