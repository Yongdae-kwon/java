package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
		//Phone myphone = new Phone("홍길동"); //  Phone 클래스가 추상클래스 이기 떄문에 객체 생성 불가
		
		SmartPhone smartphone = new SmartPhone("홍길동"); // 자식 클래스에서 객체 생성함
		
		smartphone.turnOn();			//부모 메서드 기능
		smartphone.internetSearch();	//자식 메서드 기능
		smartphone.turnOff();			//부모 메서드 기능
	}

}
