package com.buy.test.number;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("0000000");
		String str = format.format(323L);
		System.out.println("str " + str);
	}

}
