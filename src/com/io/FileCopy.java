package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//ByteStream 이면서 Node Stream 이다. 직접 읽고 쓰고 하기 때문에.
public class FileCopy {

	public static void main(String[] args) throws Exception {
		FileInputStream fis;	//file에서 읽어오는 스트림(읽기용)
		FileOutputStream fos;	//file에다 쓰는 스트림(쓰기용)
		
		String origin 	= "src\\com\\io\\FileCopy.java";	//원본 파일
		String copy 	= "src\\com\\io\\Copy.java";		//복사본 파일 - FileCopy.java 를 Copy.java 라는 새로운 파일로 만든다.
		
		
		
		fis = new FileInputStream(origin);	// 파이프  파일 -> Char -> Int
		fos = new FileOutputStream(copy);	// 파이프  Int -> Char -> 파일
		
		// 현재 코드가 작성되고 있는 이 파일, FileCopy.java를 읽어서 Copy.java에 쓴다.
		// (p,a,c,k,a,g,e,.....)한글자씩 읽어서 i로 들어감. i가 -1이 아니라면 계속 작업. 파일의 끝을 만나면 -1이 반환되므로
		for(int i; (i= fis.read()) != -1;) {
			System.out.println(i);	//코드값
			fos.write(i);
		}
		
		fis.close();
		fos.close();
		
		System.out.println("file copied...");
	}
}
