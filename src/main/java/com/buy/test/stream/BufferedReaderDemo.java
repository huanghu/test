package com.buy.test.stream;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args){
		InputStreamReader iReader = new InputStreamReader(new ByteArrayInputStream(new byte[]{2, 3}));
		BufferedReader bReader = new BufferedReader(iReader);
		try {
			System.out.println(bReader.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
