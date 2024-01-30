package ch13.example;
// 실습과제 11.3: Truck.java
// 트럭를 모델한다

public class Truck extends Vehicle
{
	// 트럭의 적재 중량에 대한 객체 변수를 선언한다
    // 여기에 코드를 입력하세요
	private double load;

	// 트럭의 모델명, 가격과 적재 중량을 주어진 값으로 초기화하면서
	// 객체를 생성한다
    // 여기에 메소드를 입력하세요
	public Truck(String model,int price, int load) {
		super(model,price);
		this.load = load;
	}

	// 트럭의 적재 중량을 반환한다
    // 여기에 메소드를 입력하세요
	
	// 트럭의 적재 중량을 주어진 값으로 변경한다
    // 여기에 메소드를 입력하세요	
	public double getLoad() {return load;}
	public void setLoad(double load) {this.load = load;}
	
	
	// 트럭의 세금을 계산한다
    // 여기에 메소드를 입력하세요
	
	@Override
	public double calculatorTax() {
		if(load >= 10000) return price*0.04; 
		else if (load >= 5000) return price*0.02;
		else return price*0.01;
	}

	// 트럭의 모델명, 가격과 적재 중량을 반환한다
    // 여기에 메소드를 입력하세요.	
	public String toString() {
		return super.toString() + ", 적재 중량: " + load;
	}

	
}
