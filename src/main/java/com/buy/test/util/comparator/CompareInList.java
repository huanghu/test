package com.buy.test.util.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareInList implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1.compareTo(o2) == 0) {
			return 0;
		}else if (o1.compareTo(o2) > 0) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args){
		CompareInList cList = new CompareInList();
		List<Integer> lists = new ArrayList<Integer>();
		
		lists.add(new Integer(1));
		lists.add(new Integer(3));
		lists.add(new Integer(2));
		Collections.sort(lists, cList);
		
		for (Integer integer : lists) {
			System.out.println("interge " + integer);
		}
	}
}
