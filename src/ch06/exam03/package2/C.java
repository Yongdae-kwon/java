package ch06.exam03.package2;

import ch06.exam03.package1.*;

public class C {
	
	public C() {
	
	//A 클래스에 접근하여 a 객체 생성
	A a = new A();
	
	//a 객체에 필드 값 변경
	a.field1 = 1;   // field1 : pubilc 이라서 접근 가능
	a.field2 = 1;   // field2 : default 같은 패키지 내라서 접근 불가능
	a.field3 = 1;   // field3 : private 라서 같은 파일 안이 아니라 접근 불가능
	
	a.method1();   //  method1 : pubilc 이라서 실행 가능
	a.method2();   //  method2 : default 같은 패키지 내라서 실행 불가능
	a.method3();   //  method3 : private 라서 같은 파일 안이 아니라서 접근 불가능

	}
}
