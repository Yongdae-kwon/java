package ch06.sec07;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car1 = new Car ();
		
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		Car car2 = new Car ("자가용"); 
		// Car class 설정에서 String 하나로 설정되어있는게 model 뿐
		/* Car (String model) {
			this.model = model;
		}*/
		
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println("car2.color : "+car2.color);
		System.out.println("car2.maxSpeed : "+car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car ("자가용","빨강");
		// 아래와 같은 매개 변수 2개있는걸 가져온다
		
		/*Car (String model,String color) {
			this.model = model;
			this.color = color;
		}*/	
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println("car3.maxSpeed : "+car3.maxSpeed);
		System.out.println();
		
		Car car4 = new Car ("택시","검정",200);
		//매개변수가 String String int 형태
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
		System.out.println();

	
	}
}
