package com.inner;
//member class

public class C2_MyCar {	// top-level class

	int speed = 200;
	
	// protected : ��� ���迡 �ִٰų� ��Ű�� �ȿ� ���� ������ ��� ����
	public class Engine{	//inner class ���� �� �ι�° : member inner class.
		public void test() {
			System.out.println("value:" + speed);
		}
	}
	
	public static void main(String[] args) {
		
		/**
		Engine e = new Engine();  //Outer.java �� �����ϰ� �Ϸ��µ� ���� �߻�.
		System.out.println(speed);	// �ȵ�. ��ü�� �� ������� ������.
		
		���� �� ���� �� �ȵ�? MyCar��� Ŭ���� �ȿ� speed ��� �ʵ�� Enging�̶�� ��� Ŭ������ �ִ�.
		speed�� Engine�̶�� �ִ� MyCar�� �̷�� ��� �����.
		����, speed,engine�� ����Ϸ��� �Ʒ��� ���� ��ü�� ��������� ��. 
		*/
		
		C2_MyCar car = new C2_MyCar();
		System.out.println(car.speed);
		
		Engine e = car.new Engine();
		e.test();
		System.out.println(e.getClass().getName());
		
		
		//Outer �� �ִ� static�� ���� �ʹ�?
		// static�̹Ƿ� ��ü ���� ���� Ŭ���� �̸����� �ٷ� ���� �ִ�.
		System.out.println(C1_Outer.scount);
		C1_Outer.Inner i = new C1_Outer.Inner();
	}

}
