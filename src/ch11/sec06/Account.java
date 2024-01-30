package ch11.sec06;

public class Account {
	
	//필드
	private long balance;
	
	
	// 생성자
	public Account() { }                        // 은행계좌
	
	//메서드
	public long getBalance() {                  // 입금액 확인
		return balance;
	}
	
	public void deposit(int money) {            // 예금 
		balance += money;
	}
	
											// InsufficientException 발생하면 호출한 곳으로 예외 떠넘기기
	public void withdraw(int money) throws InsufficientException {  //출금
		if (balance < money) {
			throw new InsufficientException("잔고 부족 : "+ (money-balance)+"모자람"); // 예외 발생시키기
		}
		balance -= money;
	}
}
