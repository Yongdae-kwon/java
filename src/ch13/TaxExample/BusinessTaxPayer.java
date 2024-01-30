package ch13.TaxExample;

//실습과제 11.1: BusinessTaxPayer.java
//사업소득자를 모델한다

public class BusinessTaxPayer extends TaxPayer {
	private int sales;		// 총매출액
	private int expenses; 	// 총비용

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 주어진 값으로 초기화한다
	// 여기에 코드를 입력하세요
	public BusinessTaxPayer(String name, int number, int sales, int expenses) {
		super(name,number);
		this.sales = sales;
		this.expenses = expenses;
	}

	// 사업소득자의 총매출액을 반환한다
	// 여기에 코드를 입력하세요
	public int getSales(){ return sales;}	
	// 사업소득자의 총매출액을 주어진 값으로 변경한다
	// 여기에 코드를 입력하세요
	private void setSales(int sales) { this.sales = sales; }


	// 사업소득자의 총비용을 반환한다
    // 여기에 메소드를 입력하세요
	public int getExpenses() {return expenses;}
	// 사업소득자의 총비용을 주어진 값으로 변경한다
    // 여기에 메소드를 입력하세요
	public void setExpenses(int expenses) {this.expenses = expenses;} 

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 반환한다
    // 여기에 메소드를 입력하세요
	
	public String toString () {
		return super.toString() + " , 총매출액 : " + sales + " , 총비용 : " + expenses;
	}

	// 사업소득자의 세금을 계산한다
    // 여기에 메소드를 입력하세요	
	public double computeTax () {
		if (sales - expenses > 40000000) return (sales - expenses)*0.2 ;
		else if (sales - expenses > 0) return (sales - expenses)* 0.1;
		else return 0;
	}
}