package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
