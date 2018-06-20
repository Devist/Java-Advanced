package com.io;

import java.io.Serializable;

//직렬화(ㄴSerialization가 되어 있어야 함. : 스트림을 통해 객체를 이동시키기 위한 조건 
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