package Buoi2.b6;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MangSoNguyenTest {
    public static int timPhanTuNhoNhat(int[] mang) {
        if (mang == null || mang.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng!");
        }
        return Arrays.stream(mang).min().orElseThrow();
    }
    @Test
    void timPhanTuNhoNhatMangHopLe() {
        int[] mang = {10, 2, 30, 4, 1};
        assertEquals(1, MangSoNguyenTest.timPhanTuNhoNhat(mang));
    }

    @Test
    void timPhanTuNhoNhatMotPhanTu() {
        int[] mang = {7};
        assertEquals(7, MangSoNguyenTest.timPhanTuNhoNhat(mang));
    }

    @Test
    void timPhanTuNhoNhatMangSoAm() {
        int[] mang = {-5, -10, -3, -1};
        assertEquals(-10, MangSoNguyenTest.timPhanTuNhoNhat(mang));
    }

    @Test
    void timPhanTuNhoNhatMangRong() {
        int[] mang = {};
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> MangSoNguyenTest.timPhanTuNhoNhat(mang));
        assertEquals("Mảng không được rỗng!", exception.getMessage());
    }

    @Test
    void timPhanTuNhoNhatMangNull() {
        int[] mang = null;
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> MangSoNguyenTest.timPhanTuNhoNhat(mang));
        assertEquals("Mảng không được rỗng!", exception.getMessage());
    }
}
