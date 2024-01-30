package ch00.exam1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String flag = "예";
		PairOfDice dice = new PairOfDice();
		Player player1 , player2;
		
		player1 = new Player("홍길동");
		player2 = new Player("이순신");
		
		
		do {
		System.out.println(player1.getName());
		player1.roll(dice); //player1 이 주사위를 던진다
		
		System.out.println(player2.getName());
		player2.roll(dice); //player2 이 주사위를 던진다
		
		//쌍에 대한 합을 저장 하는건 Player 에서 완성되어있음
		
		if(player1.getTotal() > player2.getTotal()) {
			System.out.println(player1.getName()+"이 이겼다.");
		}else if (player1.getTotal() < player2.getTotal()) {
			System.out.println(player2.getName()+"이 이겼다.");
		}else {
			System.out.println("비겼습니다.");
		}
		
		// 게임 진행 대한 여부
		System.out.print("\n 게임을 계속 하시겠습니까? (예 혹은 아니오)");
		flag = scan.next();
		
		}while (flag.equals("예"));

	}
}
