package ch08.sec02;

public class Television implements RemoteControl {

	@Override             // RemoteControl 의 추상메서드  turnOn 구체적으로 구현
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		}

}
