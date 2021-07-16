import java.util.*;

public class AscDescArraySort {
    public static void main(String args[]) {
      int[] arr = {2, 5, 3, 1, 4};
      System.out.println("Original Array :: " + Arrays.toString(arr));
      
      int[] asa = getAscSortArray(arr);
      System.out.println("Array after Ascending sort :: " + Arrays.toString(asa));
      
      int[] dsa = getDescSortArray(arr);
      System.out.println("Array after Descending sort :: " + Arrays.toString(dsa));
    }
    
    public static int[] getAscSortArray(int[] a){
        int temp;
        
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<=a.length-1; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        return a;
    }
    
    public static int[] getDescSortArray(int[] a){
        int temp;
        
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<=a.length-1; j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        return a;
    }
}