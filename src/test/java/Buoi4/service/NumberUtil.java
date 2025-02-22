package Buoi4.service;

public class NumberUtil {
    public static int tongSoLe(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}

