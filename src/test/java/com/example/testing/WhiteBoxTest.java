package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteBoxTest {

    @Test
    void number() {
        assertEquals(1, WhiteBox.number(0, 1));
        assertEquals(1, WhiteBox.number(1, 0));
    }
}
