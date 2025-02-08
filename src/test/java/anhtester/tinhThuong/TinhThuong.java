package anhtester.tinhThuong;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TinhThuong {
    phepchiasv service = new phepchiasv();
    @Test
    public void tinhThuong() {
        assertEquals(50, service.TinhThuong(500, 10));
    }
    @Test
    public void tinhThuong2() {
        assertEquals(50, service.TinhThuong(50, 10));
    }
    @Test
    public void tinhThuong3() {
        assertEquals(0, service.TinhThuong(500, 0));
    }
    @Test
    public void tinhThuong4() {
        assertEquals(0.5, service.TinhThuong(5, 10));
    }
}
