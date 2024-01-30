package ch09.sec04.exam03;

public class A {
	
	
	//매서드 method1
	public void method1 (int arg) {  // final int arg
		
		int var = 1;    // final int var = 1;
		
		//로컬 클래스  : 메서드가 실행할 동안 클래스 생성 가능
		class B {
			
			void method2() {
				 System.out.println("arg : " + arg );
				 System.out.println("var : " + var );
				 
				 //arg = 2;
				// var = 2;				 
			}
		}
		
		B b = new B();
		b.method2();
		
		//arg = 3;
		//var = 3;
	}

}
