package anhtester.phan2.bt4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TbcTest {
TrungBinhCongSv tbc = new TrungBinhCongSv();


    @Test
    public void testTinhTrungBinhCong() {
        int[][] testCases = {
            {5, 10},
            {4, 10},
            {6, 10},
            {9, 10},
            {10, 10}
        };

        double expected = 8.4;
        double actual = tbc.tinhTrungBinhCong(testCases);
        double delta = 0.0001;

        assertEquals(expected, actual, delta);
    }
}
