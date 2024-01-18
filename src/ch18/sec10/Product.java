package ch18.sec10;

import java.io.Serializable;

public class Product implements Serializable {
	
	// 필드
	private static final long serialVersionUID = -621812868470078544L;
	private String name;
	private int price;
	
	// 생성자
	public Product (String name , int price) {
		this.name = name;
		this.price = price;
	}

	// 메서드
	@Override
	public String toString ( ) { return name + " : " + price; } 
}
