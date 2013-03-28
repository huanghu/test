package com.buy.test.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring/springTest_config.xml"}) 
public class SpringTest{
	@Autowired
	private ISpringService springService2;
	
	@Test
	public void test(){
		springService2.doSomething();
	}
}
