package ch07.sec02;

public class SmartPhone extends Phone {      // phone이 가진 기능에 기능을 추가
					// extends Phone - phone이 가진 필드와 메소드를 참고해서 가져온다
	
	
	//phone (class)의 기능 (작성된 부분) 다시 쓰기 힘드니
	//상속을 이용한다.
	//필드 선언 
	public boolean wifi; // 와이파이 상태 추가
	
	//생성자 선언
	public SmartPhone (String model , String color) {
		this.model = model;   // model color 을 써도 error가 없는이유 
		this.color = color;   // Phone으로부터 상속을 받기때문이다.
	}
	
	//메소드 선언 : 와이파이 상태 변경, 인터넷 연결
	public void setwifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}	
}
