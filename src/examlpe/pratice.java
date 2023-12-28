package examlpe;
import java.util.Scanner;
public class pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int preLabScore;
		int labScore;  
		int postLabScore;
		double finalLabScore;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("실습 전 과제 점수:");
		preLabScore = input.nextInt();
		
		System.out.print("실습 과제 점수:");
		labScore = input.nextInt();
		
		System.out.print("실습 후 과제 점수:");
		postLabScore = input.nextInt();
		
		finalLabScore = ((preLabScore/20f + postLabScore/30f)*20 + labScore/25f*60);
		System.out.println("최종 실습 점수" + finalLabScore);

	}

}
