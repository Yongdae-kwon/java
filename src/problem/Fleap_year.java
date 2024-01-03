package problem;
import java.util.Scanner;
public class Fleap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int leapyear;
		leap;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("연도를 입력하세요:");
		leapyear = scan.nextInt();
		
		if (leapyear %4 == 0 || leapyear % 400 == 0) {
			if (leapyear %100 != 0) {
				System.out.print(leapyear+"년은 윤년입니다.");
			}
			else {
				System.out.print(leapyear+"년은 윤년이 아닙니다.");
			}
		

	}

}

// 4로 나누어지면 윤년이다

// 100으로 나누어지지 않으면 윤년이다 나누어지면 윤년이아닌다

// 4 , 100 ,400 나누어지면 이것도 윤년이다.

// 400 나누면 윤년이다 아니면 윤년이아니다