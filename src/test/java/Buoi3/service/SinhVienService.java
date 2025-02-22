package Buoi3.service;
import Buoi3.model.SinhVien;
import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> danhSachSV = new ArrayList<>();
//    public SinhVienService() {
//        danhSachSV.add(new SinhVien(101, "Nguyen Van A", "12A1", "2023", "Toán"));
//        danhSachSV.add(new SinhVien(102, "Tran Thi B", "12A2", "2023", "Lý"));
//        danhSachSV.add(new SinhVien(103, "Le Van C", "12A3", "2023", "Hóa"));
//        danhSachSV.add(new SinhVien(104, "Pham Thi D", "12A4", "2023", "Sinh"));
//        danhSachSV.add(new SinhVien(105, "Hoang Van E", "12A5", "2023", "Anh"));
//    }
    // Thêm sinh viên
    public boolean themSinhVien(SinhVien sv) {
        for (SinhVien s : danhSachSV) {
            if (s.getMaSV() == sv.getMaSV()) return false; // Không cho phép trùng mã
        }
        danhSachSV.add(sv);
        return true;
    }

    // Sửa thông tin sinh viên
    public boolean suaSinhVien(int maSV, String tenMoi, String lopMoi, String khoaHocMoi, String monHocMoi) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV() == maSV) {
                sv.setTenSV(tenMoi);
                sv.setLop(lopMoi);
                sv.setKhoaHoc(khoaHocMoi);
                sv.setMonHoc(monHocMoi);
                return true;
            }
        }
        return false;
    }

    // Xóa sinh viên
    public boolean xoaSinhVien(int maSV) {
        return danhSachSV.removeIf(sv -> sv.getMaSV() == maSV);
    }

    // Tìm sinh viên theo MaSV
    public SinhVien timSinhVien(int maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV() == maSV) {
                return sv;
            }
        }
        return null; // Không tìm thấy
    }

    // Lấy danh sách sinh viên
    public List<SinhVien> getDanhSachSinhVien() {
        return danhSachSV;
    }
}
