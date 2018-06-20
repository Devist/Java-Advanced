package com.exception;

public class C5_MoneyTransfer {
	
	public void withdraw() {	//��� �޼ҵ�
		System.out.println("����۾�");
	}
	
	//exception�� try/catch�� ó���Ѵٸ�? ��ݵ� �ѹ���ѳ���������, deposit() �޼ҵ� ���� �Ǳ� ������, 
	//�׸��� deposit()�� �Աݸ� �����ϱ� ������, �������� ó���ϴ°� �´�.
	//���� �� ���� �޼ҵ��� transfer�� ������ transfer���� ó���ϵ��� �ϴ� ���� �´�.
	//���� throws Exception���� ���� transfer() �޼ҵ忡 �����Ѵ�.
	public void deposit() throws Exception{		//�Ա� �޼ҵ�
		System.out.println("�Ա��۾�");
		throw new Exception();	//������ ���� �߻����� ��
	}
	
	
	public void transfer() {	//��ü �޼ҵ�
		withdraw();
		
		try {
			deposit();
		} catch (Exception e) {
			System.out.println("�Աݿ���");
			System.out.println("������");
		}
	}
	
	public static void main(String[] args) {
		C5_MoneyTransfer mt = new C5_MoneyTransfer();
		mt.transfer();
	}
}
