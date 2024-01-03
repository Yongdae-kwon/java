package ch05.sec12;
import java.util.Scanner;
public class confirmation09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentNum = 0;		
		int [] scores = null;  // null 로 초기화 안시키면 뒤에 값이 들어가지 못한다.
		
		boolean run = true;
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>");
			
	     	
			int selectNo = Integer.parseInt(scan.nextLine());
			
			if (selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			}
			else if (selectNo == 2) {
				for(int i=0; i <scores.length;i++) {
					System.out.print("scores["+i+"]>");
					scores [i] = Integer.parseInt(scan.nextLine());					
				}				
			}	
			else if (selectNo == 3) {
				for(int i=0; i <scores.length;i++) {
				   System.out.println("scores["+i+"]:"+ scores[i]);
				}
			}
			else if (selectNo == 4) {
				int sum =0;
				int max =0;
				double avg;
				
				   for(int i=0; i <scores.length;i++) {								
					  sum += scores[i];
					  max = (max<scores[i])? scores[i] : max;	 	
				   }
				avg = (double)sum / scores.length;
				System.out.println("최고 점수:" + max );
				System.out.println("평균 점수:" + avg );
			}
			else if (selectNo == 5) {
				run = false;
			}
		}		
		System.out.print("프로그램 종료");
	}
}
