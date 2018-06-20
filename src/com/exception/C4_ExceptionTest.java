package com.exception;

//�ƹ��� Exception ó���� ���� ����� �ȴ�. ��������� �ƹ��� ó���� ���ϰ� ���߾� �ӽ����� ���� ��������,
//���������� �±� ������ ������ �߻����� �ʴ´�.
//Main �������� ��� try/catch�� ó���� ���ֵ��� �Ѵ�.
public class C4_ExceptionTest {
	public void first(int num) throws Exception {
		second(num);
	}
	public void second(int num) throws Exception {
		third(num);
	}
	public void third(int num) throws Exception{
		if(num>0)
			System.out.println("well done...");
		else
			throw new Exception();
	}
	
	public static void main(String[] args) throws Exception {
		C4_ExceptionTest et = new C4_ExceptionTest();
		et.first(-1);	
	}
}
