package ch16.sec05.exam03;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Member m1 = person.getMember1(Member :: new); // 리턴되는 담는 그릇이 Member 그걸 m1 으로 저장
		System.out.println(m1); // toString  실행
		System.out.println();
	
		Member m2 = person.getMember2(Member :: new);
		System.out.println(m2);
	}
}
