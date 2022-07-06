import java.util.*;

public class DeleteElementAtSpecificIndexFromArray {
    public static void main(String[] args) {
        int[] a = {3, 9, 5, 1, 7};
        int elementToDelete = 1;
        System.out.println("Array Elements :: " + Arrays.toString(a));

        int[] ra = deleteElementAtSpecificIndexInArray(a, 3);
        System.out.println("Array after deleting Element '" + elementToDelete + "' :: " + Arrays.toString(ra));
    }

    public static int[] deleteElementAtSpecificIndexInArray(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else {
                newArray[i] = arr[i + 1];
            }
        }

        return newArray;
    }
}