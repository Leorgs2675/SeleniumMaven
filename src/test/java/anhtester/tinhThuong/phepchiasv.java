package anhtester.tinhThuong;

public class phepchiasv {


    public static double tinhThuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return (double) a / b;
    }


    public int TinhThuong(int a, int b) {
        return (int) tinhThuong(a, b);
    }
}
