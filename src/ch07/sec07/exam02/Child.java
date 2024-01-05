package ch07.sec07.exam02;

public class Child extends Parent {

	//메소드 오버라이딩
	@Override
	public void method2() {  // 수정된 메서드다
		System.out.println("Child-method2()");
	}
	
	// 자식 객체에 새로운 메서드를 추가했다.
	public void method3() {    // 추가된 메서드
		System.out.println("Child-method3()");
	}
}
