package com.utilex;


//toString() : 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 것임
public class CardToString {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
