import java.util.*;

public class DuplicateArrayElements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4, 2, 1, 3};
        System.out.println("Array Elements :: " + Arrays.toString(arr));

        int[] duplicateElements = getDuplicateElementsFromArray(arr);
        System.out.println("Duplicate elements from Array :: " + Arrays.toString(duplicateElements));
    }

    public static int[] getDuplicateElementsFromArray(int[] a) {
        List<Integer> al = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] == a[j]) {
                    al.add(a[i]);
                }
            }
        }

        int[] arr = new int[al.size()];

        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }

        return arr;
    }
}