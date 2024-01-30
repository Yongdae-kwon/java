package ch16.sec05.exam03;

public class Member {
	
	private String id;		 // private 필드면  나중에 getter , setter 만들어 주어야한다 생각 
	private String name;	 // private 접근 권한이 없으므로 getter, setter 을 생각해야한다.

	// 생성자
	public Member(String id) {
		this.id = id;   // 앞은 필드 id  뒤는 대입되는 매개변수값
		System.out.println("Member(String id)");		
	}
	
	public Member(String id , String name) {
		this.id = id;   // 앞은 필드 id  뒤는 대입되는 매개변수값
		this.name = name;
		System.out.println("Member(String id , String name)");		
	}
	
	@Override
	public String toString() {  
		String info = "{ id: " + id + ", name : " + name + " }";
		return info;		 
	}
}
