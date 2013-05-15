package com.buy.test.serializable.customSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {	
	public static void main(String[] args){
		try {
			FileInputStream in = new FileInputStream("tmp.out");
			ObjectInputStream inputStream = new ObjectInputStream(in);
			StringList serial = (StringList)inputStream.readObject();
			serial.iteEntry();
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
