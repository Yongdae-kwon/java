package examlpe;
import java.util.Scanner;
public class coincalulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int itemPrice;
	
		Scanner input = new Scanner(System.in);
		System.out.print("물건의 가격 (1,000원 이하)를 입력하세요:");
		itemPrice = input.nextInt();
		
		int change = 1000-itemPrice;
		System.out.println(itemPrice+"원 짜리 물건을 샀고,1000원을 내셨습니다.");
		System.out.println("거스름 돈은"+change+"원입니다.") ;
		System.out.println("거스름 돈의 내역은 다음과 같습니다.") ;
		
		int coin500 = (change/500);
		System.out.println("500원 짜리 동전의 갯수 :" +coin500) ;
		System.out.println("500원 거스려주고 남은 돈 : " +(change-coin500*500)) ;
		
		int coin100 = (change%500/100);
		System.out.println("100원 짜리 동전의 갯수:" +coin100) ;
		System.out.println("100원 거스려주고 남은 돈 : " +(change-coin500*500-coin100*100)) ;
		
		int coin50 = (change%500%100/50);
		System.out.println("50원 짜리 동전의 갯수:"+coin50) ;
		System.out.println("50원 거스려주고 남은 돈 : " +(change-coin500*500-coin100*100-coin50*50)) ;
		
		int coin10 = (change%500%100%50/10);
		System.out.println("10원 짜리 동전의 갯수:"+coin10) ;
		System.out.println("10원 거스려주고 남은 돈 : " +(change-coin500*500-coin100*100-coin50*50-coin10*10)) ;
		
		int coin5 = (change%500%100%50%10/5);
		System.out.println("5원 짜리 동전의 갯수:"+coin5) ;
		System.out.println("5원 거스려주고 남은 돈 : " +(change-coin500*500-coin100*100-coin50*50-coin10*10-coin5*5)) ;
		
		int coin1 = (change%500%100%50%10%5);
		System.out.println("1원 짜리 동전의 갯수:"+coin1) ;
		System.out.println("1원 거스려주고 남은 돈 : " +(change-coin500*500-coin100*100-coin50*50-coin10*10-coin5*5-coin1*1)) ;
	}
}
