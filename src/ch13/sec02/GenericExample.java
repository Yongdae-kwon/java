package ch13.sec02;

public class GenericExample {

	public static void main(String[] args) {
		
		//종류 : tv, 모델은 직접 기입하겠다   : 제네릭 매개변수 안에 객체를 담을 수 있다. 
		Product<Tv, String> product1 = new Product<>();
		
		
		product1.setKind(new Tv());		//객체 타입으로 담기
		product1.setModel("스마트Tv");
		
		Tv tv = product1.getKind();		//객체 타입 가져오기
		String tvModel = product1.getModel();
		
		//------------------------------------------------
		
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		Car car = product2.getKind();
		String model = product2.getModel();		
	}
}
