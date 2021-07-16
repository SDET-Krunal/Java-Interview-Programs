import java.util.*;

public class ShiftArrayElementsToLeft {
    public static void main(String args[]) {
      int[] a = {1, 2, 3, 4, 5};
      System.out.println("Original Array elements :: " + Arrays.toString(a));
      
      int[] result = shiftArrayElementsToLeft(a, 2);
      System.out.println("Array elements after shifting :: " + Arrays.toString(result));
    }
    
    public static int[] shiftArrayElementsToLeft(int[] arr, int index){
        int temp;

        for(int i=0; i<index; i++){
            temp = arr[arr.length - 1];

            for(int j=arr.length - 1; j>0; j--){
                arr[j] = arr[j - 1];
            }

            arr[0] = temp;
        }

        return arr;
    }
}