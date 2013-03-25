package com.buy.test.clone;

public class Clone extends CloneFather implements Cloneable{
	private String a;
	private String b;
	

	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public static void main(String[] args){
		Clone cl = new Clone();
		cl.setA("a");
		cl.setB("b");
		
		try {
			Clone cls = (Clone)cl.clone();
			System.out.println("cl" + cl);
			System.out.println("cls" + cls.getA());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
