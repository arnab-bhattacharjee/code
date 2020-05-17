package dp;

public class FindAllGoodStrings {

    int[][] goodStrings;
    int idx;
    String evil;

    public int findGoodStrings(int n, String s1, String s2, String evil) {
        goodStrings = new int[n][evil.length()];
        this.evil = evil;
        return findGoodStringsRec(n, s1, s2, 0);
    }

    private int findGoodStringsRec(int n, String s1, String s2, int idx) {
        if (n > s1.length())
            return 1;

        int val = 0;

        if (s1.charAt(n) == s2.charAt(n)) {
            if (s1.charAt(n) != evil.charAt(idx))
                val = findGoodStringsRec(n+1, s1, s2, idx);
        } else if (s1.charAt(n) < s2.charAt(n)) {
            if (s1.charAt(n) <= evil.charAt(idx) && s2.charAt(n) >= evil.charAt(idx)) {

                //val = (s2.charAt(n)-s1.charAt(n)-1) * findGoodStringsRec(n+1, );
            }
        }
        return 0;
    }
}
