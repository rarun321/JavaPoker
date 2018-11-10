package src.javapoker;
import javax.imageio.ImageIO;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
	int deckArray[] = new int[51];
	ArrayList<Cards> cardsArray = new ArrayList<Cards>();
	public Deck() throws IOException{
		Cards acespades = new Cards(11, ImageIO.read(new File("ASpades.png")));
		Cards spades2 = new Cards(2, ImageIO.read(new File("2Spades.png")));
		Cards spades3 = new Cards(3, ImageIO.read(new File("3Spades.png")));
		Cards spades4 = new Cards(4, ImageIO.read(new File("4Spades.png")));
		Cards spades5 = new Cards(5, ImageIO.read(new File("5Spades.png")));
		Cards spades6 = new Cards(6, ImageIO.read(new File("6Spades.png")));
		Cards spades7 = new Cards(7, ImageIO.read(new File("7Spades.png")));
		Cards spades8 = new Cards(8, ImageIO.read(new File("8Spades.png")));
		Cards spades9 = new Cards(9, ImageIO.read(new File("9Spades.png")));
		Cards spades10 = new Cards(10, ImageIO.read(new File("10Spades.png")));
		Cards spadesJ = new Cards(10, ImageIO.read(new File("JSpades.png")));
		Cards spadesQ = new Cards(10, ImageIO.read(new File("QSpades.png")));
		Cards spadesK = new Cards(10, ImageIO.read(new File("KSpades.png")));
		Cards acehearts = new Cards(11, ImageIO.read(new File("AHearts.png")));
		Cards hearts2 = new Cards(2, ImageIO.read(new File("2Hearts.png")));
		Cards hearts3 = new Cards(3, ImageIO.read(new File("3Hearts.png")));
		Cards hearts4 = new Cards(4, ImageIO.read(new File("4Hearts.png")));
		Cards hearts5 = new Cards(5, ImageIO.read(new File("5Hearts.png")));
		Cards hearts6 = new Cards(6, ImageIO.read(new File("6Hearts.png")));
		Cards hearts7 = new Cards(7, ImageIO.read(new File("7Hearts.png")));
		Cards hearts8 = new Cards(8, ImageIO.read(new File("8Hearts.png")));
		Cards hearts9 = new Cards(9, ImageIO.read(new File("9Hearts.png")));
		Cards hearts10 = new Cards(10, ImageIO.read(new File("10Hearts.png")));
		Cards heartsJ = new Cards(10, ImageIO.read(new File("JHearts.png")));
		Cards heartsQ = new Cards(10, ImageIO.read(new File("QHearts.png")));
		Cards heartsK = new Cards(10, ImageIO.read(new File("KHearts.png")));
		Cards aceclubs = new Cards(11, ImageIO.read(new File("AClubs.png")));
		Cards clubs2 = new Cards(2, ImageIO.read(new File("2Clubs.png")));
		Cards clubs3 = new Cards(3, ImageIO.read(new File("3Clubs.png")));
		Cards clubs4 = new Cards(4, ImageIO.read(new File("4Clubs.png")));
		Cards clubs5 = new Cards(5, ImageIO.read(new File("5Clubs.png")));
		Cards clubs6 = new Cards(6, ImageIO.read(new File("6Clubs.png")));
		Cards clubs7 = new Cards(7, ImageIO.read(new File("7Clubs.png")));
		Cards clubs8 = new Cards(8, ImageIO.read(new File("8Clubs.png")));
		Cards clubs9 = new Cards(9, ImageIO.read(new File("9Clubs.png")));
		Cards clubs10 = new Cards(10, ImageIO.read(new File("10Clubs.png")));
		Cards clubsJ = new Cards(10, ImageIO.read(new File("JClubs.png")));
		Cards clubsQ = new Cards(10, ImageIO.read(new File("QClubs.png")));
		Cards clubsK = new Cards(10, ImageIO.read(new File("KClubs.png")));
		Cards acediamonds = new Cards(11, ImageIO.read(new File("ASpades.png")));
		Cards diamonds2 = new Cards(2, ImageIO.read(new File("2Diamonds.png")));
		Cards diamonds3 = new Cards(3, ImageIO.read(new File("3Diamonds.png")));
		Cards diamonds4 = new Cards(4, ImageIO.read(new File("4Diamonds.png")));
		Cards diamonds5 = new Cards(5, ImageIO.read(new File("5Diamonds.png")));
		Cards diamonds6 = new Cards(6, ImageIO.read(new File("6Diamonds.png")));
		Cards diamonds7 = new Cards(7, ImageIO.read(new File("7Diamonds.png")));
		Cards diamonds8 = new Cards(8, ImageIO.read(new File("8Diamonds.png")));
		Cards diamonds9 = new Cards(9, ImageIO.read(new File("9Diamonds.png")));
		Cards diamonds10 = new Cards(10, ImageIO.read(new File("10Diamonds.png")));
		Cards diamondsJ = new Cards(10, ImageIO.read(new File("JDiamonds.png")));
		Cards diamondsQ = new Cards(10, ImageIO.read(new File("QDiamonds.png")));
		Cards diamondsK = new Cards(10, ImageIO.read(new File("KDiamonds.png")));
		Cards chip1 = new Cards(1, ImageIO.read(new File("Chip1.png")));
		Cards chip5 = new Cards(5, ImageIO.read(new File("Chip5.png")));
		Cards chip10 = new Cards(10, ImageIO.read(new File("Chip10.png")));
		Cards chip25 = new Cards(25, ImageIO.read(new File("Chip25.png")));
		Cards chip100 = new Cards(100, ImageIO.read(new File("Chip100.png")));
		cardsArray.add(acespades);
		cardsArray.add(spades2);
		cardsArray.add(spades3);
		cardsArray.add(spades4);
		cardsArray.add(spades5);
		cardsArray.add(spades6);
		cardsArray.add(spades7);
		cardsArray.add(spades8);
		cardsArray.add(spades9);
		cardsArray.add(spades10);
		cardsArray.add(spadesJ);
		cardsArray.add(spadesQ);
		cardsArray.add(spadesK);
		cardsArray.add(acehearts);
		cardsArray.add(hearts2);
		cardsArray.add(hearts3);
		cardsArray.add(hearts4);
		cardsArray.add(hearts5);
		cardsArray.add(hearts6);
		cardsArray.add(hearts7);
		cardsArray.add(hearts8);
		cardsArray.add(hearts9);
		cardsArray.add(hearts10);
		cardsArray.add(heartsJ);
		cardsArray.add(heartsQ);
		cardsArray.add(heartsK);
		cardsArray.add(aceclubs);
		cardsArray.add(clubs2);
		cardsArray.add(clubs3);
		cardsArray.add(clubs4);
		cardsArray.add(clubs5);
		cardsArray.add(clubs6);
		cardsArray.add(clubs7);
		cardsArray.add(clubs8);
		cardsArray.add(clubs9);
		cardsArray.add(clubs10);
		cardsArray.add(clubsJ);
		cardsArray.add(clubsQ);
		cardsArray.add(clubsK);
		cardsArray.add(acediamonds);
		cardsArray.add(diamonds2);
		cardsArray.add(diamonds3);
		cardsArray.add(diamonds4);
		cardsArray.add(diamonds5);
		cardsArray.add(diamonds6);
		cardsArray.add(diamonds7);
		cardsArray.add(diamonds8);
		cardsArray.add(diamonds9);
		cardsArray.add(diamonds10);
		cardsArray.add(diamondsJ);
		cardsArray.add(diamondsQ);
		cardsArray.add(diamondsK);
		for (int i = 0; i < deckArray.length; i++) {
			deckArray[i] = i;
		}
	}

	public Cards getCard() {
		Random rand = new Random();
		int i;
		i = rand.nextInt(51) + 1;
//		while (deckArray[i] == -1 ) {
//			i = rand.nextInt(52) + 1;
//		}
//		deckArray[i] = -1;
		return cardsArray.get(i);
	}
	public void shuffle (){
		for (int i = 0; i < deckArray.length; i++){
			deckArray[i] = i;
		}
	}
}
