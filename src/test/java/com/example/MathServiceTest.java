package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {

    @Test
    public void testAdd() {
        MathService math = new MathService();
        assertEquals(5, math.add(2, 3));
    }

    @Test
    public void testSubtract() {
        MathService math = new MathService();
        assertEquals(1, math.subtract(3, 2));
    }

    // @Test
    // public void testMultiply() {
    //     MathService math = new MathService();
    //     assertEquals(6, math.multiply(2, 3));
    // }
}