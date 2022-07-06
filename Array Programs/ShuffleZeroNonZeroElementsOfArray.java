import java.util.*;

public class ShuffleZeroNonZeroElementsOfArray {
    public static void main(String[] args) {
        int[] a = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        System.out.println("Array Elements :: " + Arrays.toString(a));

        int[] ra1 = moveNonZeroElementsAtRight1(a);
        System.out.println("Array Elements after shuffling by method 1:: " + Arrays.toString(ra1));

        int[] ra2 = moveNonZeroElementsAtRight2(a);
        System.out.println("Array Elements after shuffling by method 2:: " + Arrays.toString(ra2));
    }

    public static int[] moveNonZeroElementsAtRight1(int[] arr) {
        int[] newArray = new int[arr.length];
        int count = 0;

        for (int j : arr) {
            if (j == 0) {
                count++;
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            if (i < count) {
                newArray[i] = 0;
            } else {
                newArray[i] = 1;
            }
        }

        return newArray;
    }

    public static int[] moveNonZeroElementsAtRight2(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }

        return arr;
    }
}