package problem;
import java.util.Scanner;
public class Ddiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gume;
		int chunggu;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("구매 금액 :");   
		gume= scan.nextInt();
		
		if (gume >=300000) {
			chunggu = gume - 30000;
		} else if (gume >= 100000){
			chunggu = gume - 5000;
		} else {
			chunggu = gume;
		}
		
		System.out.println("청구 금액 :"+ chunggu ); 
	}
}
