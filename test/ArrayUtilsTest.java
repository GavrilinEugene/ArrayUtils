import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayUtilsTest {

    @org.junit.Test
    public void resize() throws Exception {
        assertEquals("Resizing array up to 10 elements", 10, ArrayUtils.resize(new int[]{1,2,3}, 10).length);
        assertArrayEquals("Resizing array, elements test", new int[]{1,2,3,0,0}, ArrayUtils.resize(new int[]{1,2,3}, 5));
        assertArrayEquals("Trimming array", new int[]{1,2}, ArrayUtils.resize(new int[]{1,2,3,4}, 2));
        assertArrayEquals("Trimming array, elements test", new int[]{1,2}, ArrayUtils.resize(new int[]{1,2,3,4}, 2));
    }

    @org.junit.Test
    public void shuffle() throws Exception {
        int[] testArray = new int[]{1,2,3};
        int[] shuffleArray = ArrayUtils.shuffle(testArray);
        assertEquals("Length check", 3, ArrayUtils.shuffle(testArray).length);
        Arrays.sort(testArray);
        Arrays.sort(shuffleArray);
        assertArrayEquals("Comparing sorted shuffle and test arrays", testArray, shuffleArray);
    }

    @org.junit.Test
    public void compareNoRegardToOrder() throws Exception {
        int[] first = new int[]{1,2,3,2,-5,0,4};
        int[] second = new int[]{2,3,1,4,2,-5,0};
        assertTrue("Comparing arraysNoRegardToOrder", ArrayUtils.compareNoRegardToOrder(first,second));
    }

    @org.junit.Test
    public void convertToString() throws Exception {
        assertEquals("print test", new String("[-2, 0, 5, 7, 8]"),ArrayUtils.convertToString(new int[]{-2,0,5,7,8}));
    }

}