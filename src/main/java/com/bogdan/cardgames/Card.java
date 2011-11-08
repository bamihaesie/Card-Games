package com.bogdan.cardgames;

/**
 * @author bogdan
 */
public class Card {

    private int value;
    private String suit;

    public Card(int value, String suit) throws Exception {
        if (!isValidValue(value)) {
            throw new Exception("Invalid value for card: " + value);
        }
        if (!isValidSuit(suit)) {
            throw new Exception("Invalid suit for card: " + suit);
        }

        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    private boolean isValidValue(int value) {
        if (value < 2 || value > 14) {
            return false;
        }
        return true;
    }

    private boolean isValidSuit(String suit) {
        if (Suit.getSuitByName(suit) != null) {
            return true;
        }
        return false;
    }

}

enum Suit {
    HEARTS ("hearts"),
    SPADES ("spades"),
    CLUBS ("clubs"),
    DIAMONDS ("diamonds");

    private String name;

    Suit(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public static Suit getSuitByName(String name) {
		for (Suit suit : values()) {
			if (suit.getName().equals(name)) {
				return suit;
			}
		}
		return null;
	}
}
