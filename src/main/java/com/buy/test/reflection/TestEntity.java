package com.buy.test.reflection;

import com.buy.test.reflection.AnnotationFileds.type;


public class TestEntity extends AbstarctEntity {
	@AnnotationFileds(getType = type.TYPE1)
	String code;
	@AnnotationFileds(getType = type.TYPE2)
	String name;   
	    
	public void setCode(String code){   
	  this.code = code;   
	}   
	    
	public String getCode(){   
	  return this.code;   
	}   
	    
	public void setName(String name){   
	  this.name = name;   
	}   
	    
	public String getName(){   
	  return this.name;   
	}   
	    

}
