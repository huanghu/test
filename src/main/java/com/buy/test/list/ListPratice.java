package com.buy.test.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 对List等相关链表的代码
 * @author huanghu
 *
 */
public class ListPratice {
	
	public static void main(String[] args){
		ListPratice pratice = new ListPratice();
		pratice.getList();
	}
	
	//从List中获取数据
	private void getList(){
		List<String> list = new ArrayList<String>();
		list.add("list1");
		list.get(1);
	}
}
