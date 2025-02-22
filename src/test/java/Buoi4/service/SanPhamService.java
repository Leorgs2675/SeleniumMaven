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

    public boolean kiemTraMaTonTai(String ma) {
        return sanPhamMap.containsKey(ma);
    }
}

