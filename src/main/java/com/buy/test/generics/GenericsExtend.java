package com.buy.test.generics;

/**
 * �̳����õ�����
 * @author huanghu
 *
 */
public class GenericsExtend<T> {
	
	public T test1(T a){
		return (T)a;
	}	
	
	public static void main(String[] args){
		GenericsExtend<String> generics1 = new GenericsExtend<String>();
		String gen = generics1.test1("�̳��õ�����");
		System.out.println("gen " + gen);
		
		GenericsExtend<Integer> generics2 = new GenericsExtend<Integer>();
		Integer gen2 = generics2.test1(2);
		System.out.println("gen2 " + gen2);		
		
	}

}
