package project14_28jun;

public class PlayingcardTest {
	public static void main(String[] args) {
		Suit suit = Suit.SUIT_CLUBS;
		Playingcard pc = new Playingcard(suit);
		System.out.println(pc.getTemp().getName());
		System.out.println(pc.getTemp().getRank());
	}
}