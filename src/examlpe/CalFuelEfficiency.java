package examlpe;
import java.util.Scanner;
public class CalFuelEfficiency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연비 관련 변수
		double driveDistance; // 주행거리
		double fuels;         // 사용한 휘발유 양
		double fuelEfficiency; // 연비
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("주행거리를 입력하세요:");
		driveDistance = input.nextDouble();
		
		System.out.print("사용한 휘발유 입력하세요:");
		fuels = input.nextDouble();
		
		fuelEfficiency = driveDistance/fuels;
		System.out.println("연비:" + fuelEfficiency);
	}

}
