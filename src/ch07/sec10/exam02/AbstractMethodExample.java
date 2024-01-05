package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		
		//Animal animal = new animal(); // 추상클래스라 생성 불가
		
		Dog dog = new Dog();  // Dog 객체 생성
		dog.sound();
		
		Cat cat = new Cat();  // Cat 객체 생성
		cat.sound();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	//AnimalSound 메서드 생성 (매개변수 : Animal 객체 대입)
	public static void animalSound(Animal animal) {
		animal.sound();		
	}
}
