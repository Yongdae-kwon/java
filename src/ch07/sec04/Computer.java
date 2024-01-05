package ch07.sec04;

public class Computer extends Calculator { // 자식 클래스   부모 : Calculator

	@Override
	public double areaCircle(double r) {
		// TODO Auto-generated method stub
		return super.areaCircle(r);
	}  
	
	
	
	
	
	
	
	//매서드 오버라이딩 Override
	
	//부모에서 이미 같은 areaCircle 쓰고있어서
	/*
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;			
	}*/
	
}
