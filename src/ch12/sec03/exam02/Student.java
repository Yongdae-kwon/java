package ch12.sec03.exam02;

public class Student {
	
	//필드
	private int no;
	private String name;
	
	//생성자 : 매개변수 2개로 객체
	public Student(int no,String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {return no;}
	public String getName() {return name;}

	
	
	// hashCode ()를 재정의하지 않으면 객체 번지로 해시코드를 생성하므로 객체가 다를 경우 해시코드도 달라진다.
	@Override    
	public int hashCode() {
		int hashCode = no + name.hashCode();// Object의 hashCode () 메서드를 재정의해서
											// 학번과 이름의 해쉬코드를 합한 새로운 해쉬코드를 리턴하도록함
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {     // Object 의 equals() 메서드를 재정의해서
		if(obj instanceof Student target) { // Student 객체인지를 확인하고 , 학생 번호와 이름이 같은면 true를 리턴하도록함
			if (no == target.getNo() && name.equals(target.getName())) {
				 return true;
			 }
					
		}
		return false;
	}
}
