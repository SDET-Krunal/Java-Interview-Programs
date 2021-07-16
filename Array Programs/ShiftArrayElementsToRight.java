import java.util.*;

public class ShiftArrayElementsToRight {
    public static void main(String args[]) {
      int[] a = {1, 2, 3, 4, 5};
      System.out.println("Original Array elements :: " + Arrays.toString(a));
      
      int[] result = shiftArrayElementsToRight(a, 3);
      System.out.println("Array elements after shifting :: " + Arrays.toString(result));
    }
    
    public static int[] shiftArrayElementsToRight(int[] arr, int index){
        int temp;

        for(int i=0; i<index; i++){
            temp = arr[0];

            for(int j=1; j<arr.length; j++){
                arr[j - 1] = arr[j];
            }

            arr[arr.length - 1] = temp;
        }

        return arr;
    }
}