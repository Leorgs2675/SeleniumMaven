package anhtester;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTinhToan {
    TinhToanService service = new TinhToanService();

    @Test
    public void tinhTong1() {
        assertEquals(15, service.tinhTong( 5, 10));
    }

    @Test
    public void tinhTong2() {
        assertEquals(14, service.tinhTong(4, 10));
    }

    @Test
    public void tinhTong3() {
        assertEquals(16, service.tinhTong(6, 10));
    }

    @Test
    public void tinhTong4() {
        assertEquals(19, service.tinhTong(9, 10));
    }

    @Test
    public void tinhTong5() {
        assertEquals(20, service.tinhTong(10 , 10));
    }


}
