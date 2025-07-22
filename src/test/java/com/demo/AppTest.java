package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testSuma() {
        assertEquals(5, App.suma(2, 3));
    }
}
