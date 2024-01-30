package ch09.sec02.exam01;

public class A {
	
	
	class B {} //중첩 인스턴트 멤버 클래스
	
	// 인스턴틋 필드 값으로 B 객체 대입
	B field = new B();
	
	//생성자
	A() {
		B b = new B();
	}
	
	//인스턴스 메서드
	void method () {
		B b = new B();
	}
}
