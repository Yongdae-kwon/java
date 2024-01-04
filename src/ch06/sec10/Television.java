package ch06.sec10;

public class Television {
	
	static String company = "MyCompany";
	static String model   = "LCD";
	static String info;  // 값을 company-model 합성해서 값을 넣겠다.
	
	static {            // 정적 블록 : 가공한 값을 대입 할 때 
		info = company + "-" + model; 
	}
	

}
