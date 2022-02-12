public class ReverseWordsInString
{
	public static void main(String[] args) {
	    	String s = "Automation Testing";
		String reverse = "";

		for(String str: s.split(" ")){
		    String reverse_word = "";

			for(int i=str.length()-1; i>=0; i--){
				reverse+=str.charAt(i);
			}

			reverse = reverse + reverse_word + " ";
		}

		System.out.println(reverse);
	}
}
