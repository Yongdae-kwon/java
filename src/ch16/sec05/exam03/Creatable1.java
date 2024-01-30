package ch16.sec05.exam03;

@FunctionalInterface
public interface Creatable1 {
	
	// 추상 생성자 (매개 변수 하나)
	public Member create(String id);
}
