package com.buy.test.core;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class ParameterizedTest {
	private int expected;
	private int valueOne;
	private int valueTwo;
	
	@Parameters
	public static Collection<Integer[]> getTestParameters(){
		Integer[][] integers = {
				{2 ,1 ,1} ,
				{12 ,2 ,10} ,
				{15 ,6 ,9}
			};
		return Arrays.asList(integers);
	}
	
	public ParameterizedTest(int expected ,int valueOne ,int valueTwo){
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	@Test
	public void sum(){
		try {
			int value = this.calc(valueOne, valueTwo);
			Assert.assertEquals(String.format("%s ,%s 计算出错", valueOne ,valueTwo) ,expected ,value );
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	private int calc(int valueOne ,int valueTwo){
		try {
			
			return valueOne + valueTwo;
		} catch (ArithmeticException e) {
			throw e;
		}

	}
}
