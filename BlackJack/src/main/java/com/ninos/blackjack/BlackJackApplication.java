package com.ninos.blackjack;

import com.ninos.blackjack.model.Card;
import com.ninos.blackjack.model.Rank;
import com.ninos.blackjack.model.Suit;

public class BlackJackApplication {
    public static void main(String[] args) {

        Card card1 = new Card(Suit.CLUBS, Rank.KING);
        Card card2 = new Card(Suit.DIAMONDS, Rank.TEN);

        Card card3 = new Card("hearts", "nine");

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

    }
}
