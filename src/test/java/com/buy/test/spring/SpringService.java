package com.buy.test.spring;

import org.springframework.stereotype.Service;

@Service(value="springService")
public class SpringService implements ISpringService {
	public void doSomething(){
		System.out.println("do something in springService");
	}
}
