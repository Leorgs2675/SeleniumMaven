package anhtester.tinhtich;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Tinhtich {
TinhTichSevec service = new TinhTichSevec();
    @Test
    public void tinhTich1() {
        assertEquals(50, service.tinhTich(5, 10));
    }

    @Test
    public void tinhTich2() {
        assertEquals(40, service.tinhTich(4, 10));
    }

    @Test
    public void tinhTich3() {
        assertEquals(60, service.tinhTich(6, 10));
    }

    @Test
    public void tinhTich4() {
        assertEquals(90, service.tinhTich(9, 10));
    }

    @Test
    public void tinhTich5()  {
        assertEquals(100, service.tinhTich(10, 10));
    }
}

