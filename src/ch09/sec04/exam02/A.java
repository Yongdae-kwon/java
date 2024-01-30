package ch09.sec04.exam02;

public class A {
	
	//매서드
	void useB() {
		class B {   // 로컬 클래스 : useB 메서드가 실행될 때 클래스 B 객체 생성 가능
			
			//인스턴스 필드
			int field1 =1;
			
			// 정적 필드
			static int field2 = 2;
			
			//생성자 : B객체 생성자
			B() {
				System.out.println("B-생성자 실행");
			}
			
			// 인스턴스 메서드
			void method1() {
				System.out.println("B-method1 실행");
			}
			
			// 정적 메서드
			static void method2 () {
				System.out.println("B-method2 실행");
			}
		}
		
		//useB 라는 메서드 
		//B 객체 생성
		B b = new B();
		
		// b 객체를 이용하여 필드와 메서드 접근
		System.out.println(b.field1);
		b.method1();
		
		//정적 부분에 직접 클래스명과 필드 ,메서드 입력해서 실행
		System.out.println(B.field2);
		B.method2();
	}

}
