import java.util.*;

public class ReverseOrderArrayElements {
    public static void main(String args[]) {
      int[] a = {1, 3, 5, 7, 9, 11};
      System.out.println("Original Array elements :: " + Arrays.toString(a));

      int[] reverseElements = getReverseOrderArrayElements(a, a.length);
      System.out.println("Array of Reverse order elements :: " + Arrays.toString(reverseElements));
    }

    public static int[] getReverseOrderArrayElements(int arr[], int al){
        int temp;
        
        for(int i=0; i<al/2; i++){
            temp = arr[i];
            arr[i] = arr[al-1-i];
            arr[al-1-i] = temp;
        }
        
        return arr;
    }
}