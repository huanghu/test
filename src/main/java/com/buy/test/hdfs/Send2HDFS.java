package com.buy.test.hdfs;

import java.io.IOException;

public class Send2HDFS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hdfs://localhost/user/tom/quangle.txt 
		//String path = "hdfs://hadoop-sl002.360buy.com:50075/user/root/huanghu/job.properties ";
		
		String localSrc = args[0];
		String dst = args[1];
		String shellPath = args[2];
		
		System.out.println("localSrc " + localSrc);
		System.out.println("dst " + dst);
		System.out.println("shellPath " + shellPath);

		try {
			String cmd = shellPath + " " + localSrc + " " + dst;
			System.out.println("cmd " + cmd);
			Runtime.getRuntime().exec (cmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
