package ch12.sec04;

public class InExample {

	public static void main(String[] args)throws Exception {
		
		int speed = 0;
		int keyCode = 0;
		
		while (true) {
			if (keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {  		//49는 숫자1
					speed++;
				}else if (keyCode == 50) {  // 50은 숫자2
					speed--;
					
				}else if (keyCode == 51) {  // 51은 숫자3
					break;
					//System.exit(0); //강제종료
				}
				System.out.println("----------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("----------------------");
				System.out.println("현재 속도 = " + speed);
				System.out.print("선택:");				
			}
			
			//키를 하나씩 읽음
			keyCode = System.in.read();	// 키보드를 ASC 코드를 입력 받는다.
		}
		System.out.println("프로그램 종료"); 
	}
}
