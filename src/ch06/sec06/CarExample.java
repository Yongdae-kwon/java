package ch06.sec06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//main 에서 car 클래스 사용
		
		// Car 객체 생성
		
		Car myCar = new Car ();
		
		System.out.println("제작회사: " + myCar.company); 
		System.out.println("모델명: " + myCar.model); 
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed); 
		System.out.println("현재속도: " + myCar.speed); // 초기값이 설정이 안되어 있어 기본 값 0
		
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed); 
		
		myCar.color = "빨강";
		System.out.println("수정된 색깔: " + myCar.color);
	}

}
