/*
утилита для работы с массивами типа int
 */

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayUtils {

    public static int[] resize(int[] array, int newLength){
        if (array == null ||newLength < 0)
            throw new IllegalArgumentException();

        int[] ret = Arrays.copyOf(array, newLength);
        return ret;
    }

    public static int[] shuffle(int[] array){
        if (array == null)
            throw new IllegalArgumentException();

        int[] ret = new int[array.length];
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            swap(array[index], array[i]);
        }
        System.arraycopy(array, 0, ret, 0, array.length);
        return ret;
    }

    private static void swap(int firstElement, int secondElement){
        int swapElement = firstElement;
        firstElement = secondElement;
        secondElement = swapElement;
    }

    public static boolean compareNoRegardToOrder(int[] first, int[] second){
        if (first == null || second == null)
            throw new IllegalArgumentException();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }

    public static String convertToString(int[] array){
        return Arrays.toString(array);

    }
}