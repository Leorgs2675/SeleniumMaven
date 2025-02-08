package anhtester;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TinhHieu {
    TinhHIieuverice service = new TinhHIieuverice();

    @Test
    public void tinhHieu() {
        assertEquals(15, service.tinhHieu( 5, 10));
    }

    @Test
    public void tinhHieu2() {
        assertEquals(14, service.tinhHieu(4, 10));
    }

    @Test
    public void tinhHieu3() {
        assertEquals(16, service.tinhHieu(6, 10));
    }

    @Test
    public void tinhHieu4() {
        assertEquals(19, service.tinhHieu(9, 10));
    }

    @Test
    public void tinhHieu5() {
        assertEquals(20, service.tinhHieu(10 , 10));
    }


}