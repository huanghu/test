package com.buy.test.generics;

public class GenericsDemo<E> {
	E e;
	public GenericsDemo(E e){
		this.e = e;
	}
	
	public void output() throws Exception{
		System.out.println("e " + e);
	}
	
	public static void main(String[] args) throws Exception{
		Integer e1 = new Integer(2);
		GenericsDemo<Integer> genericsDemo = new GenericsDemo<Integer>(e1);
		genericsDemo.output();
		
		String e2 = new String("sss");
		GenericsDemo<String> genericsDemo2 = new GenericsDemo<String>(e2);
		genericsDemo2.output();
	}
}
