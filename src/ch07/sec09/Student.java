package ch07.sec09;

public class Student extends Person {  // 부모 Person 자식 Student
	
	//필드 선언
	public int studentNo;
	
	//생성자 선언
	public Student(String name, int studentNo) { // Student 객체생성 (이름, 학생번호)
		super(name);    // 부모가 가지고 있는 name을 가져오고
		this.studentNo = studentNo;
	}
	
	//메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
