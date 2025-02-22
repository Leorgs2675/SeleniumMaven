package Buoi3.ServiceTest.b2;

import static org.junit.jupiter.api.Assertions.*;

import Buoi3.model.SinhVien;
import Buoi3.service.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SinhVienServiceTest {
    private SinhVienService service;

    @BeforeEach
    void setUp() {
        service = new SinhVienService();
    }

    // Test thêm sinh viên thành công
    @Test
    void testThemSinhVienThanhCong() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "10A1", "2024", "Toán");
        assertTrue(service.themSinhVien(sv));
    }

    // Test thêm sinh viên bị trùng mã (thất bại)
    @Test
    void testThemSinhVienTrungMa() {
        SinhVien sv1 = new SinhVien(1, "Nguyen Van A", "10A1", "2024", "Toán");
        SinhVien sv2 = new SinhVien(1, "Tran Van B", "10A2", "2024", "Lý");
        service.themSinhVien(sv1);
        assertFalse(service.themSinhVien(sv2));
    }

    // Test sửa sinh viên thành công
    @Test
    void testSuaSinhVienThanhCong() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "10A1", "2024", "Toán");
        service.themSinhVien(sv);
        assertTrue(service.suaSinhVien(1, "Nguyen Van B", "11A1", "2025", "Hóa"));
    }

    // Test sửa sinh viên không tồn tại
    @Test
    void testSuaSinhVienKhongTonTai() {
        assertFalse(service.suaSinhVien(99, "Nguyen Van C", "11A2", "2025", "Anh"));
    }

    // Test xóa sinh viên thành công
    @Test
    void testXoaSinhVienThanhCong() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "10A1", "2024", "Toán");
        service.themSinhVien(sv);
        assertTrue(service.xoaSinhVien(1));
    }

    // Test xóa sinh viên không tồn tại
    @Test
    void testXoaSinhVienKhongTonTai() {
        assertFalse(service.xoaSinhVien(99));
    }

    // Test tìm sinh viên thành công
    @Test
    void testTimSinhVienThanhCong() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "10A1", "2024", "Toán");
        service.themSinhVien(sv);
        assertNotNull(service.timSinhVien(1));
    }

    // Test tìm sinh viên không tồn tại
    @Test
    void testTimSinhVienKhongTonTai() {
        assertNull(service.timSinhVien(99));
    }

    // Test số lượng sinh viên sau khi thêm
    @Test
    void testSoLuongSinhVienSauKhiThem() {
        service.themSinhVien(new SinhVien(1, "Nguyen Van A", "10A1", "2024", "Toán"));
        service.themSinhVien(new SinhVien(2, "Tran Van B", "10A2", "2024", "Lý"));
        assertEquals(2, service.getDanhSachSinhVien().size());
    }

    // Test số lượng sinh viên sau khi xóa
    @Test
    void testSoLuongSinhVienSauKhiXoa() {
        service.themSinhVien(new SinhVien(1, "Nguyen Van A", "10A1", "2024", "Toán"));
        service.themSinhVien(new SinhVien(2, "Tran Van B", "10A2", "2024", "Lý"));
        service.xoaSinhVien(1);
        assertEquals(1, service.getDanhSachSinhVien().size());
    }
}

