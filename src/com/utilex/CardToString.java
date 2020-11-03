package com.utilex;

class Card {
	
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
    	return "나 카드야>>";
    }
}

//toString() : 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의한 것임
public class CardToString {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
