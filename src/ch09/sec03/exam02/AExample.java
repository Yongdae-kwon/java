package ch09.sec03.exam02;

public class AExample {

	public static void main(String[] args) {
		
		
		// static 내부 클래스 객체 생성
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		
		//static으로 되어있는 필드와 메서드 : 밖클래스명.안클래스명.필드명(or메서드명)
		System.out.println(A.B.field2);
		A.B.method2();
	}

}
