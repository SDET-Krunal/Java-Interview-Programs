public class NumberOfCharacterInSentense {
    public static void main(String args[]) {
        String s = "The best of both worlds";

        int ch = getNumberOfCharacters(s);
        System.out.println("Number of characters in '" + s + "' :: " + ch);
    }

    public static int getNumberOfCharacters(String str){
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }

        return count;
    }
}