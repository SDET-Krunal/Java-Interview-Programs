import java.util.*;

public class LargestValueFromArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4};
        System.out.println("Array Elements :: " + Arrays.toString(arr));

        int largestValue = getLargestValuefromArray(arr, 1);
        System.out.println("Largest value from Array :: " + largestValue);

        int secondLargestValue = getLargestValuefromArray(arr, 2);
        System.out.println("Second Largest value from Array :: " + secondLargestValue);

        int thirdLargestValue = getLargestValuefromArray(arr, 3);
        System.out.println("Third Largest value from Array :: " + thirdLargestValue);
    }

    public static int getLargestValuefromArray(int[] a, int index) {
        int temp;
        int aLength = a.length;

        for (int i = 0; i < aLength; i++) {
            for (int j = i + 1; j <= aLength - 1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a[aLength - index];
    }
}