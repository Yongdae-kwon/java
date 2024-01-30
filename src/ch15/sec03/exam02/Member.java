package ch15.sec03.exam02;

public class Member {
	
	//필드
	public String name;
	public int age;
	
	//생성자 : name과 age로 Member 객체 생성 가능
	public Member(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	
	//매서드
	//hashCode 재정의  : 객체 비교 코드 값이 같은지 확인
	@Override
	public int hashCode() {
		return name.hashCode() +age;  
	}
	
	//equals 재정의 : 객체 안에 데이터를 검증
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age==age) ;
		}else {
			return false;
		}		
	}
}
