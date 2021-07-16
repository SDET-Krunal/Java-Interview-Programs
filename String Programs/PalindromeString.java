public class PalindromeString {
    public static void main(String args[]) {
        String s = "Anna"; // e.g: Malayalam, Anna, Radar, Civic, Noon, Madam, Mom, Refer, Rotator, Wow, etc...

        if(isPalindromeString(s.toLowerCase())){
            System.out.println("'" + s + "' is Palindrome string.");
        }
        else{
            System.out.println("'" + s + "' is not Palindrome string.");
        }
    }

    public static boolean isPalindromeString(String str){
        for(int i=0; i<str.length()/2 - 1; i++){
            if(str.charAt(i) == str.charAt(str.length() - i - 1)){
                continue;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}