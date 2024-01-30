package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		
		InterfaceImpl impl =new InterfaceImpl(); // 인터페이스 구현 객체 생성

		InterfaceA ia =impl;   // 구현 객체를 인터페이스에 대입 A
		ia.methodA();
		//ia.methodB();
		System.out.println();
		
		InterfaceB ib =impl;   // 구현 객체를 인터페이스에 대입 B
		//ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic =impl;   // 구현 객체를 인터페이스에 대입 C
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
