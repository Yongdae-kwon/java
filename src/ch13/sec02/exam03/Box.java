package ch13.sec02.exam03;

public class Box<T> {
	public T content;
	
	//메서드 : 내용물 비교	 Box 안의 content 타입이 같은지 확인
	public boolean compare(Box<T> other) {
		//제너릭은 object 타입이라 object의 메서드 equals를 사용할 수 있다. 
		boolean result = content.equals(other.content);
		return result;	
	}
}
