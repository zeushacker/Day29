package com.utilex;

public class CloneEx1 {

	public static void main(String[] args) {
		Point original = new Point(3, 5);
		// �����ؼ� ���ο� ��ü�� ����
		Point copy = (Point)original.clone();
		
		System.out.println(original);
		System.out.println(copy);
		

	}

}
