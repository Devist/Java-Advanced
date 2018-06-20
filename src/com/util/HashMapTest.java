package com.util;

import java.util.HashMap;
import java.util.Set;

import com.io.Card;

//Hashtable�� ��â�� �� , HashMap�� �ֽ� ��
//���������� HashTable�� ���� �ɷ� �ְ�, HashMap�� ���� �ɷ� ���� �ʴ�.
public class HashMapTest {

	public static void main(String[] args) {
		
		//�տ� ���� �� Key, �ڿ� ���°� Value
		HashMap<String, Card> map = new HashMap<>();
		map.put("111", new Card(12345,"DONGHWAN, OH"));
		map.put("222", new Card(22345,"Piliament, Kim"));
		map.put("111", new Card(12345,"Newbee"));	//�ߺ� �Ұ��ϹǷ�, ���� Ű�� �����鼭 �ٸ� ���� �ִ� DONHWAN, OH�� ��ü�ȴ�.
		
		for(Card curCard : map.values())
			System.out.println(curCard.getNum() + " : " + curCard.getOwner());
		
		Card c = map.get("111");
		System.out.println(c.getNum());
		
		
		System.out.println(map.get("222").getNum());
		
		
		System.out.println("==================================================================");
		Set <String> keys = map.keySet(); // map �ȿ� ��� �ִ� key�� ��������. set���� ����(set�� �ߺ����� �ʴ� �ſ���.)
		for(String key : keys)
			System.out.println("key is a " + key + ", value is a (" + map.get(key).getNum() + ", " + map.get(key).getOwner());
		
	}

}
