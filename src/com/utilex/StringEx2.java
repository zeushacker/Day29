package com.utilex;

// String 객체의 불변성
// 1. String 객체는 편집이 불가능하다.



public class StringEx2 {

	public static void main(String[] args) {
		
		
		String str = new String();
		str +="Hello";
		str +=" Java";
		// str은 하나의 객체로 보이지만 실제로 5개의 String 객체가 생성
		System.out.println("str 의 값은 :"+str);
		

	}

}
