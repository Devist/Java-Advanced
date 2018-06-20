package com.util;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector v1 = new Vector(2,2);
		System.out.println(v1.capacity());//Vector 초기 크기를 지정하지 않으면 내부에 열칸 짜리 배열을 가지는 벡터가 만들어지는 걸 알 수 있음
		
		v1.add(123);
		v1.add(12.3);
		v1.add(true);		//초기 크기를 2로 지정했을 때, true 넣기에 모자라므로 알아서 늘렸을 것
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
		
		v1.remove(2);	//hello 값이 제거 됨
		for(int i= 0; i<v1.size();i++) {
			System.out.println(v1.get(i));
		}
		
		
		System.out.println("------------------------");
		//v1에서는 Object 타입(정해지지 않은), 즉 객체 타입이면 다 된다.
		//근데 왜 int 등 기본 타입도 가능할까? 오토박싱, 오토언박싱 때문에
		//v2는 제네릭을 사용하여 String 타입만 받도록 했다.
		Vector<String> v2 = new Vector<String>();
		v2.add("red");
		v2.add("blue");
		v2.add("yellow");
		v2.add("red");
		//v2.add(111);	// 제네릭을 사용하면, 잘못된 데이터타입이 오면 컴파일 단계에서 에러.
		
		for(String color: v2)
			System.out.println(color);
		
	}

}
