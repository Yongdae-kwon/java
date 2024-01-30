package ch16.sec01;

public class LambadaExample {

	public static void main(String[] args) {
		
		action((x, y) -> {			//action 메서드 실행 (x, y) 매개변수 : 하나의 추상 메서드 
									//데이터처리부에서 추상메서드를 구체화 시켜준다
			int result = x + y;
			System.out.println("result : " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result : " + result);
		});
	}
	
	public static void action (Calculable calculable) { // 인터페이스
		
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		calculable.calculate(x,y); // 추상 메서드
	}
}
