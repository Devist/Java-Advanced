package com.util;

import java.util.HashMap;
import java.util.Set;

import com.io.Card;

//Hashtable은 초창기 모델 , HashMap은 최신 모델
//마찬가지로 HashTable은 락이 걸려 있고, HashMap은 락이 걸려 있지 않다.
public class HashMapTest {

	public static void main(String[] args) {
		
		//앞에 나온 게 Key, 뒤에 나온게 Value
		HashMap<String, Card> map = new HashMap<>();
		map.put("111", new Card(12345,"DONGHWAN, OH"));
		map.put("222", new Card(22345,"Piliament, Kim"));
		map.put("111", new Card(12345,"Newbee"));	//중복 불가하므로, 같은 키를 가지면서 다른 값이 있던 DONHWAN, OH는 대체된다.
		
		for(Card curCard : map.values())
			System.out.println(curCard.getNum() + " : " + curCard.getOwner());
		
		Card c = map.get("111");
		System.out.println(c.getNum());
		
		
		System.out.println(map.get("222").getNum());
		
		
		System.out.println("==================================================================");
		Set <String> keys = map.keySet(); // map 안에 들어 있는 key만 추출해줌. set으로 리턴(set은 중복되지 않는 거였다.)
		for(String key : keys)
			System.out.println("key is a " + key + ", value is a (" + map.get(key).getNum() + ", " + map.get(key).getOwner());
		
	}

}
