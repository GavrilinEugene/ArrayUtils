/*
утилита для работы с массивами типа int
 */

public class ArrayUtils {

    public static int[] trim(int[] array, int newLength){
        if (newLength < 0)
            throw new IllegalArgumentException();

        if(array.length < newLength)
            return new int[0];

        int[] ret = new int[newLength];
        System.arraycopy(array, 0, ret, 0, newLength);
        return ret;
    }

    public static int[] resize(int[] array, int newLength){
        return new int[newLength];
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
