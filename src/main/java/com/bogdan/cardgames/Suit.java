package com.bogdan.cardgames;

/**
 * @author Bogdan
 */
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
