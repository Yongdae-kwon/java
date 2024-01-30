package ch08.sec07;

public interface Service {
	
	//디폴트 매서드
	 default void defaultMethod1 () {
		 System.out.println("defaultMethod1 종속 코드");
		 defaultCommon();  // private defaultCommon  () 실행
	 }
	 
	 default void defaultMethod2 () {
		 System.out.println("defaultMethod2 종속 코드");
		 defaultCommon(); // private defaultCommon  () 실행
	 }
	 
	 
	 //private 메소드
	 private void defaultCommon() {  //private 이면 같은 인터페이스 안에서만 실행 : 구현하는 객체 필요
		 System.out.println("defaultMethod 중복코드 A");
		 System.out.println("defaultMethod 중복코드 B");
	 }
	 
	 //정적메서드
	 static void staticMethod1() {  // 구현 객체 생성 필요없이 바로 실행 가능
		 System.out.println("staticMethod1 중속 코드");
		 staticCommon();     // private static staticCommon ()실행
	 }
	 
	 static void staticMethod2() {
		 System.out.println("staticMethod2 중속 코드");
		 staticCommon();
	 }
	 
	 private static void staticCommon() {  // 같은 인터페이스 안에서만 실행 : 구현 객체 생성 필요 바로 실행 가능
		 System.out.println("defaultMethod 중복코드 C");
		 System.out.println("defaultMethod 중복코드 D");
	 }
	 

}
