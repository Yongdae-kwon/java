package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
			
		}catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage()); 			
		}
		System.out.println();
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			//NumberFormatException 발생
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
			
		}
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try(res1;res2) {
			String data1 = res1.read1();
			String data2 = res2.read2(); // B가 젤 마지막 실행(메모리 상주) : 먼저 해제
		}catch(Exception e) {			 // B가 해제된 이후 안 닫힌것 찾아서 (A) A를 닫기
			System.out.println("예외 처리 : " + e.getMessage());
		}
	}
}
