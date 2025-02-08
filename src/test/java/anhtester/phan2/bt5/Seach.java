package anhtester.phan2.bt5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Seach {
    SeachSV Sv = new SeachSV();

    @Test
    public void testSingleElementArray() {
        int[] arr = {5};
        int target = 5;
        assertEquals(0, Sv.tim(arr, target));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int target = 3;
        assertEquals(-1,Sv.tim(arr, target));
    }

    @Test
    public void testElementAtStart() {
        int[] arr = {10, 20, 30, 40};
        int target = 10;
        assertEquals(0, Sv.tim(arr, target));
    }

    @Test
    public void testElementInMiddle() {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        assertEquals(2, Sv.tim(arr, target));
    }

    @Test
    public void testElementAtEnd() {
        int[] arr = {10, 20, 30, 40,50};
        int target = 50;
        assertEquals(4, Sv.tim(arr, target));
    }
}
