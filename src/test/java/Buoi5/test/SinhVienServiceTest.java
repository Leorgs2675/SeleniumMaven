package Buoi5.test;


import Buoi5.model.SinhVien;
import Buoi5.service.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SinhVienServiceTest {
    private SinhVienService sinhVienService;
    private SinhVien sinhVien;

    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
        sinhVien = new SinhVien("SV01", "Nguyen Van A", 20, 8.5f, 3, "CNTT");
    }

    @Test
    void testSuaThongTin() {
        sinhVienService.suaThongTin(sinhVien, "Le Van B");
        assertEquals("Le Van B", sinhVien.getTen());
    }

    @Test
    void testSuaThongTinInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.suaThongTin(sinhVien, "");
        });
        assertEquals("Tên không được để trống", exception.getMessage());
    }
}
