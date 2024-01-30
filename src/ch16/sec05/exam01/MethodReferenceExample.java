package ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		//정적 메서드일 경우  : 클래스명.메서드명     인스턴스 : 객체명.메서드명
		// 람다식 - 일반적인 형태
		person.action((x,y) -> Computer.staticMethod(x, y));
		
		// 메서드 참조 -  매개변수를 생략하고 쓰는 형태
		person.action( Computer :: staticMethod);
		
		
		// 인스턴스 메서드일 경우 : 객체명.매서드명
		Computer com = new Computer();  // 인스턴스 메서드라  객체 생성
		
		//람다식  - 일반적인 형태
		person.action((x, y) -> com.instanceMethod(x, y));  // 인스턴스 메서드 - 객체선언 이후  / 객체명.메서드명
		
		// 매개 변수를 생략하고 쓰는 형태
		person.action( com :: instanceMethod);
	}
}
