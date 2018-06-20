package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CardUser {

	public static void main(String[] args) throws Exception{
		Card mycard = new Card(12345, "tommy lee");
		
		// ��ü�� ���Ͽ� ����
		FileOutputStream fos = new FileOutputStream("save.txt");//node stream
		ObjectOutputStream oos = new ObjectOutputStream(fos);	//process stream(��ü�� ������� �ִ� ��Ʈ��)
		
		oos.writeObject(mycard);	// mycard�� Serialization �Ǿ� �־�� ��
		oos.close();
		fos.close();
		
		
		
		//��ü�� ���Ͽ��� ����
		FileInputStream fis = new FileInputStream("save.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Card c = (Card)ois.readObject();
		System.out.println("num:" + c.getNum());
		System.out.println("owner" + c.getOwner());
	}

}
