package Buoi2.b2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhepChiaTest {
    // Hàm chia 2 số nguyên, xử lý ngoại lệ chia cho 0
    public int chia(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

    @Test
    void chiaSoDuong() {
        assertEquals(2, chia(4, 2));
    }

    @Test
    void chiaSoAm() {
        assertEquals(3, chia(-9, -3));
    }

    @Test
    void chiaSoDuongChoSoAm() {
        assertEquals(-4, chia(12, -3));
    }

    @Test
    void chiaSoAmChoSoDuong() {
        assertEquals(-5, chia(-10, 2));
    }

    @Test
    void chiaSoKhongChoSoDuong() {
        assertEquals(0, chia(0, 5));
    }

    @Test
    void chiaSoKhongChoSoAm() {
        assertEquals(0, chia(0, -7));
    }

    @Test
    void chiaMaxInteger() {
        assertEquals(1, chia(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void chiaMinInteger() {
        assertEquals(1, chia(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void chiaChoKhong() {
        Exception exception = assertThrows(ArithmeticException.class, () -> chia(5, 0));
        assertEquals("Không thể chia cho 0", exception.getMessage());
    }

    @Test
    void chiaMaxMin() {
        assertEquals(0, chia(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
