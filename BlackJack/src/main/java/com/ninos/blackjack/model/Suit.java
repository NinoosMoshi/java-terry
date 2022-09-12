package com.ninos.blackjack.model;

public enum Suit {
    CLUBS('\u2663'),
    DIAMONDS('\u2662'),
    HEARTS('\u2661'),
    SPADES('\u2664');

    private char symbol;

    Suit(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return Character.toString(this.symbol);
    }

}
