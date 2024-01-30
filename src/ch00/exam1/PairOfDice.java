package ch00.exam1;

public class PairOfDice {
	
	//필드
	private int faceValue1;				// 첫 번째 주사위 숫자
	private int faceValue2;				// 두 번째 주사위 숫자
	
	// 생성자 : 필드값을 초기화
	public PairOfDice() {
		faceValue1 = 1;
		faceValue2 = 1;
	}

	//메서드
	public void roll() {
		
		faceValue1 = (int)(Math.random()*6)+1;   // Math.random - 0.1~0.9 이므로 1~6까지 뽑기위해 
											     // 소수점이므로 정수로
		faceValue2 = (int)(Math.random()*6)+1;		
	}
	
	public int getFaceValue1() {	return faceValue1;	} 
	public int getFaceValue2() {	return faceValue2;	}
	}
