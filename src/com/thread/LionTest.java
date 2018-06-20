package com.thread;
//Runnable ����
class Lion implements Runnable{	

	@Override
	public void run() {
		System.out.println("thread name:" + Thread.currentThread().getName());
	}
}

public class LionTest{
	public static void main(String[] args) {
		// Runnable ��ü
		// ��ü�� Thread�� �ƴ����� Thread�� �۾��� ������ run �޼���� ��� �ִ�.
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

//�츮�� Lion�� �� �޼ҵ带 ������ ������
//Thread�� Runnable�� ����߱� ������,Lionó�� ���ο� Run �޼ҵ尡 �̹� �����ϰ� �ִ�.
//But, public void run(){} ��� �Ǿ� �ְ�, ��� �ֵ��.
//���� Override �Ͽ� ������ ���� ������, �ƹ� ���۵� �� �Ѵ�. ������ ����
//
//		Thread t1 = new thread();
//		t1.start();