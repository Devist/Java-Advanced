package com.util;

import java.util.ArrayList;

import com.io.Card;


//ArrayList�� not synchronized (�񵿱�) - ���� ���� ����. �ʿ��� ��쿡�� ���� �ɸ� �ȴ�.
//Vector�� synchronized (����) - ���� �ɷ� �ִٴ� �� - ���� ���� �Ұ� - �ٸ� ��������� ���� ���� �Ұ�
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("spring");
		list1.add("summer");
		list1.add("fall");
		list1.add("summer");
		list1.add("winter");
		
		list1.remove(1); // index�� �����
		list1.remove("summer");	// ���� ã�� �����
		
		list1.add(2,"unknown");	// index ���� �� add �ϸ�, ���� ������ �ڷ� �и��� ���ο� ������ �߰��ȴ�.
		
		list1.set(0,"late summer"); //index ���� �� set �ϸ�, ���� ������ �������� ���ο� ������ ���������.
		
		//Vector�� ���� ������� ���
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
