package com.inner;
// static class

public class C1_Outer {	// top-level class : 제일 바깥 쪽에 존재하는 클래스

	// 둘은 생성되는 시점과 사용 방법이 다르다.
	// scount (static)는 컴파일 끝나고 실행 전 생성
	// count는 객체 생성 후 됨 (실행 후)
	// static은 class area에 단 한개만 생성이 됨. 아무리 객체를 여러 개 만들어도 scount는 딱 한개만 만들어진다.
	static int scount = 100;
	int count = 200;	
	
	static class Inner{	// inner class 종류 중 첫번째 : static inner class.
		public void test() {
			System.out.println("value:" + scount);
			//System.out.println("value:" + count); 안 만들어졌기 때문에 에러
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner i = new Inner(); 
		C1_Outer.Inner m = new C1_Outer.Inner(); // = Inner i = new Inner(); 의 정확한 표현.
		
		i.test();
		
		// C:\ODH\workspace\JavaProject\bin\com\inner 폴더에 보면 Outer$Inner.class 로 볼 수 있다.  $는 다 inner 클래스이다
		System.out.println(i.getClass().getName());  //출력 : com.inner.Outer$Inner // 패키지 이름 + 바깥쪽 클래스 + $ + 이름
		

	}

}
