package com.utilex;

class Person {
	
	long id;
	
	public boolean eauals(Object obj) {
		
		if(obj != null && obj instanceof Person) {
			return id == ((Person)obj).id;
			            // obj가  Person  Type으로 형변환
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
		// 객체를 저장한 주소값을 의미하는것
		
		
		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		System.out.println("=================");
		if(p1.eauals(p2)) {// 객체가 가리키는 주소값을 참조
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		

	}

}
