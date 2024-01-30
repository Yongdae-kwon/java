package ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {
		
		Member m = new Member ("winter" , "눈송이" , 25);
		
		System.out.println(m.id());      // getter 메서드 호출 (자동) record가 아니면 수동으로 추가
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m.toString()); // 재정의 하지않은 toString의 기본 형태
		System.out.println();
		
		Member m1 = new Member ("winter" , "눈송이" , 25);
		Member m2 = new Member ("winter" , "눈송이" , 25);
		System.out.println("m1.hashCode():"  + m1.hashCode());
		System.out.println("m2.hashCode():"  + m2.hashCode());
		System.out.println("m1.equals(m2):"  + m1.equals(m2)); 
	}
}
