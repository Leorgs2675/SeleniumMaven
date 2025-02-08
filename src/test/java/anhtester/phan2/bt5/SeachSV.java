package anhtester.phan2.bt5;

public class SeachSV {
    public static int tim(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
