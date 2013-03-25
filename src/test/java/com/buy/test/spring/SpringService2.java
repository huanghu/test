package com.buy.test.spring;

import org.springframework.stereotype.Service;

//@Service(value="springService2")
public class SpringService2 implements ISpringService {

	public void doSomething() {
		System.out.println("do something in spring service2");
	}

}
