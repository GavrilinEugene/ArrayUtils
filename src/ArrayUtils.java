/*
утилита для работы с массивами типа int
 */

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayUtils {

    public static int[] resize(int[] array, int newLength) {
        if (array == null || newLength < 0)
            throw new IllegalArgumentException();

        return Arrays.copyOf(array, newLength);
    }

    public static void shuffle(int[] array) {
        if (array == null)
            throw new IllegalArgumentException();

        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int swapElement = array[index];
            array[index] = array[i];
            array[i] = swapElement;
        }
    }
    
    public static boolean compareWithoutOrder(int[] first, int[] second) {
        if (first == null || second == null)
            throw new IllegalArgumentException();

        int[] sortedFirst = Arrays.copyOf(first, first.length);
        int[] sortedSecond = Arrays.copyOf(second, second.length);
        Arrays.sort(sortedFirst);
        Arrays.sort(sortedSecond);
        return Arrays.equals(sortedFirst, sortedSecond);
    }

    public static String convertToString(int[] array) {
        return Arrays.toString(array);
    }
}
