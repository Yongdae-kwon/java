package problem;
import java.util.Scanner;
public class Emultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean multiple = false;
		int num;
		Scanner scan = new Scanner (System.in);		
		
		System.out.print("양의 정수를 입력하시오:");
		num = scan.nextInt();
		
		if ( num %3 == 0) {
			System.out.print ("3의 배수이다.");
			multiple = true;
		}		
		if ( num %5 == 0) {
			System.out.print ("5의 배수이다.");
			multiple = true;
		}	
		
		if ( num %8 == 0) {
			System.out.print ("8의 배수이다.");
			multiple = true;
		}
		if (multiple = false){
			System.out.print ("어느 배수도 아니다.");
		}
		 
		
		
		/* if ( num %3 == 0) {
			System.out.print ("3의 배수이다.");
		}else if ( num %5 == 0) {
			System.out.print ("5의 배수이다.");
		}else if ( num %8 == 0) {
			System.out.print ("8의 배수이다.");
		}else{
		    System.out.print("어느 배수도 아니다.");
		}*/
	}
}
