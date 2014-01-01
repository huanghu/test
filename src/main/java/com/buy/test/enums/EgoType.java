package com.buy.test.enums;

public enum EgoType {
	ERP("erp") ,POP("pop") ,EBOOK("ebook");
	
	private String name;
	private EgoType(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
