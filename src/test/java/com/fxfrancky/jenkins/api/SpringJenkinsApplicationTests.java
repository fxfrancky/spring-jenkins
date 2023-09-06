package com.fxfrancky.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AbstractContextLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	public contextLoads() {
		logger.info("Test case executing...");
//		logger.info("Test case executing third log statement...");
		assertEquals(Boolean.TRUE,true);
	}

}
