package com.utilex;

class Person {
	
	long id;
	
	public boolean eauals(Object obj) {
		
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
			            // obj��  Person  Type���� ����ȯ
		}else { 
			return false;
		}
	}
	
	public Person(long id) {
		this.id = id;
	}
}




public class EqualsEx2 {

	public static void main(String[] args) {
		
		Person p1  = new Person(8011081111222L);
		Person p2   = new Person(8011081111222L);
		// ��ü�� ������ �ּҰ��� �ǹ��ϴ°�
		
		
		if(p1 == p2) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		
		System.out.println("=================");
		if(p1.eauals(p2)) {// ��ü�� ����Ű�� �ּҰ��� ����
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		

	}

}
