package com.buy.test.serializable.customSerializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String[] args){
		try {
			FileOutputStream out = new FileOutputStream("tmp.out");
			ObjectOutputStream os = new ObjectOutputStream(out);
			StringList ts = new StringList();
			String entryString = "entryString";
			ts.add(entryString);
			os.writeObject(ts);
			os.flush();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
