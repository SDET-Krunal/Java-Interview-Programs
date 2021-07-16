import java.util.*;

public class OddEvenArrayElements {
    public static void main(String args[]) {
      int[] a = {1, 3, 5, 7, 9, 11, 13};
      int al = a.length;
      System.out.println("Original Array elements :: " + Arrays.toString(a));
      
      int[] evenElements = getArrayOfEvenElements(a, al);
      System.out.println("Array of Even elements :: " + Arrays.toString(evenElements));
      
      int[] oddElements = getArrayOfOddElements(a, al);
      System.out.println("Array of Odd elements :: " + Arrays.toString(oddElements));
    }
    
    public static int[] getArrayOfEvenElements(int arr[], int al){
        int[] e = new int[(al+1)/2];
        
        for(int i=0; i<al; i++){
            if(i % 2 == 0){
                e[i/2] = arr[i];
            }
        }
        
        return e;
    }
    
    public static int[] getArrayOfOddElements(int arr[], int al){
        int[] o = new int[al/2];
        int count = 1;
        
        for(int i=0; i<al; i++){
            if(i % 2 != 0){
                o[i-count] = arr[i];
                count++;
            }
        }
        
        return o;
    }
}