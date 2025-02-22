package Buoi3.ServiceTest.b3;
import static org.junit.jupiter.api.Assertions.*;

import Buoi3.model.Employee;
import Buoi3.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeServiceTest {
    private EmployeeService service;

    @BeforeEach
    void setUp() {
        service = new EmployeeService();
    }

    // Test thêm nhân viên thành công
    @Test
    void testThemNhanVienThanhCong() {
        Employee emp = new Employee(1, "Nguyen", "Van A", "nguyena@example.com");
        assertTrue(service.themNhanVien(emp));
    }

    // Test thêm nhân viên bị trùng ID (thất bại)
    @Test
    void testThemNhanVienTrungID() {
        Employee emp1 = new Employee(1, "Nguyen", "Van A", "nguyena@example.com");
        Employee emp2 = new Employee(1, "Tran", "Van B", "tranb@example.com");
        service.themNhanVien(emp1);
        assertFalse(service.themNhanVien(emp2));
    }

    // Test sửa nhân viên thành công
    @Test
    void testSuaNhanVienThanhCong() {
        Employee emp = new Employee(1, "Nguyen", "Van A", "nguyena@example.com");
        service.themNhanVien(emp);
        assertTrue(service.suaNhanVien(1, "Nguyen", "Van B", "nguyenb@example.com"));
    }

    // Test sửa nhân viên không tồn tại
    @Test
    void testSuaNhanVienKhongTonTai() {
        assertFalse(service.suaNhanVien(99, "Nguyen", "Van C", "nguyenc@example.com"));
    }

    // Test xóa nhân viên thành công
    @Test
    void testXoaNhanVienThanhCong() {
        Employee emp = new Employee(1, "Nguyen", "Van A", "nguyena@example.com");
        service.themNhanVien(emp);
        assertTrue(service.xoaNhanVien(1));
    }

    // Test xóa nhân viên không tồn tại
    @Test
    void testXoaNhanVienKhongTonTai() {
        assertFalse(service.xoaNhanVien(99));
    }

    // Test tìm nhân viên thành công
    @Test
    void testTimNhanVienThanhCong() {
        Employee emp = new Employee(1, "Nguyen", "Van A", "nguyena@example.com");
        service.themNhanVien(emp);
        assertNotNull(service.timNhanVien(1));
    }

    // Test tìm nhân viên không tồn tại
    @Test
    void testTimNhanVienKhongTonTai() {
        assertNull(service.timNhanVien(99));
    }

    // Test số lượng nhân viên sau khi thêm
    @Test
    void testSoLuongNhanVienSauKhiThem() {
        service.themNhanVien(new Employee(1, "Nguyen", "Van A", "nguyena@example.com"));
        service.themNhanVien(new Employee(2, "Tran", "Van B", "tranb@example.com"));
        assertEquals(2, service.getDanhSachNhanVien().size());
    }

    // Test số lượng nhân viên sau khi xóa
    @Test
    void testSoLuongNhanVienSauKhiXoa() {
        service.themNhanVien(new Employee(1, "Nguyen", "Van A", "nguyena@example.com"));
        service.themNhanVien(new Employee(2, "Tran", "Van B", "tranb@example.com"));
        service.xoaNhanVien(1);
        assertEquals(1, service.getDanhSachNhanVien().size());
    }
}

