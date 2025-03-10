package Buoi3.ServiceTest.b1;

import Buoi3.model.b1XeOto;
import Buoi3.service.b1XeOtoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class XeOtoServiceTest {
    private b1XeOtoService service;

    @BeforeEach
    void setUp() {
        service = new b1XeOtoService();
    }

    // Test thêm xe thành công
    @Test
    void testThemXeThanhCong() {
        b1XeOto xe = new b1XeOto(6, "Toyota Camry", 50000, "Sedan cao cấp");
        assertTrue(service.themXe(xe));
    }

    // Test thêm xe bị trùng mã (thất bại)
    @Test
    void testThemXeTrungMa() {
        b1XeOto xe1 = new b1XeOto(1, "Toyota Camry", 50000, "Sedan cao cấp");
        b1XeOto xe2 = new b1XeOto(1, "Honda Civic", 40000, "Xe thể thao");
        service.themXe(xe1);
        assertFalse(service.themXe(xe2));
    }

    // Test sửa xe thành công
    @Test
    void testSuaXeThanhCong() {
        b1XeOto xe = new b1XeOto(1, "Toyota Camry", 50000, "Sedan cao cấp");
        service.themXe(xe);
        assertTrue(service.Sua(1, "Toyota Supra", 60000, "Xe thể thao"));
    }

    // Test sửa xe không tồn tại
    @Test
    void testSuaXeKhongTonTai() {
        assertFalse(service.Sua(99, "Mazda 3", 30000, "Xe phổ thông"));
    }

    // Test xóa xe thành công
    @Test
    void testXoaXeThanhCong() {
        b1XeOto xe = new b1XeOto(1, "Toyota Camry", 50000, "Sedan cao cấp");
        service.themXe(xe);
        assertTrue(service.xoaXe(1));
    }

    // Test xóa xe không tồn tại
    @Test
    void testXoaXeKhongTonTai() {
        assertFalse(service.xoaXe(99));
    }

    // Test danh sách xe có đúng số lượng sau khi thêm
    @Test
    void testSoLuongXeSauKhiThem() {
        service.themXe(new b1XeOto(1, "Toyota Camry", 50000, "Sedan cao cấp"));
        service.themXe(new b1XeOto(2, "Honda Civic", 40000, "Xe thể thao"));
        assertEquals(5, service.getlistXe().size());
    }

    // Test danh sách xe có đúng số lượng sau khi xóa
    @Test
    void testSoLuongXeSauKhiXoa() {
        service.themXe(new b1XeOto(1, "Toyota Camry", 50000, "Sedan cao cấp"));
        service.themXe(new b1XeOto(2, "Honda Civic", 40000, "Xe thể thao"));
        service.xoaXe(1);
        assertEquals(4, service.getlistXe().size());
    }
}
