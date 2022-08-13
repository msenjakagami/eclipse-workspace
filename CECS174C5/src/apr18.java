import java.util.Arrays;
class Card{
	int value;
	String suit;
	String name;
}

public class apr18{
	public static void main(String[] args) {
		Card[] deck = build_deck();
		//display_deck(deck);
		int Card1 = (int) (Math.random()*deck.length);
		//Card one = deck[Card1];
		System.out.println("The first card is : " + deck[Card1].name + " of " + deck[Card1].suit);
		int Card2 = (int) (Math.random()*deck.length);
		
		do {
			Card2 = (int) (Math.random()*deck.length);
		} while (Card2 == Card1);
		//Card two = deck(Card2);
		System.out.println("The second card is : " + deck[Card2].name + " of " + deck[Card2].suit);
		int hand = 0;
		hand = deck[Card1].value + deck[Card2].value;
		System.out.println("The value of the hand is " +  hand);
		}

	
public static Card[] build_deck(){
		String[] suits = {"clubs","diamonds","hearts","spades"};
		String[] names = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
		int i = 0;
		Card[] deck = new Card[52];
		for (String s : suits) {
			for (int j = 2; j <= 14; j++){
				Card c = new Card();
				c.suit = s;
				c.name = names[j];
				if (j == 14)
					c.value = 11;
				else if ((j > 10) && (j< 14))
					c.value = 10;
				else
					c.value = j;
				deck[i] = c;
				i++;
			}
		}
		return deck;
	}

	public static void display_deck(Card[] deck){
		for (Card c:deck){
			System.out.println(c.value + "\t" + c.name + " " + c.suit);
		}
		// for (int j = 0;j < deck.length;j++)
		// 	System.out.println(deck[j].value + "\t" + deck[j].name + " " + deck[j].suit);
	}
}
	