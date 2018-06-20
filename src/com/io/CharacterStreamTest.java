package com.io;
//CharacterStream, Node Stream, ProcessStream

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreamTest {
	public static void main(String[] args) throws Exception {
		String[] message = {"�ȳ��ϼ���?","Hello Java!!", "���� ���� �ʹ�"};
		
		File tmp = File.createTempFile("sample", ".txt");	//�ӽ� ���� ����. �������� �ӽ����� �����ϴ� ������ ����
		System.out.println(tmp);	//��� Ȯ��
		
		
		//���� : Node Stream -> Process(filter) Stream -> File
		FileWriter fw = new FileWriter(tmp);		//����� ������. �ϳ��� �����ϴ�. Node Stream
		BufferedWriter bw = new BufferedWriter(fw); //->�ٴ����� ���� ���Ͽ� ����ϴ� ������. Process Stream
		
		for(int i=0; i<message.length ; i++) {
			bw.write(message[i]);
			bw.newLine();//�ٹٲ�. �Ϲ� node stream�� ������ ���� ���� �޼���
		}
		
		bw.close();
		fw.close();
		
		//31~40 ���� : ���Ͽ��� �о����
		FileReader fr = new FileReader(tmp);		//����->�б�� ������
		BufferedReader br = new BufferedReader(fr);
		
		for(String msg; (msg = br.readLine()) !=null;) {
			System.out.println(msg);
		}
		
		br.close();
		fr.close();
				
	}
}