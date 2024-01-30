package ch16.sec05.exam01;

public class Computer {
	
	// 정적 메서드 : 객체 생성없이 바로 사용 가능
	public static double staticMethod (double x , double y) {
		return x + y;
	}
	
	// 인스턴스 메서드  - 일반적인 메서드  : 객체 생성 후에 사용 가능
 	public double instanceMethod (double x , double y) {
		return x + y;
	}
}

//정적 메서드 와 인스턴스 메서드 차이점 : 정적 (static) 이 붙어있으면 객체 생성없이 바로 가능
// 인스턴스 메서드는 객체 생성 후에 사용 가능 