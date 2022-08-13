package day4Assignment1;

public class CardsMain {
	public static void main(String[] args) {

		
		Hand h = new Hand();
		if (!(h.addCard(new Card(Card.SIX, Card.HEARTS))))	System.out.println("Something went wrong");	;
		h.addCard(new Card(Card.FIVE, Card.SPADES));
		h.addCard(new Card(Card.SIX, Card.DIAMONDS));
		h.addCard(new Card(Card.THREE, Card.SPADES));
		h.addCard(new Card(Card.ACE, Card.CLUBS));
		h.addCard(new Card(Card.KING, Card.DIAMONDS));
		h.addCard(new Card(Card.SIX, Card.DIAMONDS));
		
		h.discardCard(new Card(Card.ACE, Card.DIAMONDS));
		h.discardCard(new Card(Card.KING, Card.DIAMONDS));
		h.sort();
		System.out.println(h);
	}

}
