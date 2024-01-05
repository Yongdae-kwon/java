package ch07.sec07.exam01;

class A {  }
class B extends A { }
class C extends A { }
class D extends B { }
class E extends C { }

public class PromotionExample {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;     // 자식에서 부모로 변환은 가능 (상속)
		A a2 = c;
		A a3 = d;     // 손자에서 조부모 변화은 가능
		A a4 = e;
		
		B b1 = d;	  // 자식에서 부모로 변환은 가능 (상속)
		C c1 = e;
		
		//B b3 = e;     // 직접 부모가 아닌쪽으로 변환은 불가능
		//C c2 = d;     // 상속관계가 아니다.
		

	}

}
