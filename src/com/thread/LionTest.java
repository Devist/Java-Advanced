package com.thread;
//Runnable 구현
class Lion implements Runnable{	

	@Override
	public void run() {
		System.out.println("thread name:" + Thread.currentThread().getName());
	}
}

public class LionTest{
	public static void main(String[] args) {
		// Runnable 객체
		// 자체가 Thread는 아니지만 Thread가 작업할 내용인 run 메서드는 들고 있다.
		Lion l1 = new Lion();	
		Thread t1 = new Thread(l1); 
		t1.start();
		
		Lion l2 = new Lion();	
		Thread t2 = new Thread(l1); 
		t1.start();
		
		Lion l3 = new Lion();	
		Thread t3 = new Thread(l1); 
		t1.start();
	}
}

//우리가 Lion에 런 메소드를 구현해 놨듯이
//Thread도 Runnable을 상속했기 때문에,Lion처럼 내부에 Run 메소드가 이미 존재하고 있다.
//But, public void run(){} 라고만 되어 있고, 비어 있드아.
//따라서 Override 하여 재정의 하지 않으면, 아무 동작도 안 한다. 다음과 같이
//
//		Thread t1 = new thread();
//		t1.start();