package ch17.sec04.exam01;

public class Product {

	// 필드 선언
	private int pno;		// 제품 번호
	private String name;	// 제품 이름
	private String company;	// 제품 회사 
	private int price;		// 제품 가격
	
	// 생성자
	public Product (int pno , String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;				
	}
	
	// 메서드
	public int getPno() { return pno;}
	public String getName() { return name; }
	public String getCompany() { return company; }
	public int getPrice() { return price; }
	
	@Override
	public String toString() {
		return new StringBuilder() 
				.append("{")
				.append("pno:" + pno + ", ")
				.append("name : " + name + ", ")
				.append("company : " + company + ", ")
				.append("price : " + price + ", ")
				.append("}")
				.toString();
	}
}
