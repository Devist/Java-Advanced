package com.thread;

import java.util.Date;

public class ThreadClock implements Runnable {
	public static void main(String[] args) {
		ThreadClock clock = new ThreadClock();
	}

	public ThreadClock() {
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		//1�� �������� �ð������� ���
		while(true) {
			Date d = new Date();
			System.out.println(d);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
