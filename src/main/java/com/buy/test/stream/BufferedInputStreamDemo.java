package com.buy.test.stream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {
	public static void main(String[] args){
		byte[] buf = new byte[]{1,2,3};
		InputStream in = new ByteArrayInputStream(buf);
		BufferedInputStream bi = new BufferedInputStream(in);
		try {
			System.out.println(bi.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
