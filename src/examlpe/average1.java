package examlpe;
import java.util.Scanner;
public class average1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double average;
		double comgrade;
		double proggrade;  
		double mathgrade;
		double archgrade;
		
		Scanner input = new Scanner(System.in);

		System.out.print("영작문 과목의 점수:");
		comgrade = input.nextDouble();
		
		System.out.print("프로그래밍 과목의 점수:");
		proggrade = input.nextDouble();
		
		System.out.print("이산 수학 과목의 점수:");
		mathgrade = input.nextDouble();
		
		System.out.print("컴퓨터 구조 과목의 점수:");
		archgrade = input.nextDouble();
	
		
		average = (comgrade+proggrade+mathgrade+archgrade)/4;
		System.out.println("평균 점수" + average);
	}

}
