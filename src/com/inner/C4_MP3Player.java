package com.inner;
//anonymous class 



interface Video{
	void play();
}




//: 추상클래스는 생성이 안된다.
abstract class Song{	// top-level class
	abstract void sing();
}

//: 따라서 아래와 같이 추상클래스를 상속받아서 Song의 미완성 메소드를 구현(완성)해준다.
class MySong extends Song{
	@Override
	void sing() {
		System.out.println("happy song....");
	}
}


//: 위와 같은 MySong을 만들기 귀찮다.. 또한 MySong은 한 번 쓰고 끝인데 top-level class가 되어버렸다.
//매번 자꾸 바뀌는 거라고 할 때, MySong은 좋지 않다. 이런걸 만들지 않고 바로 쓰기???
//anonymous class











public class C4_MP3Player {	//top-level class
	
	//play 메소드의 타입은 Song, Video로 다르지만, 메소드는 똑같다 = 메소드 오버로딩
	public void play(Song s) {
		s.sing();
	}
	
	public void play(Video v) {
		v.play();
	}

	public static void main(String[] args) {
		C4_MP3Player player = new C4_MP3Player();
//		player.play(new MySong());
		
		//위에처럼 song을 상속받는 Top - level - class 없이 무명클래스로 바로 만들어 사용해보자.
		//무명 클래스(Song을 상속받는, 하지만 이름은 없는). new로 객체를 바로 만들고, 정의도 바로 해줘버리는 방법으로 사용
		//이름이 없다 :     MP3Player$1.class
		player.play(new Song() {
			
			@Override
			void sing() {
				System.out.println("happy song....");
			}
		});	 
		
		//또 다른 sing 쉽게 출력 가능
		//이름이 없다 :     MP3Player$2.class
		player.play(new Song() {
			
			@Override
			void sing() {
				System.out.println("yesterday...");
			}
		});
		
		
		
		player.play(new Video() {//video는 인터페이스니깐 위의 extends와 달리 implements 필요

			@Override
			public void play() {
				System.out.println("harry potter...");
			}
			
		}); 
	}

}
