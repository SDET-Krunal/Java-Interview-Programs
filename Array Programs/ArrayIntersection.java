import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 3, 1, 4};
        int[] arr2 = {3, 9, 5, 7, 1};

        System.out.println("First Array Elements :: " + Arrays.toString(arr1));
        System.out.println("Second Array Elements :: " + Arrays.toString(arr2));

        int[] intersectArray = getInterSectionFromArrays(arr1, arr2);
        System.out.println("Intersection Array from above two Arrays :: " + Arrays.toString(intersectArray));
    }

    public static int[] getInterSectionFromArrays(int[] a1, int[] a2) {
        List<Integer> al = new ArrayList<>();

        for (int k : a1) {
            for (int i : a2) {
                if (k == i) {
                    al.add(k);
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