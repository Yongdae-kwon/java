package ch16.sec01;

//함수형 인터페이스 : 람다식 으로 표현이 가능하다
@FunctionalInterface // 컴파일 과정에서 추상 메서드가 하나인지 확인
public interface Calculable {
	
	//추상메서드
	void calculate (int x, int y);
}
