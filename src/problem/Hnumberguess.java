package problem;
import java.util.Random;
import java.util.Scanner;
public class Hnumberguess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		int targetNumber ;  // 사용자가 맞추려고 노력하는 숫자
		int guessNumber ;   // 사용자가 추측한 숫자
		int count;         // 추측한 횟수
		final int sentinel = -99;// 감시 숫자
		String again = "예"; // 계속 여부
		
		Random generator = new Random();
		Scanner scan = new Scanner (System.in);
		
		while (again.equals("예")) {
			    count = 0;
			   //1부터 100사이의 정수를 임의로 만든다
	           targetNumber = generator.nextInt(100)+1; // 사용자가 맞추려고 노력하는 숫자
	        
	            //사용자에게 추측한 숫자를 입력하라고 요청
			   System.out.print("추측하는 숫자를 입력하세요(종료를 원하면 -99):");
			
			   guessNumber = scan.nextInt();
			   // 사용자가 추측한 숫자를 읽어 들인다.
						
			      while (guessNumber != -99) {				
				         count++; //카운트 증가
				         
				         
				       //추측한 숫자가 크거나 작거나 맞다는 메시지 출력
				
				        if (guessNumber > targetNumber) {
					        System.out.println("추측한 숫자가 크다.");
				           }
				        else if (guessNumber < targetNumber){
					        System.out.println("추측한 숫자가 작다.");
				           }
				        else {
					        System.out.println("추측한 숫자가 맞다.");
					        break;
				           }
				        
			       //사용자에게 추측한 숫자를 입력하라고 요청
			       System.out.print("추측하는 숫자를 입력하세요(종료를 원하면 -99):");
						
			       guessNumber = scan.nextInt();
				   // 사용자가 추측한 숫자를 읽어 들인다.      
					
			     }		
			     System.out.println("추출한 횟수 :" + count); // 추출한 횟수 출력
			     System.out.print("계속하기를 원하는가?(예 혹은 아니오)"); // 게임 계속 진행 여부 입력
			     again = scan.next();	
		     }
		
		
		//while(true) {
			//targetNumber 
			//if game start{
			//	 int targetNumber = generator.nextInt(100)+1; // 사용자가 맞추려고 노력하는 숫자	//1부터 100사이의 정수를 임의로 만든다
			//   while(true){
			//   //if(game end) { break;}
			//} 
			//else (endcode == -99){break;}
		//}
		
	}
}			
