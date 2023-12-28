package examlpe;
import java.util.Scanner;
public class round_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI = 3.14159;   // 상수
		double radius;               // 반지름
		double area;                 // 면적

		//1. 원의 반지름을 입력받는다.
		Scanner input = new Scanner(System.in); // Scanner 객체 생성
		
		System.out.print("원의 반지름을 입력하세요");
		radius = input.nextDouble();            // 입력받은 값을 radius에 저장
		
		//2. 원의 면적을 계산한다.		
		area = radius * radius * PI;            
		
		//3. 반지름과 면적을 출력한다.
		System.out.println("원의 반지름은" + radius +"이다."); // 반지름 출력
		System.out.println("원의 면적은" + area + "이다.");   // 면적 출력
		
		
	
	}

}
