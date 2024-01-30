package ch13.example;
// 실습과제 11.3: Vehicle.java
// 일반 차량을 모델한다

public abstract class Vehicle
{
	// 차량의 모델명과 가격에 대한 객체 변수를 선언한다
    // 여기에 코드를 입력하세요
	protected String model;
	protected int price;

	// 차량의 모델명과 가격을 주어진 값으로 초기화하면서
	// 객체를 생성한다
	public Vehicle (String model,int price) {		
		this.model = model; // setModel(model)
		this.price = price;	// setPric (price)
	}
	
	// 차량의 모델을 반환한다
    // 여기에 메소드를 입력하세요
	
	// 차량의 가격을 반환한다
    // 여기에 메소드를 입력하세요
	
	// 차량의 모델명과 가격을 반환한다
    // 여기에 메소드를 입력하세요
	
	// 차량의 모델을 주어진 값으로 변경한다
    // 여기에 메소드를 입력하세요

	// 차량의 가격을 주어진 값으로 변경한다
    // 여기에 메소드를 입력하세요
	
	
	public String getModel() {return model;}

	public void setModel(String model) {this.model = model;}

	public int getPrice() {return price;}

	public void setPrice(int price) {this.price = price;}     
	
	public String toString() {
		return " 모델명: " + model + " , 가격 : " + price;
	}

	// 차량의 세금을 계산한다
    // 여기에 메소드를 입력하세요
	public abstract double calculatorTax();

	
	
	
	
	
	
	
	
}