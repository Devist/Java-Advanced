package com.inner;
//member class

public class C2_MyCar {	// top-level class

	int speed = 200;
	
	// protected : 상속 관계에 있다거나 패키지 안에 있을 때에만 사용 가능
	public class Engine{	//inner class 종류 중 두번째 : member inner class.
		public void test() {
			System.out.println("value:" + speed);
		}
	}
	
	public static void main(String[] args) {
		
		/**
		Engine e = new Engine();  //Outer.java 와 동일하게 하려는데 에러 발생.
		System.out.println(speed);	// 안됨. 객체를 안 만들었기 때문에.
		
		위의 두 개는 왜 안됨? MyCar라는 클래스 안에 speed 라는 필드와 Enging이라는 멤버 클래스가 있다.
		speed와 Engine이라는 애는 MyCar를 이루는 멤버 요소임.
		따라서, speed,engine를 사용하려면 아래와 같이 객체가 만들어져야 함. 
		*/
		
		C2_MyCar car = new C2_MyCar();
		System.out.println(car.speed);
		
		Engine e = car.new Engine();
		e.test();
		System.out.println(e.getClass().getName());
		
		
		//Outer 에 있는 static를 쓰고 싶다?
		// static이므로 객체 생성 없이 클래스 이름으로 바로 쓸수 있다.
		System.out.println(C1_Outer.scount);
		C1_Outer.Inner i = new C1_Outer.Inner();
	}

}
