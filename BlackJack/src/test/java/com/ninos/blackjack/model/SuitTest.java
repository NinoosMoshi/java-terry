package com.ninos.blackjack.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuitTest {

    @Test
    void heartPrintsHeart() {
        assertEquals("\u2661",Suit.HEARTS.toString());
    }
}