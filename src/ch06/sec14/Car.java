package ch06.sec14;

public class Car {
	
	//필드 선언
	private int speed;          // 차량의 속도
	private boolean stop;       // 브레이크 작동 여부 boolean 초기값이 설정이 없다 = false
	
	//speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {             // 음수 값이 대입되면
			this.speed = 0;         // 0으로 나와진다.
			return;			
		}else {
			this.speed = speed;
		}
	}
	//stop 필드와 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) this.speed = 0;
	}
}
