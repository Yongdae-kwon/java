package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);   // 8 8 0 8 1 5 
		String secondNum = ssn.substring(7); // 1234567
		System.out.println(secondNum);
		
		String threeNum = ssn.substring(0,2);
		String fourNum = ssn.substring(2,4);
		String fiveNum = ssn.substring(4,6);
		System.out.println(threeNum);
		System.out.println(fourNum);
		System.out.println(fiveNum);
		}
}
