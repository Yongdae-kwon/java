package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		// Stack 컬렉션 생성  : Coin 객체 형태로 저장
		Stack <Coin> coinBox = new Stack<Coin>();
		
		// 동전넣기
		coinBox.push(new Coin(1000));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		
		
		//동전을 하나씩 꺼내기
		while (!coinBox.isEmpty()) {	// coinBox가 비어 있지 않다면 계속 실행
			//isEmpty - 비어있냐 , true 면 빈 상태인데 ! 로 반대
			
			Coin coin = coinBox.pop(); // 마지막에 들어간 것부터 나옴
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");			
		}
	}
}

