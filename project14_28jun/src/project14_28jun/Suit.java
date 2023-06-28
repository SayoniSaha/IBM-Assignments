package project14_28jun;

public enum Suit {
	SUIT_SPADES("Spades", 1),
	SUIT_HEARTS("Hearts", 2),
	SUIT_CLUBS("Clubs", 3),
	SUIT_DIAMONDS("Diamond", 4);

	private int rank;
	private String name;

	private Suit(String name, int rank) {
		this.name = name;
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public String getName() {
		return name;
	}
}
