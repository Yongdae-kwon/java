package examlpe;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double average;
		int comgrade = 88;
		int proggrade = 92;
		int mathgrade = 79;
		int archgrade = 80;
		
		average = (float)(comgrade+proggrade+mathgrade+archgrade)/4;
			
		System.out.println("영작문 과목의 점수 :" + comgrade );
		System.out.println("프로그래밍 과목의 점수 :" + proggrade );
		System.out.println("이산 수학 과목의 점수 :" + mathgrade );
		System.out.println("컴퓨터 구조 과목의 점수 :" + archgrade );
		System.out.println("평균 점수 :" + average );
		
	}

}
