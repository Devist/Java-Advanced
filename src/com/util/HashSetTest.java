package com.util;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		//HashSet : �ߺ� ��� X
		//set�̳� list�� ������ Collection ���� �Ȱ����Ƿ�, ����ϴ� �޼ҵ嵵 �Ȱ���.
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
