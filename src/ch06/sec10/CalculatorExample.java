package ch06.sec10;

import ch06.sec10.Calculator;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//객체 생성 안함,  static 멤버에 접근 가능
		//double result1 = 10 * 10 * Calculator.pi; // pi에 접근
		//int result2 = Calculator.plus(10, 5);     // 매소드 plus 에 접근
		//int result3 = Calculator.mius(10, 5);     // 메소드 minus 에 접근
		
		//System.out.println("result1 : " + result1);
		//System.out.println("result2 : " + result2);
		//System.out.println("result3 : " + result3);
		
		
		
		Calculator myCalcu = new Calculator();
		double result6 = 10 * 10 * myCalcu.pi; // pi에 접근
		int result4 = myCalcu.plus(10, 5);     // 매소드 plus 에 접근
		int result5 = myCalcu.mius(10, 5);     // 메소드 minus 에 접근
		
		System.out.println("result6 : " + result6);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);

	}

}
