package Buoi3.model;
public class SinhVien {
    private int maSV;
    private String tenSV;
    private String lop;
    private String khoaHoc;
    private String monHoc;

    // Constructor
    public SinhVien(int maSV, String tenSV, String lop, String khoaHoc, String monHoc) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.monHoc = monHoc;
    }


    public int getMaSV() { return maSV; }
    public void setMaSV(int maSV) { this.maSV = maSV; }

    public String getTenSV() { return tenSV; }
    public void setTenSV(String tenSV) { this.tenSV = tenSV; }

    public String getLop() { return lop; }
    public void setLop(String lop) { this.lop = lop; }

    public String getKhoaHoc() { return khoaHoc; }
    public void setKhoaHoc(String khoaHoc) { this.khoaHoc = khoaHoc; }

    public String getMonHoc() { return monHoc; }
    public void setMonHoc(String monHoc) { this.monHoc = monHoc; }
}
