package com.utilex;

/*  String Ŭ����
 *   - ���ڿ��� �ǹ��ϴ� Ŭ����
 *   - ���� ���� ���̴� Ŭ������ �ϳ��̴�.
 *   - ��ü �ڷ��������� �⺻ �ڷ���ó�� ���δ�.
 *   
 */


public class StringEx1 {

	public static void main(String[] args) {
	
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		
		if(s1 == s2) {
			System.out.println("s1 �� s2�� ����.");
		}else {
			System.out.println("s1 �� s2�� ���� �ʴ�.");
		}
		
		
		String s3 = new String("��");
		String s4 = new String("��");
		if(s3 == s4) {
			System.out.println("s3 �� s4�� ����.");
		}else {
			System.out.println("s3 �� s4�� ���� �ʴ�.");
		}
		
		
		

	}

}
