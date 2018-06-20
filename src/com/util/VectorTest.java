package com.util;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector v1 = new Vector(2,2);
		System.out.println(v1.capacity());//Vector �ʱ� ũ�⸦ �������� ������ ���ο� ��ĭ ¥�� �迭�� ������ ���Ͱ� ��������� �� �� �� ����
		
		v1.add(123);
		v1.add(12.3);
		v1.add(true);		//�ʱ� ũ�⸦ 2�� �������� ��, true �ֱ⿡ ���ڶ�Ƿ� �˾Ƽ� �÷��� ��
		System.out.println(v1.capacity());
		
		v1.add("hello");
		v1.add(3.4f);
		System.out.println(v1.capacity());
		
		
		v1.add('c');
		v1.add(123);
		
		for(int i=0; i<v1.size(); i++) {
			System.out.println(v1.get(i));
		}
		System.out.println("------------------------");
		
		v1.remove(2);	//hello ���� ���� ��
		for(int i= 0; i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		
		
		System.out.println("------------------------");
		//v1������ Object Ÿ��(�������� ����), �� ��ü Ÿ���̸� �� �ȴ�.
		//�ٵ� �� int �� �⺻ Ÿ�Ե� �����ұ�? ����ڽ�, �����ڽ� ������
		//v2�� ���׸��� ����Ͽ� String Ÿ�Ը� �޵��� �ߴ�.
		Vector<String> v2 = new Vector<String>();
		v2.add("red");
		v2.add("blue");
		v2.add("yellow");
		v2.add("red");
		//v2.add(111);	// ���׸��� ����ϸ�, �߸��� ������Ÿ���� ���� ������ �ܰ迡�� ����.
		
		for(String color: v2)
			System.out.println(color);
		
	}

}
