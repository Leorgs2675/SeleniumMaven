package Buoi5.service;


import Buoi5.model.SinhVien;

public class SinhVienService {
    public void suaThongTin(SinhVien sv, String tenMoi) {
        if (tenMoi == null || tenMoi.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên không được để trống");
        }
        sv.setTen(tenMoi);
    }
}
