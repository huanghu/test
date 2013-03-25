package com.buy.test.reflection;

import java.lang.reflect.Field;

/**
 * ����field��ֵ
 * ���field��ֵ
 * ����field��ֵ
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
	 * ����OutEntity
	 * @return 
	 */
	public <T> T copyOutEntity(T oldOutEntity) throws Exception{
		@SuppressWarnings("unchecked")
		T newOutEntity = (T)new OutEntity();
		Class<?> oldClass = oldOutEntity.getClass();
		Class<?> newClass = newOutEntity.getClass();
		
		Field[] fields = oldClass.getSuperclass().getDeclaredFields();
		Field[] newFields = newClass.getSuperclass().getDeclaredFields();
		//���ϵ�ʵ��ĸ������ֵ���µ�ʵ��ĸ������
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
		//���ϵ�ʵ�����ֵ���µ�ʵ�����
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
