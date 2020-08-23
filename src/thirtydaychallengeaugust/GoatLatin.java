package thirtydaychallengeaugust;

import java.util.Set;

public class GoatLatin {

    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        int n = words.length;
        StringBuilder sb = new StringBuilder();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < n; i++) {
            String wordStr = words[i];
            char[] word = wordStr.toCharArray();
            if (vowels.contains(word[0])) {
                sb.append(wordStr);
                sb.append("ma");
            } else {
                sb.append(wordStr.substring(1, word.length));
                sb.append(word[0]);
            }

            for (int j = 0; j <= i; j++) {
                sb.append("a");
            }

            if (i != n - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
