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
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.instanceOf;
/**
 * @FileName :  CalculatorTest.java
 * @Project : 서비스 이용자의 정보를 분석하여 최적의 대출상품을 추천하고 연결시켜주는 서비스
 * @Date : 2020. 7. 3.
 * @작성자 : 이주아
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:META-INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})
public class CalculatorTest {
                                @Autowired Calculator mock;
                /**
                 * Test method for {@link com.leejua.web.tests.Calculator#sum(int, int)}.
                 */
                @Test
                public void testSum() {
                                assertThat(mock.sum(1,1), equalTo(2));
                }
                /**
                 * Test method for {@link com.leejua.web.tests.Calculator#substract(int, int)}.
                 */
                @Ignore
                public void testSubstract() {
                                assertThat(mock.sum(1,1), equalTo(0));
                }
                /**
                 * Test method for {@link com.leejua.web.tests.Calculator#absoluteVal(int)}.
                 */
                @Ignore
                public void testAbsoluteVal() {
                                assertThat(mock.sum(1,1), equalTo(1));
                }
}
