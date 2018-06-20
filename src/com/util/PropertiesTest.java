package com.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws Exception{
		//key, value ��� String Ÿ������ �����Ǿ� ����
		Properties prop = new Properties(); // key, Value ������ �����͸� ������
		
		
		// .properties Ȯ���ڸ� ���� ���� 'num=12345' �� ���� ���¸� ������.
		FileInputStream fis = new FileInputStream("src\\com\\util\\info.properties");
		prop.load(fis); //fis�� ����Ǿ� �ִ� ���Ͽ��� ������ �о�ͼ� prop�� load(����)
		
		String num = prop.getProperty("num");
		String name = prop.getProperty("name");
		String address = prop.getProperty("address");
		System.out.println(num + name + address);
	}

}
