package Buoi4.service;

import Buoi4.model.SanPham;
import java.util.HashMap;
import java.util.Map;

public class SanPhamService {
    private Map<String, SanPham> sanPhamMap = new HashMap<>();

    public void themSanPham(SanPham sanPham) {
        sanPhamMap.put(sanPham.getMa(), sanPham);
    }

    public boolean xoaSanPham(String ma) {
        if (sanPhamMap.containsKey(ma)) {
            sanPhamMap.remove(ma);
            return true;
        }
        return false;
    }
    public boolean updateSp(String maSV, SanPham newInfo) {
        if (!sanPhamMap.containsKey(maSV)) {
            return false;
        }
        SanPham sp = sanPhamMap.get(maSV);
        sp.setTen(newInfo.getTen());
        sp.setGia(newInfo.getGia());
        sp.setDanhMuc(newInfo.getDanhMuc());
        sp.setSoLuong(newInfo.getSoLuong());
        sp.setNamBaoHanh(newInfo.getNamBaoHanh());
        return true;
    }
    public boolean valid(SanPham sanPham) {
        String ma = sanPham.getMa();
        String ten = sanPham.getTen();
        Integer namBaoHanh = sanPham.getNamBaoHanh();
        Float gia = sanPham.getGia();
        Integer soLuong = sanPham.getSoLuong();
        String danhMuc = sanPham.getDanhMuc();
        if (ma == null || ten == null || namBaoHanh == null || gia == null || soLuong == null || danhMuc == null) {
            return false;
        }
        sanPhamMap.put(sanPham.getMa(), sanPham);
        return true;
    }
    public boolean kiemTraMaTonTai(String ma) {
        return sanPhamMap.containsKey(ma);
    }
}

