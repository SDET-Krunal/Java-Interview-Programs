import java.util.*;

public class MaxMinValueFromArray {
    public static void main(String args[]) {
      int[] arr = {2, 5, 3, 1, 4};
      System.out.println("Array Elements :: " + Arrays.toString(arr));
      
      int maxValue = getMaxValueFromArray(arr);
      System.out.println("Maximum value from Array :: " + maxValue);
      
      int minValue = getMinValueFromArray(arr);
      System.out.println("Minimum value from Array :: " + minValue);
    }
    
    public static int getMaxValueFromArray(int[] a){
        int max = a[0];
        
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        
        return max;
    }
    
    public static int getMinValueFromArray(int[] a){
        int min = a[0];
        
        for(int i=0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        
        return min;
    }
}