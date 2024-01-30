package ch13.example;
// 실습과제 11.3: Car.java
// 승용차를 모델한다

public class Car extends Vehicle
{
	// 승용차의 배기량에 대한 객체 변수를 선언한다
    // 여기에 코드를 입력하세요
	private int volume;
	
	// 승용차의 모델명, 가격과 배기량을 주어진 값으로 초기화하면서
	// 객체를 생성한다
	// 여기에 메소드를 입력하세요
	public Car (String model, int price, int volume) {
		super(model,price);
		this.volume = volume;
	}

	// 승용차의 배기량을 반환한다
    // 여기에 메소드를 입력하세요
	
	// 승용차의 배기량을 주어진 값으로 변경한다
    // 여기에 메소드를 입력하세요
	public int getVolume() {return volume;}
	public void setVolume(int volume) {this.volume = volume;}
	
	// 승용차의 세금을 계산한다
    // 여기에 메소드를 입력하세요
	@Override
	public double calculatorTax() {
		if(volume >= 3000) return price*0.05;
	    else if (volume >= 1500) return price*0.03;
		else return price*0.01;
	}
	
	// 승용차의 모델명, 가격과 배기량을 반환한다
    // 여기에 메소드를 입력하세요
	public String toString() {
		return super.toString() + ", 배기량: " + volume;
	}


}
