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
		// new �����ڷ� ��ü ����
	
		Card c2 = Card.class.newInstance();
		// Class ��ü�� ���ؼ� ��ü ����
		// newInstance()�� InstantliationException
		
		// getClass() : �ڽ��� ���� Ŭ������ Class ��ü�� ��ȯ�ϴ� �޼ҵ�
		/* Class cObj = c.getClass(); */
	    Class cObj = Card.class;
	    System.out.println(c);
	    System.out.println(c2);
	    System.out.println(cObj.getName());

	}

}
