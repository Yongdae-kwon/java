package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
	
	//필드
	public String name;
	public int age;
	
	//생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//나이 기준으로 정렬
	
	@Override
	public int compareTo(Person o) {
		if(age < o.age) return 1;
		else if (age == o.age) return 0;
		else return -1;
	}
}
