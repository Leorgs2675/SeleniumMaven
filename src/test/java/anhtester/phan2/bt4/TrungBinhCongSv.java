package anhtester.phan2.bt4;

public class TrungBinhCongSv {


        public double tinhTrungBinhCong(int[][] testCases) {
            double sum = 0;
            for (int[] pair : testCases) {
                double tbc = (pair[0] + pair[1]) / 2.0;
                sum += tbc;
            }
            return sum / testCases.length;
        }
    }



