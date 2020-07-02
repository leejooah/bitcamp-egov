package com.leejua.web.tests;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
/**
 * @FileName :  HelloTest.java
 * @Project : 서비스 이용자의 정보를 분석하여 최적의 대출상품을 추천하고 연결시켜주는 서비스
 * @Date : 2020. 7. 2.
 * @작성자 : 이주아
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/META-INF/*-context.xml")
public class HelloTest {
                @Autowired
                @Qualifier
                @Test
                public void testSayHello() {
                                fail("Not yet implemented");
                }
                /**
                 * Test method for {@link com.leejua.web.tests.Hello#print()}.
                 */
                @Test
                public void testPrint() {
                                fail("Not yet implemented");
                }
}