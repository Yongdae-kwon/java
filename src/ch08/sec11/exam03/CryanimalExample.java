package ch08.sec11.exam03;

public class CryanimalExample {

	public static void main(String[] args) {
		
		Cryanimal cryanimal = new Cryanimal();
		
		Chicken chicken = new Chicken();
		Duck duck = new Duck();
		Cow cow = new Cow ();
		
		cryanimal.cryanimal(chicken);
		cryanimal.cryanimal(duck);
		cryanimal.cryanimal(cow);
	}
}
