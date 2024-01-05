package ch07.sec10.exam02;

public abstract class Animal { // Animal 클래스를 추상클래스로 선언
	
	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드 선언  -- > 자식 쪽에서 오버라이딩을 통해서 코드를 작성 유도
	public abstract void sound(); 
}
