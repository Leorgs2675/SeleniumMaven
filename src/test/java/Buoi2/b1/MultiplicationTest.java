package Buoi2.b1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplicationTest {


    public int multiply(int a, int b) {
        return a * b;
    }


    public boolean kiemtrasonguyen(Object input) {
        return input instanceof Integer;
    }

    @Test
    void testValidPositiveNumbers() {

        assertEquals(12, multiply(3, 4));
    }

    @Test
    void testValidNegativeNumbers() {

        assertEquals(20, multiply(-4, -5));
    }

    @Test
    void testPositiveAndNegativeNumbers() {
        assertEquals(-15, multiply(3, -5));
    }

    @Test
    void testZeroAndPositiveNumber() {

        assertEquals(0, multiply(0, 5));
    }

    @Test
    void testZeroAndNegativeNumber() {
        assertEquals(0, multiply(0, -3));
    }

    @Test
    void testMaxIntegerValue() {
        assertEquals((long) Integer.MAX_VALUE * 1, (long) multiply(Integer.MAX_VALUE, 1));
    }

    @Test
    void testMinIntegerValue() {
        assertEquals((long) Integer.MIN_VALUE * 1, (long) multiply(Integer.MIN_VALUE, 1));
    }

    @Test
    void testNonIntegerInput1() {
        assertFalse(kiemtrasonguyen("abc"));
    }

    @Test
    void testNonIntegerInput2() {
        assertFalse(kiemtrasonguyen(3.5));
    }

    @Test
    void testValidIntegerInput() {
        assertTrue(kiemtrasonguyen(10));
    }
}
