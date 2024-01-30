package ch17.sec07.exam01;

public class Student implements Comparable<Student> {
	
	// 필드
	private String name;
	private int score;

	
	// 생성자
	public Student (String name,int score) {
		this.name = name;
		this.score = score;
	}

	// 메서드
	public String getName() { return name; }
	public int getScore() { return score; }
	
	// 객체 정렬 할려면 Comparable 재정의 필요		: 정렬기준이 score 
	@Override
	public int compareTo(Student o) {
		return Integer.compare (score, o.score); // score -기준 와 o.score - 대입 가 같을 경우 0을 리턴
												 // 작을 경우 음수 리턴, 클 경우 양수 리턴
	}
}
