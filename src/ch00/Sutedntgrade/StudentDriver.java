package ch00.Sutedntgrade;

//실습과제 8.1: StudentDriver.java
//Student 클래스를 시험한다

public class StudentDriver {

	public static void main(String[] args) {
		
		// 두 학생의 성적 기록을 나타내는 객체들을 만든다
		Student stud1 = new Student("선남");
		Student stud2 = new Student("선녀");
		
		stud1.inputGrades();
		double total1 = stud1.getTotal();
		char grade1 = stud1.getGrade();
		System.out.println(stud1.getName() + "의 총점은 " + total1 + "이고 학점은 " + grade1 + "이다.");
		
		stud2.inputGrades();
		double total2 = stud2.getTotal();
		char grade2 = stud2.getGrade();
		System.out.println(stud2.getName() + "의 총점은 " + total2 + "이고 학점은 " + grade2 + "이다.");
		
		// 여기에 코드를 삽입하세요
		// 첫 번째 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다
		// 여기에 코드를 삽입하세요

		// 첫 번째 학생의 총점을 계산한다
		// 여기에 코드를 삽입하세요

		// 첫 번째 학생의 학점을 부여한다
		// 여기에 코드를 삽입하세요

		// 첫 번째 학생의 이름, 총점과 학점을 출력한다
		//System.out.println(stud1.getName() + "의 총점은 " + total1 + "이고 학점은 " + grade1 + "이다.");

				// 두 번째 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다
		  			// 여기에 코드를 삽입하세요

				// 두 번째 학생의 총점을 계산한다
		  			// 여기에 코드를 삽입하세요

				// 두 번째 학생의 학점을 부여한다
		  			// 여기에 코드를 삽입하세요

				// 두 번째 학생의 이름, 총점과 학점을 출력한다
		  			// 여기에 코드를 삽입하세요
	}

}
