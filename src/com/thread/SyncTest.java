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
		System.out.println(Thread.currentThread().getName() + ": ħ�ǿ� ����");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": ħ�ǿ��� ����");
	}
	
	private synchronized void kitchen() {
		System.out.println(Thread.currentThread().getName() + ": �ξ��� ����");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + ": �ξ����� ����");
	}
}