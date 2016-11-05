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

    }

    @org.junit.Test
    public void compareNoRegardToOrder() throws Exception {

    }

    @org.junit.Test
    public void print() throws Exception {

    }

}