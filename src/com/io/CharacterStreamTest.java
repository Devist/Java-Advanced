package com.io;
//CharacterStream, Node Stream, ProcessStream

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamTest {
	public static void main(String[] args) throws Exception {
		String[] message = {"안녕하세요?","Hello Java!!", "집에 가고 싶다"};
		
		File tmp = File.createTempFile("sample", ".txt");	//임시 파일 만듦. 윈도우자 임시파일 관리하는 폴더에 생김
		System.out.println(tmp);	//경로 확인
		
		
		//쓰기 : Node Stream -> Process(filter) Stream -> File
		FileWriter fw = new FileWriter(tmp);		//쓰기용 파이프. 하나씩 가능하다. Node Stream
		BufferedWriter bw = new BufferedWriter(fw); //->줄단위용 쓰기 위하여 사용하는 파이프. Process Stream
		
		for(int i=0; i<message.length ; i++) {
			bw.write(message[i]);
			bw.newLine();//줄바꿈. 일반 node stream은 가지고 있지 않은 메서드
		}
		
		bw.close();
		fw.close();
		
		//31~40 라인 : 파일에서 읽어오기
		FileReader fr = new FileReader(tmp);		//파일->읽기용 파이프
		BufferedReader br = new BufferedReader(fr);
		
		for(String msg; (msg = br.readLine()) !=null;) {
			System.out.println(msg);
		}
		
		br.close();
		fr.close();
				
	}
}