package ch12.sec06;

public class ValueCompareExample {

	public static void main(String[] args) {

		
		//-128~127 초과값일 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		// 127 를 초과했으니 객체가 따로 따로 생성		
		System.out.println("== : " + (obj1 == obj2));			 // 저장되어있는 번지 주소 비교
		System.out.println("equals() : " + obj1.equals(obj2));	 // 값을 비교
		System.out.println();
		
		//-128~127 값 안에 있는 정수
		Integer obj3 = 10; //Integer 값 범위 안에 있을때는 객체 생성
		Integer obj4 = 10; 
		
		System.out.println("== : " + (obj3 == obj4));			 // 저장되어있는 번지 주소 비교
		System.out.println("equals() : " + obj3.equals(obj4));	 // 값을 비교
		System.out.println();
		
	
	}
}
