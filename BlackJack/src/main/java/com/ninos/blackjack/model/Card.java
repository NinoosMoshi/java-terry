package com.ninos.blackjack.model;

import lombok.Data;

@Data
public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suit, String rank) {
        this.suit = Suit.valueOf(suit.toUpperCase());
        this.rank = Rank.valueOf(rank.toUpperCase());
    }

    public int getValue() {
        return this.rank.getValue();
    }

    @Override
    public String toString() {
        return this.rank.toString().concat(" ").concat(this.suit.toString());
    }
}
