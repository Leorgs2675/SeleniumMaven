package Buoi4.test;

import static org.junit.jupiter.api.Assertions.*;

import Buoi4.service.NumberUtil;
import org.junit.jupiter.api.Test;

public class NumberUtilTest {
    @Test
    void testTongSoLe() {
        assertEquals(1, NumberUtil.tongSoLe(1));
        assertEquals(4, NumberUtil.tongSoLe(3));
        assertEquals(9, NumberUtil.tongSoLe(5));
        assertEquals(25, NumberUtil.tongSoLe(9));
    }
}

