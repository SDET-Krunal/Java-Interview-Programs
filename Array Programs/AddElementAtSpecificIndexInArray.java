import java.util.Arrays;

public class AddElementAtSpecificIndexInArray {
    public static void main(String[] args) {
        int[] a = {3, 9, 5, 1, 7};
        System.out.println("Array Elements :: " + Arrays.toString(a));

        int[] ra = addElementAtSpecificIndexInArray(a, 11, 3);
        System.out.println("Array after adding new Element :: " + Arrays.toString(ra));
    }

    public static int[] addElementAtSpecificIndexInArray(int[] arr, int num, int index) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else if (i == index) {
                newArray[i] = num;
            } else {
                newArray[i] = arr[i - 1];
            }
        }

        return newArray;
    }
}
