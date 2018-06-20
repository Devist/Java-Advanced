package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Non-RuntimeException Á¾·ù

public class C2_ThreadTest {
	
	public static void main(String[] args) {
		try {
			Thread.sleep(3000);
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (InterruptedException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("hello, world!");
	}

}
