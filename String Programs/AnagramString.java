import java.util.*;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "silent";  // e.g: Keep, MotherInLaw
        String s2 = "listen"; // e.g: Peek, HitlerWoman

        if (IsStringAnagram(s1, s2)) {
            System.out.println("Both strings " + s1 + " and " + s2 + " are Anagram.");
        } else {
            System.out.println("Both strings are not Anagram.");
        }
    }

    public static Boolean IsStringAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] as1 = s1.toLowerCase().toCharArray();
            char[] as2 = s2.toLowerCase().toCharArray();

            Arrays.sort(as1);
            Arrays.sort(as2);

            return Arrays.equals(as1, as2);
        }
    }
}
