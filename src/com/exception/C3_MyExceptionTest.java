package com.exception;
//����� ���� ���� Ŭ����
// Throwable �Ǵ� Exception�� ��� ������ ���� Ŭ������ �ȴ�.
class MyException extends Exception{
	MyException(String message){
		
		//�ڱ� �θ��� Exception���� �޽����� ������.
		//�� �޼����� try/catch���� getMessage()�� ���ȴ�.
		//�� �� ������
		super(message); 
	}
}




public class C3_MyExceptionTest {
	
	//��Ӱ��谡 �����Ѵٸ�, �޸𸮿��� �θ� ���� �ö󰡼�(���������,�����Ǽ�), �ڽ��� �����ϰų� �߰��� ������ �ݿ��ȴ�.
	public void increase(int num) throws MyException, Exception {
		if(num > 0)
			System.out.println(++num); 
		else if(num ==0)
			throw new MyException("num�� ����̾�� �մϴ�."); //throw: ������ ���ܸ� �߻���ų�� ����ϴ� Ű����. throw�� �ΰ��� ������� ó�� ����. �� �ڸ����� ó���� ���ΰ�?(try/catch) �Ǵ� ȣ���ڷ� ������ ����ó�� ����? (throws)
		else
			throw new Exception();
		
	}
	
	public static void main(String[] args) {
		C3_MyExceptionTest mt = new C3_MyExceptionTest();
		
		try {
			mt.increase(8);
			mt.increase(0);	//MyException �����ϰ� �޽��� ���������Ƿ�, System.out.println(e.getMessage())�� ������ �޽����� ��µȴ�.
			mt.increase(-8); // Exception �����ϰ� �޽��� �������� �ʾ����Ƿ�, System.out.println(e.getMessage())�� null�̴�.
		} catch (Exception e) {
			e.printStackTrace();	//������� �� ��ɷ�
			System.out.println(e.getMessage());
		}
	}

}
