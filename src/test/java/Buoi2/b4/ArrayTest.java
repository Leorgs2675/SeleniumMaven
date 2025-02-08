package Buoi2.b4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayTest {
    public static int getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Chỉ mục nằm ngoài phạm vi của mảng!");
        }
        return array[index];
    }
    @Test
    void testGetElementValidIndex() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, ArrayTest.getElementAtIndex(array, 2));
    }

    @Test
    void testGetElementAtNegativeIndex() {
        int[] array = {1, 2, 3, 4, 5};
        Exception exception = assertThrows(IndexOutOfBoundsException.class,
                () -> ArrayTest.getElementAtIndex(array, -1));
        assertEquals(" nằm ngoài phạm vi của mảng!", exception.getMessage());
    }

    @Test
    void testGetElementAtOutOfBoundIndex() {
        int[] array = {1, 2, 3, 4, 5};
        Exception exception = assertThrows(IndexOutOfBoundsException.class,
                () -> ArrayTest.getElementAtIndex(array, 5));
        assertEquals(" nằm ngoài phạm vi của mảng!", exception.getMessage());
    }

    @Test
    void testGetElementAtLastIndex() {
        int[] array = {10, 20, 30, 40, 50};
        assertEquals(50, ArrayTest.getElementAtIndex(array, 4));
    }
}
