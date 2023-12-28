package examlpe;
import java.util.Scanner;
public class exam18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id,password;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("아이디를 입력해주세요:");
		id = input.nextLine();
		
		if(id.equals("java")) {
		     System.out.println("id 일치");
		     System.out.printf("비밀번호를 입력해주세요:");
		     password = input.nextLine();
		     
		     if(password.equals("abc123")) {
		    	 System.out.println("password 일치");
		    	 System.out.println("로그인 성공!");
		     }
		     else
		    	 System.out.println("password 불일치");
		}
		else
			System.out.println("id 불일치");

	}

}
