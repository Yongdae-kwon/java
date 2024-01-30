package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicExample {

	public static void main(String[] args) {
		
		// 스레드 풀 : 실행 서비스 스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 작업생성과 처리 요청
		
		//스레드 풀 종료
		executorService.shutdownNow();
	}
}
