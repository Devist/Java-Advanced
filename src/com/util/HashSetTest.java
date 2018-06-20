package com.util;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		//HashSet : 중복 허용 X
		//set이나 list나 조상이 Collection 으로 똑같으므로, 사용하는 메소드도 똑같다.
		HashSet<String> set = new HashSet<>();
		
		set.add("kim");
		set.add("lee");
		set.add("park");
		set.add("harry");
		set.add("lee");
		
		for(String name : set) {
			System.out.println(name);
		}
	}

}
