package com.buy.test.generics;

import java.util.List;

/**
 * �̳� ͨ���
 * @author huanghu
 *
 */
public class GenericsWildcard {
	public void test1(List<?> a){
		System.out.println(a.get(0));
	}
	
	@SuppressWarnings("unused")
	private class GenericsExtendSub extends GenericsExtend<String>{
		
	}
	
}
