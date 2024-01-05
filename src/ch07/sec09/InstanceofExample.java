package ch07.sec09;

public class InstanceofExample {

	// 정적메서드 생성
	// 매개변수 : Person 객체 타입	
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();

		// 지금 들어온 person 객체가 Student 있었나? 원래 Student 개체 확인 
		if (person instanceof Student) {        // 원래 Student 객체인가 ? 확인해서 True면
			Student student = (Student)person;  // 원래 있던 Student 객체로 강제 형변환
			System.out.println("StudentNo : " + student.studentNo);
			student.study();
		}
		
		 //JAVA 12이후 : True 일때 자동으로 강제 형변환 (원래 타입으로
		 /*if (person instanceof Student student){
		 	System.out.println("studentNo : " + student.studentNo);
		 	student.study();
		 }*/
	}
	public static void main(String[] args) {
		
		Person p1 = new Person ("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		// 자식 에서 부모 : 자동 형 변환 
		// Student에 추가한 필드와 메서드 사용 불가능한테 위에 instanceof에서
		Person p2 = new Student ("김길동",10); 
		personInfo(p2);
	}
}
