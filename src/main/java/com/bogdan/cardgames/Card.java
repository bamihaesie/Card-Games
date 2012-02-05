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


