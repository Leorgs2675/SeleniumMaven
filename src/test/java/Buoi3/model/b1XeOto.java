package Buoi3.model;

import java.util.ArrayList;
import java.util.List;

public class b1XeOto {
    private int ma;
    private String ten;
    private double gia;
    private String ghichu;


    public b1XeOto(int ma, String ten, double gia, String ghichu) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.ghichu = ghichu;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
}
