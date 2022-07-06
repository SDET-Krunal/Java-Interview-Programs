public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "Automation Testing";
        StringBuilder reverse = new StringBuilder();

        for (String str : s.split(" ")) {
            String reverse_word = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse.append(str.charAt(i));
            }

            reverse.append(reverse_word).append(" ");
        }

        System.out.println(reverse);
    }
}
