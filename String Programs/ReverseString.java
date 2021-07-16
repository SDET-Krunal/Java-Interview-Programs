public class ReverseString {
    public static void main(String args[]) {
        String s = "Krunal";
        String rs = getReversedString(s);

        System.out.println("Original string :: " + s);
        System.out.println("Reversed string :: " + rs);
    }
    
    public static String getReversedString(String s){
        String reverse = "";
        
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        
        return reverse;
    }
}