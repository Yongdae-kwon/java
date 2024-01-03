package problem;
//실습 4.2: DetermineGraduation.java:
//총 이수학점과 TOEIC 점수에 따라 졸업/수료/졸업불가 여부를 결정한다
import java.util.Scanner;
public class BDetermineGraduation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalcreditearned;   // 총 이수학점
		int toeic;               // 토익 점수를 저장하는 변수를 선언한다
		
	    // Scanner 객체를 생성하고 scan이 가리키게 한다
	    Scanner scan = new Scanner(System.in);
	    System.out.print("총 이수학점을 입력하세요:");    // 총 이수학점을 입력받는다
	    totalcreditearned = scan.nextInt();
	    
	    System.out.print("TOEIC 점수를 입력하세요:");   // TOEIC 점수를 입력받는다
	    toeic = scan.nextInt();
	    
	    if (totalcreditearned >= 140) {
	    	if (toeic >=700)
	    	{System.out.print ("졸업을 축하드립니다.");} 
	    	
	    	else {
	    	{System.out.print ("아쉽지만 수료하셨습니다.");}
	    	}
	    
	    } else{System.out.print ("졸업이 불가합니다.");}
	   

    }
	
}