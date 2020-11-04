package com.utilex;

import java.util.StringJoiner;

// Join() 은 여러 문자열 사이에 구분자를 넣어서 결합
// 구분자로 문자열을 자르는 split()메소드와은 반대되는 메소드 임

public class StringEx4 {

	public static void main(String[] args) {
		
		String animals ="dog,cat,bear";
		String[] arr = animals.split(",");
		System.out.println(String.join("-", arr));
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s : arr) 
			sj.add(s);
		
		System.out.println(sj.toString());
		

	}

}
