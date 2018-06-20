package com.util;

import com.io.Card;

public class GenericTest<X> {	//���� �ƹ��ų� �־ ����
	
	int num;
	boolean flag;
	//String what; // ������ �� Ÿ���� String�̱��� �ϰ� ���� ����.
	X what; // ������ ��, ���� Ÿ������ �Ǵ�.
	
	public X getWhat() {
		return what;
	}

	public void setWhat(X what) {
		this.what = what;
	}

	public static void main(String[] args) {
		GenericTest<String> g1 = new GenericTest<>();
		g1.setWhat("apple");	// X�� Ÿ���� String���� ������ �Ǿ���.
		System.out.println(g1.getWhat());
		
		GenericTest<Card> g2 = new GenericTest<>();
		g2.setWhat(new Card(12345,"����ȯ"));
		System.out.println(g2.getWhat().getNum() + ": " + g2.getWhat().getOwner());
	}
}