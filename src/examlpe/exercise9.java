package examlpe;

public class exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'z';
		boolean b = ('A' <= ch  && ch <='z')||(0 < ch && ch < 10);
	    System.out.println(b);
	    
		char ch1 = 'A';
		char lowerCase = ('A'<= ch1 && ch1<='Z')? (char)(ch1+32) : ch1;
		
		System.out.println("ch:"+ch1);
		System.out.println("ch to lowerCase:" +lowerCase);
		

	}
}
