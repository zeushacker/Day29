package com.utilex;

final class Card {
	
    String kind;
  int number;

   public Card() {
       this("SPADE", 1);
   }
	
    public Card(String kind, int number) {
	  this.kind = kind;
	  this.number= number;
	}
    
    @Override
    public String toString() {
    	return "kind :"+kind+", number :"+number;
    }
    
}


public class ClassEx1 {

	public static void main(String[] args) throws Exception{
		Card c = new Card("HEART", 3);
		// new 연산자로 객체 생성
	
		Card c2 = Card.class.newInstance();
		// Class 객체를 통해서 객체 생성
		// newInstance()는 InstantliationException
		
		// getClass() : 자신이 속한 클래스의 Class 객체를 반환하는 메소드
		/* Class cObj = c.getClass(); */
	    Class cObj = Card.class;
	    System.out.println(c);
	    System.out.println(c2);
	    System.out.println(cObj.getName());

	}

}
