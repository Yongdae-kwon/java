package ch08.sec07;

public class ServiceExample {

	public static void main(String[] args) {
		
		Service service = new ServiceImp1();
		
		//디폴트 매서드 실행
		service.defaultMethod1(); // 객체 생성해서 실행
		System.out.println();
		service.defaultMethod2(); // 객체 생성해서 실행
		System.out.println();
		
		//정적 메서드 실행
		Service.staticMethod1();  // 객체 생성없이 다이렉트로 실행
		System.out.println();
		Service.staticMethod2();  // 객체 생성없이 다이렉트로 실행
		System.out.println();
		
	}

}
