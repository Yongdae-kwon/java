package ch09.sec02.exam01;

public class AEample {

	public static void main(String[] args) {
		
		//밖에 있는 객체 생성
		A a = new A();
		
		// 안(B) 에 있는 객체 생성
		A.B b = a.new B();
	}
}
