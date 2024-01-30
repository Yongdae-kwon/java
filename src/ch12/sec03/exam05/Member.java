package ch12.sec03.exam05;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


// 생성자 ,setter, getter toString , hashCode , equals 
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Member {
	
	private String id;
	private String name;
	private int age;

}
