package Buoi3.service;

import Buoi3.model.b1XeOto;
import java.util.ArrayList;
import java.util.List;

public class b1XeOtoService {
    private List<b1XeOto> listXe;
    public b1XeOtoService() {
        listXe = new ArrayList<>();
        listXe.add(new b1XeOto(1, "Toyota Camry", 50000, "Sedan cao cấp"));
        listXe.add(new b1XeOto(2, "Honda Civic", 40000, "Xe thể thao"));
        listXe.add(new b1XeOto(3, "Mazda 3", 30000, "Xe phổ thông"));
        listXe.add(new b1XeOto(4, "BMW X5", 80000, "SUV sang trọng"));
        listXe.add(new b1XeOto(5, "Mercedes C300", 70000, "Sedan cao cấp"));

    }
    public boolean themXe(b1XeOto xeOto){
        for (b1XeOto XeOto1 : listXe){
            if (XeOto1.getMa() == xeOto.getMa()){
                return false;
            }
        }
        listXe.add(xeOto);
        return true;
    }
    public boolean Sua(
            int ma,
            String tenMoi,
            double giaMoi,
            String ghiChuMoi
    ){
        for (b1XeOto XeOto1 : listXe){
            if (XeOto1.getMa() == ma){
                XeOto1.setTen(tenMoi);
                XeOto1.setGia(giaMoi);
                XeOto1.setGhichu(ghiChuMoi);
                return true;
            }
        }
        return false;
    }
    public boolean xoaXe(int ma) {
        return listXe.removeIf(xe -> xe.getMa() == ma);
    }
    public List<b1XeOto> getlistXe() {
        return listXe;
    }
}
