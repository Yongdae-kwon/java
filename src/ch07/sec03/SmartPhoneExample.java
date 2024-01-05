package ch07.sec03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		//부모 Phone의 생성자 먼저 호출 --> 자식 SmartPhone 생성자 호출
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);

	}

}
