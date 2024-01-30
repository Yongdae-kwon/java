package ch16.sec03;

public class LambadaExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		//매개변수가 2개인 경우
		person.action1((name,job) -> {
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});
		
		// 명려어가 한 줄일 경우 { } 생략
		person.action1((name , job) -> System.out.println(name + "이 " + job + "을 하지 않습니다."));
		
		// 매개변수가 1개인 경우 매개 변수를 감싸는 ( )  생략 가능
		person.action2(word -> {
			System.out.print("\"" + word + "\"");  // "\""  -- > " " 출력할려고
			System.out.println("라고 말합니다.");
		});
		
		// 매개 변수가 하나라고 명령어가 한 줄일 경우 ( ) 생략 , { } 생략
		person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));
	}
}
