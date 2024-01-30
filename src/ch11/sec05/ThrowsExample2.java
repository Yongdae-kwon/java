package ch11.sec05;

public class ThrowsExample2 {

	public static void main(String[] args) throws Exception {
		findclass();
	}
	public static void findclass () throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
