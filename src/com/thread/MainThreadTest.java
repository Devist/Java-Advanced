package com.thread;







//아래와 같은 경우, go method....running by thread... 라고 찍힌다.
//순서로 보면 running by thread... go method... 라고 찍혀야 되는 거 아닌가?
//main 이라는 쓰레드가 이미 하나 있으므로. public MainThreadTest()가 먼저 실행 됨.
//따라서 우선순위 문제로 코드 이상이 생길 수 있다.
//
//
	//public class MainThreadTest implements Runnable {
	//	
	//	public void go(){
	//		System.out.println("go method....runnning by main");
	//	}
	//	
	//	public MainThreadTest() {
	//		//thread 생성
	//		Thread t = new Thread(this);
	//		t.start();
	//	}
	//
	//	public static void main(String[] args) {
	//		MainThreadTest m = new MainThreadTest();
	//		m.go();
	//	}
	//	
	//	@Override
	//	public void run() {
	//		//run by thread
	//		System.out.println("running by thread...");
	//	}
	//
	//}


public class MainThreadTest implements Runnable {
	
	public void go(){
		System.out.println("go method....runnning by main");
	}
	
	public MainThreadTest() {
		//thread 생성
		Thread t = new Thread(this);
		t.start();
		
		try {
			t.join(); // t가 작업을 마칠때가지 다른 스레드들이 기다려 줌
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		MainThreadTest m = new MainThreadTest();
		m.go();
	}
	
	@Override
	public void run() {
		//run by thread
		System.out.println("running by thread...");
	}

}
