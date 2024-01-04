package ch06.sec15;

public class Singleton {
	
	private static Singleton singleton = new Singleton(); // private static 앞쪽 클래스 뒤쪽 변수형태
	//클래스는 대문자로 시작 , 객체 변수는 소문자로 시작
	
	private Singleton() {		
	}
	
	static Singleton getInstance () {
		return singleton;
	}

}
