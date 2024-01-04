package ch06.sec08;

public class Computer {
	
	
	//가변 길이 매개변수를 갖는 메소드 선언
	int sum(int ...values) {      // ... 매개변수의 갯수 상관없고 , 배열도 상관없이 입력가능
		//sum 변수 선언
		int sum = 0; 
	
	// values 는 배열 타입의 변수처럼 사용
	for (int i = 0 ; i < values.length ; i++) {
		sum += values[i];
	}
	//합산 결과를 리턴
	return sum;

  }
}
