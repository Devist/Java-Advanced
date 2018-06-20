package com.thread;

public class SyncTest implements Runnable{

	public static void main(String[] args) {
		new SyncTest();
	}
	
	public SyncTest() {
		Thread tom = new Thread(this,"tom");
		Thread jerry = new Thread(this,"jerry");
		
		tom.start();
		jerry.start();
		
	}
	
	@Override
	public void run() {
		kitchen();
		bedroom();
	}
	
	private synchronized void bedroom() {
		System.out.println(Thread.currentThread().getName() + ": 침실에 들어옴");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": 침실에서 나감");
	}
	
	private synchronized void kitchen() {
		System.out.println(Thread.currentThread().getName() + ": 부엌에 들어옴");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": 부엌에서 나감");
	}
}