package com.buy.test.regular.copy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		String str = "select color ,colornote ,colorSequence ,size ,sizeNote ,sizeSequence ,wpid ,wpid2 ," +
				"pid ,id ,replace(replace(name ,'	',' ') ,CHAR(10) ,'') as name ,length ,height ,width ,weight ";
		Pattern pattern = Pattern.compile("replace(.*) as|replace(.*)as");
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.replaceAll(""));
	}
}
