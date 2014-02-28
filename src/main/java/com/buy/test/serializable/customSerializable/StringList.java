package com.buy.test.serializable.customSerializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StringList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8343159978281001286L;
	private transient int size = 0;
	private transient Entry head = null;
	
	private static class Entry{
		String data;
		Entry next;
		@SuppressWarnings("unused")
		Entry previous;
	}
	
	public final void add(String s){
		if(head == null){
			head = new Entry();
			head.data = s;
		}else{
			for(Entry entry = head ; entry != null ;entry = entry.next){
				if(entry.next == null){
					Entry e = new Entry();
					e.data = s;
					entry.next = e;
					e.previous = entry;
				}
			}
		}
	}
	
	/**
	 * 遍历StringList
	 */
	public final void iteEntry(){
		System.out.println("ttt");
		for(Entry entry = head ; entry != null ;entry = entry.next){
			System.out.println("entry " + entry);
		}
	}
	
	private void writeObject(ObjectOutputStream s) throws IOException{
		s.defaultWriteObject();
		s.writeInt(size);
		
		for(Entry e = head ; e != null; e = e.next){
			s.writeObject(e.data);
		}
	}
	
	private void readObject(ObjectInputStream s) throws IOException ,ClassNotFoundException{
		s.defaultReadObject();
		int numElements = s.readInt();
		for(int i = 0;i < numElements; i ++){
			add((String)s.readObject());
		}
	}
	
}
