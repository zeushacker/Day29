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
		// ��ü�� �ּҰ����� �ؽ��ڵ带 �����ϱ� ������ ��� ��ü�� ���� 
		// �׻� �ٸ� �ؽ��ڵ� ���� ��ȯ�� �� �� ������
		// �׷��� str1�� str2 �� �ؽ� �ڵ�� ������ ���� �ٸ� ��ü��� ���� 
		// �˼� ����

	}

}
