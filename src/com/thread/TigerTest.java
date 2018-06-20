package com.thread;
//Thread class ���
class Tiger extends Thread{
	//thread�� �ؾ��� �۾� ������ �ִ� �޼���
	public void run() {
		System.out.println("thread name:" + getName());
	}
}

public class TigerTest {

	public static void main(String[] args) {
		Tiger t1 = new Tiger();	// thread ����
		Tiger t2 = new Tiger();
		Tiger t3 = new Tiger();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		
		t1.start();//�۾����� �˸��� �޼���. run()�� ã�ư�
		t2.start();//�۾����� �˸��� �޼���. run()�� ã�ư�
		t3.start();//�۾����� �˸��� �޼���. run()�� ã�ư�
	}
}