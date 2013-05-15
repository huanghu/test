package com.buy.test.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Writable;

public class Serialization {
	public static byte[] serialize(Writable writable) throws IOException{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DataOutputStream dataOut = new DataOutputStream(out);
		writable.write(dataOut);
		dataOut.close();
		return out.toByteArray();
	}
	
	public static byte[] deserizlize(Writable writable ,byte[] bytes) throws IOException{
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		DataInputStream dataIn = new DataInputStream(in);
		writable.readFields(dataIn);
		dataIn.close();
		return bytes;
	}
	
	public static void main(String[] args){
		try {
			IntWritable writable = new IntWritable(163);
			byte[] bytes = serialize(writable);
			System.out.println("bytes " + bytes.length);
			
			IntWritable newWritable = new IntWritable();
			deserizlize(newWritable, bytes);
			System.out.println("writable " + newWritable.get());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
