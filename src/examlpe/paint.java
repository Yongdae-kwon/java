package examlpe;
import java.util.Scanner;
public class paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		final double COVERAGE = 500; 
		
		// 1. 사무실의 가로 길이를 입력받는다.
		int length;
		System.out.print("사무실의 가로 길이를 입력하세요 :");
		length= input.nextInt();
		
		// 2. 사무실의 세로 길이를 입력받는다.
		int width;
		System.out.print("사무실의 세로 길이를 입력하세요 :");
		width = input.nextInt();
		
		
		// 3 . 사무실의 높이를 입력받는다.
		int height;
		System.out.print("사무실의 높이를 입력하세요 :");
		height = input.nextInt();
		
		// 4. 페인트 칠할 총 면적을 구한다.
		double totalSqMeter;
		totalSqMeter=((length+width)*height*2.0)+(length*width);
		System.out.println("페인트 칠할 총 면적:"+totalSqMeter);
		
		// 5. 필요한 페인트의 양을 계산하시오.
		double paintNeed;
		paintNeed = (int)(totalSqMeter/COVERAGE)+ 1;
		System.out.print("필요한 페인트 양:"+paintNeed);

	}

}
