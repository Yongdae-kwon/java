package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		//Singleton obj1 = new Singleton(); // 생성자에 접근이 불가능(private)해서 컴파일 에러
		//Singleton obj2 = new Singleton(); // 컴파일 에러
		
		// 생성자로 생성이 되지않아 (접근권한때문) 메소드를 이용해서 생성
		// 메서드에서 객체를 값을 리터 받아서 생성이 가능하다.
		Singleton obj1= Singleton.getInstance(); 
		Singleton obj2= Singleton.getInstance();
		
		
		//obj1 , obj2 Singleton 안에 singleton 객체를 같은 값을 지니게 된다.
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}
