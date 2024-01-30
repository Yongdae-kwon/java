package ch12.sec04;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		
		//밀리 타임 : 1 / 1000초 단위
		//나노 타임 : 1 / 10^9초 단위
		
		
		long time1 = System.nanoTime();		// 계산 시작 시간
			int sum = 0;
			for (int i=0; i <=1000000; i++) {
				sum += i;
			}
		long time2 = System.nanoTime();		// 계산 끝난 시간
		
		System.out.println("1~1000000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2-time1) + "나노초가 소요되었습니다.");
	}
}
