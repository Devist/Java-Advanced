package com.thread;
//Thread class 상속
class Tiger extends Thread{
	//thread가 해야할 작업 내용이 있는 메서드
	public void run() {
		System.out.println("thread name:" + getName());
	}
}

public class TigerTest {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();	// thread 생성
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		
		t1.start();//작업시작 알리는 메서드. run()를 찾아감
		t2.start();//작업시작 알리는 메서드. run()를 찾아감
		t3.start();//작업시작 알리는 메서드. run()를 찾아감
	}
}