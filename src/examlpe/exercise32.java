package examlpe;

public class exercise32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples/sizeOfBucket+1;
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
		int num = 10;
		
		System.out.println(num>0?"양수":(num<0?"음수":0));

	}

}
