public class CountOfVowelsAndConsonants {
    public static void main(String args[]) {
        String s = "This is a really simple sentence";

        int[] vcCount = getCountOfVowelsAndConsonants(s);
        System.out.println("Number of Vowels in '" + s + "' :: " + vcCount[0]);
        System.out.println("Number of Consonants in '" + s + "' :: " + vcCount[1]);
    }

    public static int[] getCountOfVowelsAndConsonants(String str){
        int vowel = 0;
        int consonant = 0;
        int[] result = new int[2];
        String lowerCaseStr = str.toLowerCase();

        for(int i=0; i<lowerCaseStr.length(); i++){
            if(str.charAt(i) != ' '){
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }

        result[0] = vowel;
        result[1] = consonant;

        return result;
    }
}