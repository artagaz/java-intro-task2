package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void reverse() {
        assertEquals("321", Main.reverse("123"));
    }
}