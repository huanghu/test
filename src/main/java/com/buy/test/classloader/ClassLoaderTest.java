package com.buy.test.classloader;

public class ClassLoaderTest {
	public static void main(String[] args){
		try {
			System.out.println("ClassLoader " + ClassLoader.getSystemClassLoader().loadClass("com.buy.test.component.ImproveList"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
