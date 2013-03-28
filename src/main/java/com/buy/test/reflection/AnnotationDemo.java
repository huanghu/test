package com.buy.test.reflection;

import java.lang.reflect.Field;

public class AnnotationDemo {



	 public static void main(String[] args) throws SecurityException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException   
	 {   
	  TestEntity obj = new TestEntity();   
	  obj.setName("name value");   
	  obj.setCode("code value");
	  Field[] fds = obj.getClass().getDeclaredFields();   
	     
	  
	  System.out.println("length " + fds.length);   
	  for(int i=0;i<fds.length;i++)   
	  {
		  fds[i].setAccessible(true);
	   System.out.println(fds[i].get(obj));   
	      
	  }   
	 } 
}
