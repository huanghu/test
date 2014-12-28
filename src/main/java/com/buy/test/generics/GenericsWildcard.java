package com.buy.test.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符
 * @author huanghu
 *
 */
public class GenericsWildcard<E extends Number> {
	ArrayList<E> lists = new ArrayList<E>();
	
	private void setLists(E e){
		lists.add(e);
	}
	
	private List<E> getLists(){
		return lists;
	}
	
	public static void main(String[] args){
		GenericsWildcard<Integer> gen = new GenericsWildcard<Integer>();
		gen.setLists(new Integer(1));
		List<?> l = gen.getLists();
		System.out.println("first " + l.get(0));
	}
}
