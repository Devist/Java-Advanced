package com.util;

import java.util.ArrayList;

import com.io.Card;


//ArrayList는 not synchronized (비동기) - 동시 접근 가능. 필요한 경우에만 락을 걸면 된다.
//Vector는 synchronized (동기) - 락이 걸려 있다는 말 - 동시 접근 불가 - 다른 스레드들이 동시 접근 불가
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("spring");
		list1.add("summer");
		list1.add("fall");
		list1.add("summer");
		list1.add("winter");
		
		list1.remove(1); // index로 지우기
		list1.remove("summer");	// 값을 찾아 지우기
		
		list1.add(2,"unknown");	// index 지정 후 add 하면, 기존 내용은 뒤로 밀리고 새로운 내용이 추가된다.
		
		list1.set(0,"late summer"); //index 지정 후 set 하면, 기존 내용은 지워지고 새로운 내용이 덮어씌워진다.
		
		//Vector와 같은 방법으로 사용
		for(String season: list1) {
			System.out.println(season);
		}
		
		
		
		
		
		System.out.println("==========================================");
		
		ArrayList<Card> list2 = new ArrayList<>();
		list2.add(new Card(12345,"kim"));
		list2.add(new Card(89023,"park"));
		list2.add(new Card(78330,"lee"));
		
		for(Card c : list2) {
			System.out.println(c.getNum() + " : " + c.getOwner());
		}
			
	}

}
