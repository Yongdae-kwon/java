package ch06.sec08;

public class Calculator {
	
	 // 매개변수의 개수를 다르게하여 메소드 오버로딩
	 // 정사각형의 넓이
	 double areaRectangle(double width) {
		 return width * width;
	 }
	
	
	 // 직사각형의 넓이
	 double areaRectangle(double width,double height) {
		 return width * height;
	 }
	

	
}
