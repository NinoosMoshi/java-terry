package com.ninos.blackjack.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testCardOfATwo(){
        Card card = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card.getValue());
    }

    @Test
    void testCardOfAThree(){
        Card card = new Card(Suit.DIAMONDS, Rank.THREE);
        assertEquals(3, card.getValue());
    }

    @Test
    void testCardOfAce(){
        Card card = new Card(Suit.DIAMONDS, Rank.ACE);
        assertEquals(1, card.getValue());
    }

    @Test
    void testCardOfJack(){
        Card card = new Card(Suit.DIAMONDS, Rank.JACK);
        assertEquals(10, card.getValue());
    }

    @Test
    void testCardOfKing(){
        Card card = new Card(Suit.DIAMONDS, Rank.KING);
        assertEquals(10, card.getValue());
    }

    @Test
    void testCardOfQueen(){
        Card card = new Card(Suit.DIAMONDS, Rank.QUEEN);
        assertEquals(10, card.getValue());
    }


}