package ch18.sec10;

import java.io.Serializable;
// 직렬화에 대한 Serializabale 구현 해야만 된다.
public class Member implements Serializable {
	
	// 직렬화에 대한  UID 코드  : 역직렬화 할 때 UID 사용
	private static final long serialVersionUID = -622284561026719240L;
	
	// 필드
	private String id;
	private String name;
	
	
	// 생성자
	public Member (String id , String name) {
		this.name = name;
		this.id = id ;
	}
	
	// 매서드
	@Override
	public String toString () { return id + " : " + name; }
}
