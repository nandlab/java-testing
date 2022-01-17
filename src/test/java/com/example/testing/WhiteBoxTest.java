package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiteBoxTest {

    @Test
    void number() {
        assertEquals(0, WhiteBox.number(0, 0));
    }
}