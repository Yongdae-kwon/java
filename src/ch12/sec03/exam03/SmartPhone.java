package ch12.sec03.exam03;

public class SmartPhone {
	
	//필드 : 회사명과 운영체제 선언
	private String company;
	private String os;
	
	//생성자
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {     // Object의 toString () 메서드를 재정의해서 
		return company + "," + os; // 제조사와 운영체제가 결합된 문자열을 리턴하도록함
	}
}
