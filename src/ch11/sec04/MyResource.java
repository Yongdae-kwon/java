package ch11.sec04;

public class MyResource implements AutoCloseable {  //AutoCloseable : 인터페이스
	
	//필드
	private String name;
	
	//생성자
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource(" + name + ")열기}" );		
	}
	
	//매서드
	public String read1() {
		System.out.println("[MyResource(" + name + ")읽기}");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + ")읽기}");
		return "abc";
	}
	
	@Override
	public void close() throws Exception {  // 예외 발생 시 자동으로 리소스 닫기
		System.out.println("[MyResource(" + name + ")닫기}");
	}
}
