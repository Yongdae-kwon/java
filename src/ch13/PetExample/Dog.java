package ch13.PetExample;

//실습과제 10.1: Dog.java
//개를 모델한다

public class Dog extends Pet {
	private String breed;			// 품종
	private boolean boosterShot;	// 예방주사 접종여부

	
	// 개의 이름, 나이, 품종을 각각 주어진 값으로 초기화하고
	// 예방주사 접종여부는 false로 초기화하면서 Dog 객체를 생성한다
	// 여기에 코드를 입력하세요
	public Dog(String name, int age, String breed) {
		super(name,age);
		this.breed = breed;
		boolean boosterShot = false;
	}
	

	// 개의 모든 데이터를 알려 준다
	// 여기에 코드를 입력하세요
	public String toString() {
		return super.toString() + " 품종 : " + breed;     
	}

	// 개의 품종을 알려 준다
	// 여기에 코드를 입력하세요
	public String getBreed() { return breed; }
	// 개의 품종을 변경한다
	// 여기에 코드를 입력하세요
	public void setBreed(String newBreed) { this.breed = breed;}


	public boolean getBoosterShot() {return boosterShot;}

	public void setBoosterShot(boolean boosterShot) {this.boosterShot = boosterShot;}

	// 개의 예방주사 접종여부를 변경한다
    // 여기에 메소드를 입력하세요
	
	//public boolean getBooster

	// 개의 예방주사 접종여부를 알려 준다
    // 여기에 메소드를 입력하세요
}