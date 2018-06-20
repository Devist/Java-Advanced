package com.util;

import com.io.Card;

public class GenericTest<X> {	//글자 아무거나 넣어도 노상관
	
	int num;
	boolean flag;
	//String what; // 컴파일 때 타입이 String이구나 하고 끝나 버림.
	X what; // 컴파일 때, 미정 타입으로 판단.
	
	public X getWhat() {
		return what;
	}

	public void setWhat(X what) {
		this.what = what;
	}

	public static void main(String[] args) {
		GenericTest<String> g1 = new GenericTest<>();
		g1.setWhat("apple");	// X의 타입이 String으로 결정이 되었다.
		System.out.println(g1.getWhat());
		
		GenericTest<Card> g2 = new GenericTest<>();
		g2.setWhat(new Card(12345,"오동환"));
		System.out.println(g2.getWhat().getNum() + ": " + g2.getWhat().getOwner());
	}
}