package com.buy.test.jmock;

import org.hamcrest.Description;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.api.Action;
import org.jmock.api.Invocation;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class JMockTest {
	private Mockery context = new JUnit4Mockery();
	
	private IJMockService servcie;
	
	@Before
	public void before(){
		servcie = context.mock(IJMockService.class);
	}
	
	@Test
	public void test(){
		context.checking(new Expectations(){
			{
				oneOf(servcie).doSomething();
				will(new Action() {
					
					public Object invoke(Invocation invocation) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("do something in jmock");
						return null;
					}
					
					public void describeTo(Description description) {
						
					}
				});
			}
		});
		
		servcie.doSomething();
	}
}
