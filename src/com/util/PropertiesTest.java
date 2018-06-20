package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception{
		//key, value 모두 String 타입으로 지정되어 있음
		Properties prop = new Properties(); // key, Value 구조로 데이터를 저장함
		
		
		// .properties 확장자를 가진 놈은 'num=12345' 와 같은 형태를 가진다.
		FileInputStream fis = new FileInputStream("src\\com\\util\\info.properties");
		prop.load(fis); //fis와 연결되어 있는 파일에서 내용을 읽어와서 prop에 load(저장)
		
		String num = prop.getProperty("num");
		String name = prop.getProperty("name");
		String address = prop.getProperty("address");
		System.out.println(num + name + address);
	}

}
