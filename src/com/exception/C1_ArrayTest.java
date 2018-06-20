package com.exception;
//RuntimeException Á¾·ù : Ar

public class C1_ArrayTest {

	public static void main(String[] args) {
		String[] color = {"red", "blue", "green", "yellow", "white"};
		
		for(int i=0; i<=color.length; i++) {
			try {
				System.out.println(color[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("oops, i did it again!!!");
				System.out.println("message:" + e.getMessage());
			}
		}
		
		System.out.println("finish......");
	}

}
