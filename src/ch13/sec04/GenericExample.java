package ch13.sec04;

public class GenericExample {
	
	// 제네릭 메서드 생성 : 제한된 타입
	public static <T extends Number> boolean compare(T t1, T t2) {
		//T의 타입을  출력
		System.out.println("compare(" + t1.getClass().getSimpleName()+"," 
							+ t2.getClass().getSimpleName()  +")");
		//Number의 메서드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);				
	}

	public static void main(String[] args) {
		//제네릭 메서드 호출
		boolean result1 = compare(10,20); // 문자 "10" 을 넣으면 Number로 제한되어있기때문에 Error
		System.out.println(result1);
		System.out.println();
		
		//제네릭 메서드 호출
		boolean result2 = compare(4.5,4.5);
		System.out.println(result2);
	}
}
