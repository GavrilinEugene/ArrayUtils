import com.javaunivercity.evgenii.condition.ConditionLess;
import com.javaunivercity.evgenii.condition.ConditionMore;
import com.javaunivercity.evgenii.predicate.ComparablePredicate;
import com.javaunivercity.evgenii.predicate.EvenPredicate;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayUtilsTest {
    @Test
    public void filter() throws Exception {
        int[] originalArray = new int[]{100, 200, 33, -5, 3435};
        int[] expected = new int[]{200, 3435};
        int[] filtered = ArrayUtils.filter(originalArray, new ComparablePredicate(new ConditionMore(), 100));
        assertArrayEquals(expected, filtered);

        expected = new int[]{33, -5};
        filtered = ArrayUtils.filter(originalArray, new ComparablePredicate(new ConditionLess(), 100));
        assertArrayEquals(expected, filtered);

        expected = new int[]{100, 200};
        filtered = ArrayUtils.filter(originalArray, new EvenPredicate());
        assertArrayEquals(expected, filtered);
    }

    @org.junit.Test
    public void resize() throws Exception {
        assertEquals("Resizing array up to 10 elements", 10, ArrayUtils.resize(new int[]{1, 2, 3}, 10).length);
        assertArrayEquals("Resizing array, elements test", new int[]{1, 2, 3, 0, 0}, ArrayUtils.resize(new int[]{1, 2, 3}, 5));
        assertArrayEquals("Trimming array", new int[]{1, 2}, ArrayUtils.resize(new int[]{1, 2, 3, 4}, 2));
        assertArrayEquals("Trimming array, elements test", new int[]{1, 2}, ArrayUtils.resize(new int[]{1, 2, 3, 4}, 2));
    }

    @org.junit.Test
    public void shuffle() throws Exception {
        int[] originalArray = new int[]{1, 2, 3};
        int[] shuffleArray = Arrays.copyOf(originalArray, originalArray.length);
        ArrayUtils.shuffle(shuffleArray);
        assertEquals("Length check", 3, shuffleArray.length);
        Arrays.sort(originalArray);
        Arrays.sort(shuffleArray);
        assertArrayEquals("Comparing sorted shuffle and test arrays", originalArray, shuffleArray);
    }

    @org.junit.Test
    public void compareNoRegardToOrder() throws Exception {
        int[] first = new int[]{1, 2, 3, 2, -5, 0, 4};
        int[] second = new int[]{2, 3, 1, 4, 2, -5, 0};
        assertTrue("Comparing arraysNoRegardToOrder", ArrayUtils.compareWithoutOrder(first, second));
    }

    @org.junit.Test
    public void convertToString() throws Exception {
        assertEquals("print test", new String("[-2, 0, 5, 7, 8]"), ArrayUtils.convertToString(new int[]{-2, 0, 5, 7, 8}));
    }

}