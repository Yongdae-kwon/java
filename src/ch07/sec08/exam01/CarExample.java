package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		//Car 객체 생성
		Car myCar = new Car ();
		
		
		//Car 객체내에 Tir객체에 어떤 타이어객체 (Tire,HankookTire,KumhoTire)을 넣는거에 따라 동작이 달라진다.
		
		//Tire 객체 장착     
		myCar.tire = new Tire(); // 내 차(myCar)에 타이어(.tire)에 일반 타이어(Tire)를 추가
		myCar.run();
		
		//HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();
	}
}
