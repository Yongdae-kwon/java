package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread ();
		sumThread.start();
		try {
			sumThread.join();		// sumThread 종료까지 기다림
		} catch (InterruptedException e) {
		}
		System.out.println("1~100의 합 : " + sumThread.getSum());
	}
}
