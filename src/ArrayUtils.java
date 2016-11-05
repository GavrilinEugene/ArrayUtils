/*
утилита для работы с массивами типа int
 */

import java.util.Arrays;

public class ArrayUtils {

    public static int[] resize(int[] array, int newLength){
        if (array == null ||newLength < 0)
            throw new IllegalArgumentException();

        int[] ret = Arrays.copyOf(array, newLength);
        return ret;
    }

    public static int[] shuffle(int[] array){
        return new int[array.length];
    }

    public static boolean compareNoRegardToOrder(int[] first, int[] second){
        return false;
    }

    public static String print(int[] array){
        return array.toString();

    }

}
