package ch09.sec05.exam01;

public class A {
	
	//인스턴스 필드 , 인스턴스 메서드
	int field1;
	void method1() {}
	
	// 정적 필드와 정적 메서드
	static int field2;
	static void method2() { }
	
	// 인스턴스 멤버 클래스 (안에 B가 인스턴스인 경우)
	class B {
		void method () {
			field1=10;    // 밖에 인스턴스 필드
			method1();    // 밖에 인스턴스 메서드
			
			field2 = 10;  // 밖에 정적 필드
			method2 ();  //  밖에 정적 메서드
		}
	}
	//정적 멤버 ㅡㄹ래스
	static class C{   //이 시점에서 Class A 외부가 있는 인스턴스 필드와 인스턴스 메서드가 생성이 안될수 있다.
		void method() {
			
			field2 = 10;
			method2();	 
		}
	}

}
