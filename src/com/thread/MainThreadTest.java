package com.thread;







//�Ʒ��� ���� ���, go method....running by thread... ��� ������.
//������ ���� running by thread... go method... ��� ������ �Ǵ� �� �ƴѰ�?
//main �̶�� �����尡 �̹� �ϳ� �����Ƿ�. public MainThreadTest()�� ���� ���� ��.
//���� �켱���� ������ �ڵ� �̻��� ���� �� �ִ�.
//
//
	//public class MainThreadTest implements Runnable {
	//	
	//	public void go(){
	//		System.out.println("go method....runnning by main");
	//	}
	//	
	//	public MainThreadTest() {
	//		//thread ����
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
		//thread ����
		Thread t = new Thread(this);
		t.start();
		
		try {
			t.join(); // t�� �۾��� ��ĥ������ �ٸ� ��������� ��ٷ� ��
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
