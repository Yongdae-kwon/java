package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray = null; // 배열은 객체 생성( new : 번지할당) 하여 사용
		// intArray[0] = 10; // 배열의 크기 선언이 안된 상태에서 사용할려니 에러가 발생 
		//NullPonterException
		
		String str = null;    // 참조 변수 : 번지를 활용, 번지가 할당이 안된 상태
		//System.out.println("총 문자 수:" + str.length() ); //NullPointerException
	}
}
