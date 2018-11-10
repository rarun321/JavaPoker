import java.io.IOException;

public class Table {
	Deck deck;
	Player player;
	Bot botOne;
	Bot botTwo;
	Bot botThree;
	int startingCHips = 1500;


	public Table() throws IOException {
		Deck deck = new Deck();
		Player player = new Player(startingCHips, "Tom");
		Bot botOne = new Bot(startingCHips, "Droid");
		Bot botTwo = new Bot(startingCHips, "C3PO");;
		Bot botThree = new Bot(startingCHips, "R2D2");;
	}

	public void dealHands(){
		player.setHand(deck.getCard(), deck.getCard());
		botOne.setHand(deck.getCard(), deck.getCard());
		botTwo.setHand(deck.getCard(), deck.getCard());
		botOne.setHand(deck.getCard(), deck.getCard());
	}
	public void shuffle(){
		deck.shuffle();
	}
}
