import java.io.*;
import java.util.*;

public class CharacterOccurrenceInString
{
	public static void main(String[] args) {
	    String s = "tested";
        char[] ch = s.toCharArray();
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(char c: ch){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c) + 1);
            }
            else{
                hm.put(c, 1);
            }
        }
        
        for (Map.Entry entry : hm.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
	}
}
