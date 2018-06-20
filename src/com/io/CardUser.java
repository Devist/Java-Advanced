package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CardUser {

	public static void main(String[] args) throws Exception{
		Card mycard = new Card(12345, "tommy lee");
		
		// 객체를 파일에 저장
		FileOutputStream fos = new FileOutputStream("save.txt");//node stream
		ObjectOutputStream oos = new ObjectOutputStream(fos);	//process stream(객체를 저장시켜 주는 스트림)
		
		oos.writeObject(mycard);	// mycard는 Serialization 되어 있어야 함
		oos.close();
		fos.close();
		
		
		
		//객체를 파일에서 꺼냄
		FileInputStream fis = new FileInputStream("save.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Card c = (Card)ois.readObject();
		System.out.println("num:" + c.getNum());
		System.out.println("owner" + c.getOwner());
	}

}
