package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//ByteStream �̸鼭 Node Stream �̴�. ���� �а� ���� �ϱ� ������.
public class FileCopy {

	public static void main(String[] args) throws Exception {
		FileInputStream fis;	//file���� �о���� ��Ʈ��(�б��)
		FileOutputStream fos;	//file���� ���� ��Ʈ��(�����)
		
		String origin 	= "src\\com\\io\\FileCopy.java";	//���� ����
		String copy 	= "src\\com\\io\\Copy.java";		//���纻 ���� - FileCopy.java �� Copy.java ��� ���ο� ���Ϸ� �����.
		
		
		
		fis = new FileInputStream(origin);	// ������  ���� -> Char -> Int
		fos = new FileOutputStream(copy);	// ������  Int -> Char -> ����
		
		// ���� �ڵ尡 �ۼ��ǰ� �ִ� �� ����, FileCopy.java�� �о Copy.java�� ����.
		// (p,a,c,k,a,g,e,.....)�ѱ��ھ� �о i�� ��. i�� -1�� �ƴ϶�� ��� �۾�. ������ ���� ������ -1�� ��ȯ�ǹǷ�
		for(int i; (i= fis.read()) != -1;) {
			System.out.println(i);	//�ڵ尪
			fos.write(i);
		}
		
		fis.close();
		fos.close();
		
		System.out.println("file copied...");
	}
}
