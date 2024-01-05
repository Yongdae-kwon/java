package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		
		//자식 객체 생성
		Child child = new Child (); 
		// child에서 실행가능한 메서드 
		// : method1(parent에 있는 부모) method2(Child에 있는 수정) method3 (Child에 있는 추가)
		
		
		//자식을 부모 객체 타입형으로 자동 타입 변환
		Parent parent = child;
		//parent 에서 실행 가능한 메서드 : method1 (부모) , method2 (수정) 
		// method3 (추가) : 사용불가
		
		parent.method1();
		parent.method2();
	    //parent.method3(); (호출 불가능) 부모 객체 타입으로 변환이 되면서 method3이 사라짐
	}
}
