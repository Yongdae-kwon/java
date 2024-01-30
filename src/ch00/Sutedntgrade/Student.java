package ch00.Sutedntgrade;

//실습과제 8.1: Student.java
//학생의 성적 기록을 나타낸다

import java.util.Scanner;

public class Student {
	
	//객체 변수들
	String name;			//이름
	int quizscore; 			// 퀴즈 점수
	int midtermscore;		// 중간시험 점수
	int finalscore;			// 기말시험 점수
	
	//생성자 메서드
	public Student(String studentName) {
		name = studentName;		
	}
	
	 //학생의 이름을 반환한다.
	 public String getName( ) {	return name; }
	 // 학생의 퀴즈 점수를 반환한다
	 public int getQuizScore( ) { return quizscore; } // 여기에 코드를 삽입하세요 
	 // 학생의 중간시험 점수를 반환한다
	 public int getMidtermScore( ) {return midtermscore; } // 여기에 코드를 삽입하세요
	 // 학생의 기말시험 점수를 반환한다
	 public int getFinalScore( )  { return finalscore;} // 여기에 코드를 삽입하세요
	  			
	
	 //현 Student 객체의 정보에 대한 문자열을 반환한다.
	 public String toString () {
			String str = "";
			str += "이름: " + name + "\n";
			str += "퀴즈점수 : " + quizscore + "\n";
			str += "중간시험 점수 : " + midtermscore + "\n";
			str += "기말시험 점수 : " + finalscore + "\n";
			return str; 			
	 	} // 여기에 코드를 삽입하세요

	 // 이름을 주어진 값으로 변경한다
	 public void setName(String Name){ name = Name; }

	 // 퀴즈 점수를 주어진 값으로 변경한다
	 public void setQuizScore(int QuizScore) { quizscore = QuizScore;}// 여기에 코드를 삽입하세요

	 // 중간시험 점수를 주어진 값으로 변경한다
	 public void setMidtermScore(int MidtermScore) { midtermscore = MidtermScore; } // 여기에 코드를 삽입하세요
		
	 // 기말시험 점수를 주어진 값으로 변경한다
	 public void setFinalScore(int FinalScore){	finalscore = FinalScore; } // 여기에 코드를 삽입하세요
	  			
	 // 사용자에게 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다.
	 // 입력 요청시 이름을 사용한다. 예를 들면, ‘길동의 중간시험 점수를 입력하라.’
	 public void inputGrades( ) {
		 Scanner scan = new Scanner (System.in);
		 name = scan.next();
		 
		 
		 System.out.print(name +"퀴즈 시험 점수를 입력하라 : \t\t");    
		 quizscore = scan.nextInt();
		 /*if (quizscore<0 && quizscore >100) {
			 System.out.println("퀴즈시험 점수가 0보다 작거나 100보다 크다");
		 }else { System.out.println("퀴즈시험 점수를 다시 입력하라");}
		 */
		 System.out.print(name +"중간 시험 점수를 입력하라 :\t\t");    
		 midtermscore = scan.nextInt();
		 
		 System.out.print(name +"퀴즈 시험 점수를 입력하라 : \t\t");    
		 finalscore = scan.nextInt();
	    
	 }// 여기에 코드를 삽입하세요
	 
	 /*if(player1.getTotal() > player2.getTotal()) {
			System.out.println(player1.getName()+"이 이겼다.");
		}else if (player1.getTotal() < player2.getTotal()) {
			System.out.println(player2.getName()+"이 이겼다.");
		}else {
			System.out.println("비겼습니다.");
		}
		
		// 게임 진행 대한 여부
		System.out.print("\n 게임을 계속 하시겠습니까? (예 혹은 아니오)");
		flag = scan.next();	
	 */
	 
	 
	 
	 
	 
	 
	 
	 public double total;
	 
	 // 학생의 시험 점수들의 총점을 계산하여 반환한다
	 public double getTotal( ) { 
		 return total = quizscore*0.2 +  midtermscore * 0.3 + finalscore* 0.5;
	 } // 여기에 코드를 삽입하세요
	 
	 
	
	 public char getGrade() {
		 char grade_a;
		 double total = getTotal();
			if (total >=90) grade_a = 'A';	 	 
			else if (total >= 80)grade_a = 'B'; 		
			else if (total >= 70) grade_a = 'C';			
			else if (total >= 60) grade_a = 'D'; 		   
			else grade_a = 'F';
		return grade_a;
	}

	
	 // 학생의 학점을 반환한다
	 // 여기에 메소드드를 삽입하세요
	
}
