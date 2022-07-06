import java.util.ArrayList;
import java.util.Arrays;

public class ArrayElementsWithSumZero {
    public static void main(String[] args) {
        int[] a = {2, -5, -4, 0, 6, -2, 8, -3, 4};
        // int[] a = {-5, -4, -3, -2, 0, 2, 4, 6, 8};

        Arrays.sort(a);
        ArrayList<Integer> op = new ArrayList<>();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[i] + a[j] == 0) {
                    op.add(a[i]);
                    op.add(a[j]);
                }
            }
        }

        System.out.println(op);
    }
}