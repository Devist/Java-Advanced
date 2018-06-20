package com.inner;
//MEMBER CLASS

public class C5_A { //top-level class

	int count = 100;
	
	class B{  // = default class
		int count = 200;
		
		public void hello() {
			//System.out.println("B count:" + count);
			C c = new C();
			c.hello();
		}
		
		
		
		class C{
			int count = 300;
			
			public void hello() {
				System.out.println("C count:" + count); 
				// B-count
				System.out.println("B count:" + B.this.count); //�ٱ��� ���� ��Ÿ�� ���� �̷��� ���
				// A-count
				System.out.println("A count:" + C5_A.this.count); //�ٱ��� ���� ��Ÿ�� ���� �̷��� ���
			}
		}
		
	}
	
	
	public void hello() {
		//System.out.println("A count:" + count);
		B b = new B();
		b.hello();
	}
	
	
	public static void main(String[] args) {
		C5_A a = new C5_A();
		a.hello();	//count:100
	}

}
