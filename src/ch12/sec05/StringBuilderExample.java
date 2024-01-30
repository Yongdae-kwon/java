package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String data = new StringBuilder()
			.append("DEF")         // DEF (위치는 D -0 E -1 F-2
			.insert(0,"ABC")       // 0위치에 ABC 들어가서 ABCDEF
			.delete(3,4)		   // ABCDEF - 0 1 2 3 4 5 . 3은 D를 시작해서 4 E 앞까지 삭제
			.toString();		   // ABCEF
		System.out.println(data);
	}
}
