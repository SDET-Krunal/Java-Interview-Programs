public class OddEvenNumbersFromArray {
    public static void main(String args[]) {
        int[] a = {2, 1, 4, 3, 6, 5};
        
        getOddNumbersFromArray(a);
        System.out.println();
        getEvenNumbersFromArray(a);
    }
    
    public static void getOddNumbersFromArray(int[] arr){
        System.out.println("Odd Numbers from Array :: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + "\t");
            }
        }
    }
    
    public static void getEvenNumbersFromArray(int[] arr){
        System.out.println("Even Numbers from Array :: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + "\t");
            }
        }
    }
}