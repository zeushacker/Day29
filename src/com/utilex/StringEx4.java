package com.utilex;

import java.util.StringJoiner;

// Join() �� ���� ���ڿ� ���̿� �����ڸ� �־ ����
// �����ڷ� ���ڿ��� �ڸ��� split()�޼ҵ���� �ݴ�Ǵ� �޼ҵ� ��

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
