package ch00.RollBook;
//실습과제 9.1: ClassRoll.java
//출석부를 Student 객체들의 배열로 나타낸다.

	public class ClassRoll {
		public static final int NOT_FOUND = -1;
		public String coursename; 	// 교과목명
		public int count;      		// 출석부에 있는 학생들의 수
		public int size;			// 출석부의 크기
		Student[] sbook; 			// Student 객체들의 배열

		//  크기가 10인 빈 출석부 객체를 생성한다.
		public ClassRoll() {
			size = 10;
			count = 0;
			sbook = new Student[size];
    		
		}// 여기에 코드를 입력하세요

		//  한 Student 객체를 출석부에 추가한다.
		public void add(Student newStudent) {
			if (count >= size)
				System.out.println("출석부의 크기 부족으로 추가할 수 없습니다.");
			else {
				sbook[count] = newStudent;
				count++;
			}
		}

		// 주어진 Student 객체의 출석부내의 위치(index)를 알려 준다.
		private int findIndex(int searchNumber) {
			
			int index = 0; 
			
			while ( index < count && searchNumber != sbook[index].number) index++;
			if (index == count) index = NOT_FOUND;
			return index;
			
		}// 여기에 코드를 입력하세요

		// 주어진 학번을 가진 Student 객체를 출석부에서 찾아서 이름를 알려준다.
		public String search(int searchNumber) {
			
			int index;
			
			index = findIndex (searchNumber);
				
			if(index == NOT_FOUND)  System.out.print("주어진 학생이 출석부에 없습니다.");
			else (index ) System.out.print(index + "의 이름은" + sbook);
						
			// 여기에 코드를 입력하세요
		}
	}