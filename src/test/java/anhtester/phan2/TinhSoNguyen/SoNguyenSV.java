package anhtester.phan2.TinhSoNguyen;

public class SoNguyenSV {
    public int tinhTong(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
