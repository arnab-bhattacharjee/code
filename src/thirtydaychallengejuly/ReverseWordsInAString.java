package thirtydaychallengejuly;

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=words.length-1; i>0; i--) {
            if (words[i] != "")
                sb.append(words[i] + " ");
        }
        sb.append(words[0]);
        return sb.toString();
    }
}
