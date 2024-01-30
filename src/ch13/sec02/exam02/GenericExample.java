package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		
		HomeAgency homeAgency = new HomeAgency ();		// 홈에이전시 객체 생성해서
		Home home = homeAgency.rent();					// 에이전시에서 rent() 를 통해 home 객체 반환
		home.turnOnLight();								// home 객체 사용 가능
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}
}
