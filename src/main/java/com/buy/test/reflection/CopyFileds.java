package com.buy.test.reflection;

import java.lang.reflect.Field;

/**
 * 复制field的值
 * 获得field的值
 * 设置field的值
 * @author huanghu
 *
 */
public class CopyFileds {
	
    public static class OutEntity{
		private String a;
		private String b;
		public String getA() {
			return a;
		}
		public void setA(String a) {
			this.a = a;
		}
		public String getB() {
			return b;
		}
		public void setB(String b) {
			this.b = b;
		}
		
	}
	
	
	
	/**
	 * 拷贝OutEntity
	 * @return 
	 */
	public <T> T copyOutEntity(T oldOutEntity) throws Exception{
		@SuppressWarnings("unchecked")
		T newOutEntity = (T)new OutEntity();
		Class<?> oldClass = oldOutEntity.getClass();
		Class<?> newClass = newOutEntity.getClass();
		
		Field[] fields = oldClass.getSuperclass().getDeclaredFields();
		Field[] newFields = newClass.getSuperclass().getDeclaredFields();
		//将老的实体的父类的域赋值给新的实体的父类的域
		for(Field field : fields){
			
			field.setAccessible(true);
			Object fieldValue = field.get(oldOutEntity);
			
			for(Field newField : newFields){
				if(newField.getName().equals(field.getName())){
					newField.setAccessible(true);
					newField.set(newOutEntity, fieldValue);
				}
			}
			
		}
		
		fields = oldClass.getDeclaredFields();
		newFields = newClass.getDeclaredFields();
		//将老的实体的域赋值给新的实体的域
		for(Field field : fields){
			
			field.setAccessible(true);
			Object fieldValue = field.get(oldOutEntity);
			
			for(Field newField : newFields){
				if(newField.getName().equals(field.getName())){
					newField.setAccessible(true);
					newField.set(newOutEntity, fieldValue);
				}
			}
			
		}
		return newOutEntity;
	}
	
	public static void main(String[] args){
		try {
			CopyFileds copy = new CopyFileds();
			OutEntity oldOutEntity = new OutEntity();
			
			oldOutEntity.setA("sssss");
			oldOutEntity.setB("ttv");
			
			copy.copyOutEntity(oldOutEntity);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
