package thirty_day_challenge_april;

public class PerformStringShift {

    public String stringShift(String s, int[][] shift) {
        if (s.length() < 2) return s;
        int leftShift = 0;
        int rightShift = 0;
        int l = s.length();
        for (int i=0; i<shift.length; i++) {
            if (shift[i][0] == 0)
                leftShift += shift[i][1];
            else
                rightShift += shift[i][1];
        }
        leftShift = leftShift%l;
        rightShift = rightShift%l;

        // transforming left shifts to equivalent right shifts by taking inverses
        rightShift += (l-leftShift);
        rightShift %= l;
        char[] c = s.toCharArray();
        char[] t = new char[s.length()];
        for (int i=0; i<l; i++) {
            t[(i+rightShift)%l] = c[i];
        }
        return new String(t);
    }
}
