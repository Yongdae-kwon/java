package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample  {

	public static void main(String[] args) throws Exception {
		
		String data = "자바";
		
		//String --> byte [] -- > String
		//data  --> arr1  ---> str1
		byte[] arr1 = data.getBytes() ; // 인코딩 설정이 없으면 기본 UTF-8로 인코딩 설정됨
		System.out.println("arr1 :" + Arrays.toString(arr1));
		
		// UTF가 3바이트 이므로 -20 , -98 , -112 : 자 , -21 , - 80 , -108 은 바
		
		String str1 = new String(arr1);
		System.out.println("str1 : "+ str1);
		
		
		// 인코딩 설정을 EUC-KR로 이건 2byte
		byte[] arr2 = data.getBytes("EUC-KR") ; // 
		System.out.println("arr2 :" + Arrays.toString(arr2));

		String str2 = new String(arr2,"EUC-KR");
		System.out.println("str2 : "+ str2);
	}
}
