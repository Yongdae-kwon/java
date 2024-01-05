package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		
		//객체 생성 및 자동형 타입 변환 : 자식 객체를 부모 타입 객체 생성
		Parent parent = new Child();
		
		parent.field01 = "data1";
		
		parent.method1();
		parent.method2();
		System.out.println("parent.field01 : " + parent.field01);
		
		/*
		parent.field02 = "data2";        // 자동형 변환으로 field2가 삭제
		parent.method3(); 				 // 자동형 변환으로 method3의 삭제
		*/
		
		// 강제 타입 변환  부모  --> 자식으로 변환
		Child child = (Child) parent;
		
		//
		child.field02 = "data2";         // 강제형 변환으로 field2가 추가
		child.method03(); 				 // 강제형 변환으로 method3이 추가
		System.out.println("parent.field02 : " + child.field02);
	}
}
