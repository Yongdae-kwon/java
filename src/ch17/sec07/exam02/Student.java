package ch17.sec07.exam02;

public class Student {
	
	// 필드
	private String name;
	private int score;
	
	// 생성자
	public Student (String name , int score) {
		this.name = name;
		this.score = score;
	}
	
	// 메서드
	public String getName() { return name; }
	public int getScore() {	return score; }
	
	// 재정의 하지않는다 Sorted () 메서드에 매개변수 값을 직접 지정해서 정렬이 되게 한다.
}
