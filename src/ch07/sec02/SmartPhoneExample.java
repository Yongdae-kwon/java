package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {		
		
		
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		//model color 필드에 값이 저장되어있는지 확인
		System.out.println("모델 : "+ myPhone.model);
		System.out.println("모델 : "+ myPhone.color);
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 :" + myPhone.wifi);
		
		//Phone으로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요 ! 저는 홍길동인데요");
		myPhone.sendVoice("아 ~ 네, 반갑습니다.");
		myPhone.hangUp();
		
		//SmartPhone 매서드 호출
		myPhone.setwifi(true);
		myPhone.internet();
		}
	}
