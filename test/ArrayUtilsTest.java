import static org.junit.Assert.*;

public class ArrayUtilsTest {
    @org.junit.Test
    public void trim() throws Exception {
        assertEquals("Trimming array to 5 elements", 5, ArrayUtils.trim(new int[]{1,2,3,4,5,6}, 5).length);
        assertArrayEquals("Trimming array.length<5 to 5 elements", new int[0], ArrayUtils.trim(new int[]{1,2,3}, 5));
    }

    @org.junit.Test
    public void resize() throws Exception {
        assertEquals("Resizing array up to 10 elements", 10, ArrayUtils.resize(new int[]{1,2,3}, 10).length);
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