package anhtester.phan2.TinhSoNguyen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SoNguyen {
    SoNguyenSV tinhTong = new SoNguyenSV();

    @Test
    public void testTinhTong() {

        int[] numbers1 = {1, 2, 3, 4, 5};
        assertEquals(15, tinhTong.tinhTong(numbers1));


        int[] numbers2 = {-1, -2, -3, -4, -5};
        assertEquals(-15, tinhTong.tinhTong(numbers2));

        
        int[] numbers3 = {1, -2, 3, -4, 5};
        assertEquals(3, tinhTong.tinhTong(numbers3));


        int[] numbers4 = {};
        assertEquals(0, tinhTong.tinhTong(numbers4));


        int[] numbers5 = {10};
        assertEquals(10, tinhTong.tinhTong(numbers5));
    }
}

