package ch09.sec02.exam02;

public class A {
	
	class B {
		//인스턴스 필드     : 객체 생성 후 사용 가능
		int field1 = 1;
		// 인스터스 정적 필드    지금 에러가 있는 이유 : 17이상부터 지원..
		static int field2 = 2;  // 객체를 생성하지 않고 바로 사용 가능 클래스명,필드명
		// 생성자
		B() {
			System.out.println("B-생성자 실행");
		}
		
		//인스턴스 메서드
		 void method1() {
			 System.out.println("B-metho1 실행");
		 }
		
		//인스턴스 정적 메서드 : 자바 17이상 지원
		 static void method2() {
			 System.out.println("B-metho2 실행");
		 }
		 
	}
	
	//인스턴스 메서드 (A 클래스 내)
	void useB(){
		
		//B객체 생성 및 B 필드1 사용
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		//field2(정적) : 객체 생성을 적지 않더라도 클래스명, 필드명 : 바로 사용 가능
		System.out.println(B.field2);
		B.method2(); // 정적 메서드라서 객체 생성을 하지 않더라도 클래스명 , 메서드명으로 바로 사용 가능
	}

}
