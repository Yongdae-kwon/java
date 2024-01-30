package ch13.sec03.eaxm01;

public class GenericExample {
	
	//제네릭 메서드 : 반환되는 타입은 T Box Boxing 메서드 매개변수 타입을 알수 없다.
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;		
	}

	public static void main(String[] args) {
		//제네릭 메서드 호출
		Box<Integer>box1 = boxing(100);		// box1 객체의 T 필드에 값을 100을 대입
		//100이 들어갔으므로 Integer 형태
		int intValue = box1.get();			// box 안에 있는 값을 가져온다.
		System.out.println(intValue);
		
		//제네릭 메서드 호출
		Box<String>box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
