package examlpe;
import java.util.Scanner;
public class exam17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		System.out.print("나이를 입력해주세요:");
		Scanner input = new Scanner(System.in);
		String tmp = input.nextLine();
		age = Integer.parseInt(tmp);
		
		if (age>19) {
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}
		else if (age>13) {
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		else if (age>8) {
			System.out.println("어린이입니다.");
			System.out.println("어린이 요금이 적용됩니다.");
		}
		else {
			System.out.println("유아입니다.");
			System.out.println("유아 요금이 적용됩니다.");	
		}
		System.out.println("결제를 진행해 주세요.");
		
	}

}