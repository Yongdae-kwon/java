package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		
		RemoteControl rc;
		
		rc = new Television();  // Television
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();   // Audio
		rc.turnOn();
		rc.setVolume (5);
		rc.turnOff();
	}
}
