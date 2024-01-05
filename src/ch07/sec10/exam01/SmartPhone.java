package ch07.sec10.exam01;

public class SmartPhone extends Phone {  // 부모 Phone 클래스 상속
	
	//생성자 선언
	SmartPhone(String owner) {
		super(owner); // 부모의 생성자 호출
	}
	
	//메소드 선언 (추가)
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
