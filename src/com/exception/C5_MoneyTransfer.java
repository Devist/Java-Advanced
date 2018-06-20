package com.exception;

public class C5_MoneyTransfer {
	
	public void withdraw() {	//출금 메소드
		System.out.println("출금작업");
	}
	
	//exception을 try/catch로 처리한다면? 출금도 롤백시켜놔야하지만, deposit() 메소드 안이 되기 때문에, 
	//그리고 deposit()는 입금만 관리하기 때문에, 상위에서 처리하는게 맞다.
	//따라서 더 상위 메소드인 transfer로 보내서 transfer에서 처리하도록 하는 것이 맞다.
	//따라서 throws Exception으로 상위 transfer() 메소드에 위임한다.
	public void deposit() throws Exception{		//입금 메소드
		System.out.println("입금작업");
		throw new Exception();	//강제로 예외 발생시켜 봄
	}
	
	
	public void transfer() {	//이체 메소드
		withdraw();
		
		try {
			deposit();
		} catch (Exception e) {
			System.out.println("입금에러");
			System.out.println("출금취소");
		}
	}
	
	public static void main(String[] args) {
		C5_MoneyTransfer mt = new C5_MoneyTransfer();
		mt.transfer();
	}
}
