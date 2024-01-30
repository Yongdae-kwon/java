package ch11.sec05;

public class ThrowsExample1 {

	public static void main(String[] args) {
		
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());	
		}
	}
	//ClassNotFoundException 이 일어나 면 호출한 쪽으로 예뢰르 넘겨준다.
	//(호출한 Main으로
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
