package com.exception;
//사용자 정의 예외 클래스
// Throwable 또는 Exception을 상속 받으면 예외 클래스가 된다.
class MyException extends Exception{
	MyException(String message){
		
		//자기 부모인 Exception한테 메시지를 보낸다.
		//이 메세지는 try/catch문의 getMessage()에 사용된다.
		//꼭 안 만들어도됨
		super(message); 
	}
}




public class C3_MyExceptionTest {
	
	//상속관계가 존재한다면, 메모리에는 부모가 먼저 올라가서(만들어져서,생성되서), 자식이 수정하거나 추가한 내용이 반영된다.
	public void increase(int num) throws MyException, Exception {
		if(num > 0)
			System.out.println(++num); 
		else if(num ==0)
			throw new MyException("num은 양수이어야 합니다."); //throw: 강제로 예외를 발생시킬때 사용하는 키워드. throw는 두가지 방법으로 처리 가능. 그 자리에서 처리할 것인가?(try/catch) 또는 호출자로 보내서 예외처리 위임? (throws)
		else
			throw new Exception();
		
	}
	
	public static void main(String[] args) {
		C3_MyExceptionTest mt = new C3_MyExceptionTest();
		
		try {
			mt.increase(8);
			mt.increase(0);	//MyException 진입하고 메시지 정의했으므로, System.out.println(e.getMessage())는 정의한 메시지가 출력된다.
			mt.increase(-8); // Exception 진입하고 메시지 정의하지 않았으므로, System.out.println(e.getMessage())는 null이다.
		} catch (Exception e) {
			e.printStackTrace();	//디버깅할 땐 요걸로
			System.out.println(e.getMessage());
		}
	}

}
