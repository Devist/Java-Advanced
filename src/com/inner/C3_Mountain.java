package com.inner;
//local class

public class C3_Mountain {	//top-level class
	
	int height = 1950;
	
	//dig �̶�� �޼ҵ� �ȿ� Gold ��� Ŭ������ ��� ����.
	//���� Ŭ���� �ȿ� Ŭ���� �־��µ�, ����� �� Ư���� ����.
	public void dig() {
		class Gold{	//inner class ���� �� ����° : local inner class. dig() �޼ҵ� �ȿ����� ����. ���� �� ��. ��� ������ ������ ������.
			void shine() {
				System.out.println("value:" + height);
			}
		}
		
		Gold g = new Gold();
		g.shine();
		System.out.println(g.getClass().getName()); // com.inner.Mountain$1Gold . �ٸ� �̳� Ŭ������ �ٸ��� �տ� ���ڰ� ����.
	}
	
	
	
	
	

	public static void main(String[] args) {
		C3_Mountain m = new C3_Mountain();
		m.dig();
	}

}
