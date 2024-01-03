package problem;
import java.util.Scanner;
public class Gwhile_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int jumsu;
		int count = 0;
		int max = -1;
		int min = 101;
		int sum = 0;
		double aver;
		
		System.out.print("점수를 입력하세요.:");
		jumsu = scan.nextInt();

		while (jumsu != -99) {	    	
	    	count++;
	    	sum += jumsu;  	    	
	    	
	    	max = (max<jumsu)? jumsu : max;	 
	    	min = (jumsu<min)? jumsu : min;
	    	
	    	System.out.print("점수를 입력하세요.:");
	    	jumsu = scan.nextInt();	
	    }
	    aver = (double)sum/count;
	    System.out.println("최고 점수="+max);
	    System.out.println("최저 점수="+min);
	    System.out.println("평균 점수="+aver);
	}
}
//1. 점수를 입력받는다.
//2. -99를 입력받으면 while문 종료된다.
/*3. while문 동작
 count 증가
 합계 누적
 최대값 구하기 (max jumsu)
 최소값 구하기 (min jumsu)
 4. 점수를 다시 입력받는다.
 5. 최고 점수 , 최저 점수 , 평균 점수 출력한다. 평균 점수 = sum/count
*/