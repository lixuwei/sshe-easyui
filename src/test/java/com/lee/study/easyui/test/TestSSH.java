package com.lee.study.easyui.test;


import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lee.study.easyui.domain.Tuser;
import com.lee.study.easyui.exception.TuserException;
import com.lee.study.easyui.service.TuserService;

public class TestSSH {

ApplicationContext ac;
	
	@Before
	public void before(){
		ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate3.xml"});
	}
	
	@Test
	public void test(){                                        
		TuserService tuserService = (TuserService) ac.getBean("tuserService");
		
		Tuser user = new Tuser();
		user.setId(UUID.randomUUID().toString());
		user.setName("lee353543");
		user.setPwd("sdfs");
		user.setCreatedatetime(new Date());
		
		try {
			tuserService.save(user);
		} catch (TuserException e) {
			e.printStackTrace();
		}
	}

}
