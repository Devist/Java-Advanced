package com.util;

public class WrapperTest {

	public static void main(String[] args) {
		int a = 70;
		Integer i = new Integer(a); // =   Integer i = 70;
		int b = a + i;
		System.out.println(b);
		
		String num="123";
		int num2 = Integer.parseInt(num);
	}

}
