package com.inner;
// static class

public class C1_Outer {	// top-level class : ���� �ٱ� �ʿ� �����ϴ� Ŭ����

	// ���� �����Ǵ� ������ ��� ����� �ٸ���.
	// scount (static)�� ������ ������ ���� �� ����
	// count�� ��ü ���� �� �� (���� ��)
	// static�� class area�� �� �Ѱ��� ������ ��. �ƹ��� ��ü�� ���� �� ���� scount�� �� �Ѱ��� ���������.
	static int scount = 100;
	int count = 200;	
	
	static class Inner{	// inner class ���� �� ù��° : static inner class.
		public void test() {
			System.out.println("value:" + scount);
			//System.out.println("value:" + count); �� ��������� ������ ����
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner i = new Inner(); 
		C1_Outer.Inner m = new C1_Outer.Inner(); // = Inner i = new Inner(); �� ��Ȯ�� ǥ��.
		
		i.test();
		
		// C:\ODH\workspace\JavaProject\bin\com\inner ������ ���� Outer$Inner.class �� �� �� �ִ�.  $�� �� inner Ŭ�����̴�
		System.out.println(i.getClass().getName());  //��� : com.inner.Outer$Inner // ��Ű�� �̸� + �ٱ��� Ŭ���� + $ + �̸�
		

	}

}
