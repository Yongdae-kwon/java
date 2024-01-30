package ch12.sec03.exam01;

public class Member {
	
	//필드 선언
	public String id;
	
	//생성자  - 클래스와 같은 이름 이후 매개변수 id 
	public Member(String id) {
		this.id = id;
	}
	
	// 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {   // instanceof 타입 비교 : obj 가 Member 타입이냐?
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
}
