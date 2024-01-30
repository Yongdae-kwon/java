package ch14.sec05.exam02;

public class SumThread extends Thread { 	// 스레드 객체 상속
	
	//필드
	private long sum;

	//메서드
	public long getSum() {return sum;}

	public void setSum(long sum) {this.sum = sum;}

	@Override
	public void run() {
		for(int i=1; i <=100; i++) {
			sum+=i;
		}
	}
}
