package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		
		//getter setter 이용하는 이유
		//private 설정된 field 에 접근해서 값을 수정하거나 값을 가져오기위하여
		
		//Car 객체 생성
		Car myCar = new Car ();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재속도 : "+ myCar.getSpeed());
		
		// 올바른 속도 변경		
		myCar.setSpeed(60);
		System.out.println("현재속도 : "+ myCar.getSpeed());
		
		//멈춤
		if (!myCar.isStop()) { //isStop 
			myCar.setStop(true);
		}
		System.out.println("현재속도 : "+ myCar.getSpeed());
	}
}
