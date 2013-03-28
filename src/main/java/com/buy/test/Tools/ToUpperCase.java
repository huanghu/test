package com.buy.test.Tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;


public class ToUpperCase {
	private final static ResourceLoader resourceLoader = new DefaultResourceLoader();
	private final static Resource resource;
	static{
		resource = resourceLoader.getResource("classpath:/tools/text.txt");
	}
	
	@SuppressWarnings("unused")
	private static void toUpper(String world) throws Exception{
		world = world.toUpperCase();
		System.out.println("world upperCase " + world + ",");
	}
	
	public static void main(String[] args){
		try {
			String outputPath = ToUpperCase.class.getResource("/") + "tools/text1.txt";			
			outputPath = outputPath.replace("file:/", "");
			FileWriter fWriter = new FileWriter(new File(outputPath));
			
			InputStream is = resource.getInputStream();
			Reader reader = new InputStreamReader(is);
			BufferedReader bReader = new BufferedReader(reader);
			String temp = null;
			while ((temp = bReader.readLine()) != null) {
				temp = temp.toUpperCase();
				System.out.println("temp " + temp);
				fWriter.append(temp);
				fWriter.append("\r\n");
			}
			fWriter.flush();
 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	private String getInputStreamCha(String temp){
		temp = temp.trim().replace(" ", ",");
		String[] temps = temp.split(",");
		String newTemp = "";
		for(String t : temps){
			
			if(t == null || t.equals("")){
				newTemp += " ";
			}
			newTemp += t;
		}
		System.out.println("t:" + newTemp);
		return newTemp;
	}
}
