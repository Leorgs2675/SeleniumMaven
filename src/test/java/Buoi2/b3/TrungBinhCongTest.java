package Buoi2.b3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrungBinhCongTest {
    public static double TrungBinhCongTestTest(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Danh sách trống! Không thể chia cho 0.");
        }

        int tong = numbers.stream().mapToInt(Integer::intValue).sum();
        return (double) tong / numbers.size();
    }
    @Test
    void tinhTrungBinhDanhSachHopLe() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(3.0, TrungBinhCongTest.TrungBinhCongTestTest(numbers));
    }

    @Test
    void tinhTrungBinhMotPhanTu() {
        List<Integer> numbers = Arrays.asList(10);
        assertEquals(10.0, TrungBinhCongTest.TrungBinhCongTestTest(numbers));
    }

    @Test
    void tinhTrungBinhDanhSachAmDuong() {
        List<Integer> numbers = Arrays.asList(-10, 20, -5, 15);
        assertEquals(5.0, TrungBinhCongTest.TrungBinhCongTestTest(numbers));
    }

    @Test
    void tinhTrungBinhDanhSachRong() {
        List<Integer> numbers = Collections.emptyList();
        Exception exception = assertThrows(ArithmeticException.class, () -> TrungBinhCongTest.TrungBinhCongTestTest(numbers));
        assertEquals("Danh sách trống! Không thể chia cho 0.", exception.getMessage());
    }

    @Test
    void tinhTrungBinhDanhSachNull() {
        Exception exception = assertThrows(ArithmeticException.class, () -> TrungBinhCongTest.TrungBinhCongTestTest(null));
        assertEquals("Danh sách trống! Không thể chia cho 0.", exception.getMessage());
    }
}
