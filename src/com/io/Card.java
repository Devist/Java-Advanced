package com.io;

import java.io.Serializable;

//����ȭ(��Serialization�� �Ǿ� �־�� ��. : ��Ʈ���� ���� ��ü�� �̵���Ű�� ���� ���� 
public class Card implements Serializable {
	private int num;
	private String owner;
	
	public Card(int num, String owner) {
		this.num = num;
		this.owner = owner;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}