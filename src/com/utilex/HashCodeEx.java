package com.utilex;

public class HashCodeEx {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// identityHashCode()
		// 객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 대해 
		// 항상 다른 해시코드 값을 반환할 것 을 보장함
		// 그래서 str1과 str2 가 해시 코드는 같지만 서로 다른 객체라는 것을 
		// 알수 있음

	}

}
