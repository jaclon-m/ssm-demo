package com.jaclon.ssm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@ContextConfiguration({ "classpath:spring/spring-*.xml" })
public class AbstractContextControllerTests {

	@Autowired
	protected WebApplicationContext wac;
}