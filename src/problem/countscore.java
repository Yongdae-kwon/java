package problem;
import java.util.Scanner;
public class countscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int score; // 입력 받는 점수
		int totalCount = 0; // 정수들의 총수
		int Acount = 0;     // A 학점의 수   90점 이상
		int Bcount = 0;     // B 학점의 수   80점 이상 90점 미만
		int Ccount = 0;     // C 학점의 수   70점 이상 80점 미만
		int Dcount = 0;     // D 학점의 수   60점 이상 70점 미만
		int Fcount = 0;     // F 학점의 수   60점 미만 
		
		System.out.print("점수를 입력하세요 (종료하려면 -1을 입력):");
		score = scan.nextInt();
		
		while (score != -1) {
		
			   totalCount++;
			if (score>=90 ) Acount++;		    
			else if (score>=80) Bcount++;		  
			else if (score>=70) Ccount++;	 
			else if (score>=60) Dcount++;	    
		    else if (score <60) Fcount++;
			System.out.print("점수를 입력하세요 (종료하려면 -1을 입력):");
			score = scan.nextInt();
     	}
		System.out.println("점수들의 총 수"+ totalCount);
		System.out.println("A 학점 수 = "+ Acount);
		System.out.println("B 학점 수 = "+ Bcount);
		System.out.println("C 학점 수 = "+ Ccount);
		System.out.println("D 학점 수 = "+ Dcount);
		System.out.println("F 학점 수 = "+ Fcount);
	}

}
