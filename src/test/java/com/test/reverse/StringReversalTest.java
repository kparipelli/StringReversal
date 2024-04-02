package com.test.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReversalTest {
    @Test
    public void testReverse() {
        StringReversal reversal = new StringReversal();
        assertEquals("dlroW olleH", reversal.reverse("Hello World"));
        assertEquals("54321", reversal.reverse("12345"));
        assertEquals("", reversal.reverse(""));
    }
}
