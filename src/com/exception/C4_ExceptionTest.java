package com.exception;

//아무도 Exception 처리를 안한 결과가 된다. 결론적으로 아무도 처리는 안하고 버추얼 머신으로 던져 버렸으나,
//문법적으로 맞기 때문에 문제는 발생하지 않는다.
//Main 내에서는 대게 try/catch로 처리를 해주도록 한다.
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
