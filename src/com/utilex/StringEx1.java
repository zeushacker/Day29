package com.utilex;

/*  String 클래스
 *   - 문자열을 의미하는 클래스
 *   - 가장 많이 쓰이는 클래스중 하나이다.
 *   - 객체 자료형이지만 기본 자료형처럼 쓰인다.
 *   
 */


public class StringEx1 {

	public static void main(String[] args) {
	
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		
		if(s1 == s2) {
			System.out.println("s1 과 s2는 같다.");
		}else {
			System.out.println("s1 과 s2는 같지 않다.");
		}
		
		
		String s3 = new String("셋");
		String s4 = new String("넷");
		if(s3 == s4) {
			System.out.println("s3 과 s4는 같다.");
		}else {
			System.out.println("s3 과 s4는 같지 않다.");
		}
		
		
		

	}

}
