package Buoi4.test;
import static org.junit.jupiter.api.Assertions.*;

import Buoi4.model.SanPham;
import Buoi4.service.SanPhamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SanPhamServiceTest {
    private SanPhamService service;
    private SanPham sanPham1, sanPham2;

    @BeforeEach
    void setUp() {
        service = new SanPhamService();
        sanPham1 = new SanPham("SP001", "Laptop", 2, 1500.0f, 10, "Điện tử");
        sanPham2 = new SanPham("SP002", "Điện thoại", 1, 800.0f, 5, "Điện tử");
        service.themSanPham(sanPham1);
        service.themSanPham(sanPham2);
    }

    @Test
    void testThemSanPham() {
        SanPham sp3 = new SanPham("SP003", "Máy tính bảng", 1, 500.0f, 7, "Điện tử");
        service.themSanPham(sp3);
        assertTrue(service.kiemTraMaTonTai("SP003"));
    }

    @Test
    void testXoaSanPham() {
        assertTrue(service.xoaSanPham("SP001"));
        assertFalse(service.kiemTraMaTonTai("SP001"));
    }

    @Test
    void testXoaSanPhamKhongTonTai() {
        assertFalse(service.xoaSanPham("SP999"));
    }

    @Test
    void testKiemTraMaTonTai() {
        assertTrue(service.kiemTraMaTonTai("SP002"));
        assertFalse(service.kiemTraMaTonTai("SP999"));
    }
}
