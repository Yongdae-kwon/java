package ch06.exam01.package1;

public class B {
	
	A a1 = new A(true);   // boolean 타입 	- public  이라서 접근 가능
	A a2 = new A(1);      // int 타입     	- default 같은 패키지내라서 접근 가능
	//A a3 = new A("문자열"); // string 타입  	- private 같은 파일내가 아니라서 접근이 불가능
}
