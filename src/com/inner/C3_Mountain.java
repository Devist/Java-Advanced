package com.inner;
//local class

public class C3_Mountain {	//top-level class
	
	int height = 1950;
	
	//dig 이라는 메소드 안에 Gold 라는 클래스가 들어 있음.
	//보통 클래스 안에 클래스 있었는데, 여기는 좀 특이한 구조.
	public void dig() {
		class Gold{	//inner class 종류 중 세번째 : local inner class. dig() 메소드 안에서만 쓴다. 거의 안 씀. 사용 범위가 굉장히 제한적.
			void shine() {
				System.out.println("value:" + height);
			}
		}
		
		Gold g = new Gold();
		g.shine();
		System.out.println(g.getClass().getName()); // com.inner.Mountain$1Gold . 다른 이너 클래스와 다르게 앞에 숫자가 있음.
	}
	
	
	
	
	

	public static void main(String[] args) {
		C3_Mountain m = new C3_Mountain();
		m.dig();
	}

}
