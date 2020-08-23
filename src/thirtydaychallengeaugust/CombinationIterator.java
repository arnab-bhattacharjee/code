package thirtydaychallengeaugust;

public class CombinationIterator {
    private char[] letters;
    private int n;
    private boolean[] marked;

    public CombinationIterator(String characters, int combinationLength) {
        this.letters = characters.toCharArray();
        this.n = combinationLength;
    }

    public String next() {
        if (marked == null) {
            marked = new boolean[letters.length];
            for (int i=0; i<n; i++) {
                marked[i] = true;
            }
        } else {
            int i=letters.length-1;
            int count = 0;
            while (marked[i]) {
                count++; i--;
            }
            while(!marked[i]) {
                i--;
            }
            count++;
            marked[i] = false;
            for (int j=1; j<=count; j++) {
                i++;
                marked[i] = true;
            }
            for (int j=i+1; j<letters.length; j++) {
                marked[j] = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<letters.length; i++) {
            if (marked[i])
                sb.append(letters[i]);
        }
        return sb.toString();
    }

    public boolean hasNext() {
        for (int i=0; i<n; i++) {
            if (!marked[letters.length-1-i])
                return true;
        }
        return false;
    }
}
