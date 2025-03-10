package Buoi5.test;

import Buoi5.service.MathUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilTest {
    @Test
    void testSumArray() {
        assertEquals(10, MathUtil.sum(new int[]{1, 2, 3, 4})); // Test với số dương
        assertEquals(0, MathUtil.sum(new int[]{0, 0, 0, 0})); // Test với toàn số 0
        assertEquals(-10, MathUtil.sum(new int[]{-1, -2, -3, -4})); // Test với số âm
        assertEquals(5, MathUtil.sum(new int[]{-1, 6})); // Test hỗn hợp số âm và số dương
        assertEquals(0, MathUtil.sum(new int[]{})); // Test với mảng rỗng
    }
}
