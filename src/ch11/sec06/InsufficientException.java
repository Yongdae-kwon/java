package ch11.sec06;

public class InsufficientException extends Exception { // Exception 상속 받았으니 일반 예외
	
	//일반 생성자 : 에러에 대한 간략한 출력
	public InsufficientException() {
		
	}
	
	// 매개변수를 사용하는 생성자 : message : 에러가 발생을 하게 되면 message에 있는 내용을 출력
	public InsufficientException(String message) {
		super(message);
	}
}
