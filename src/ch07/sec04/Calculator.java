package ch07.sec04;

public class Calculator {
	
	//매서드 선언
	public double areaCircle(double r) { // 반환타입 double, 매개변수 r : 반지름
		System.out.println("Calclator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;		
	}
}
