package project14_28jun;

public class Playingcard {
	
	private Suit temp;
	public static final int SUIT_SPADES = 0;
	public static final int SUIT_HEARTS = 1;
	public static final int SUIT_CLUBS = 2;
	public static final int SUIT_DIAMONDS = 3;

	public Playingcard(Suit temp) {
		super();
		this.temp=temp;
	}

	public Suit getTemp() {
		return temp;
	}
	
	public void setTemp(Suit temp) {
		this.temp = temp;
	}
}
