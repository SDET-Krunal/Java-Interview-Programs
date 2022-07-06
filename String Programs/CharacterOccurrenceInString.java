import java.io.*;
import java.util.*;

public class CharacterOccurrenceInString {
    public static void main(String[] args) {
        String s = "tested";
        char[] ch = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : ch) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }

        hm.forEach((key, value) -> System.out.print(key + "" + value));
    }
}
