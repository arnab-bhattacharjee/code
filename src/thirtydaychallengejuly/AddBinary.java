package thirtydaychallengejuly;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();

        int aN = a.length();
        int bN = b.length();

        int n = Math.max(aN, bN);
        int carry = 0;
        for (int i=0; i<n; i++) {
            int ath=0;
            if (aN-1-i >= 0)
                ath = a.charAt(aN-1-i);

            int bth = 0;
            if (bN-1-i >= 0)
                bth = b.charAt(bN-1-i);

            int lSum = ath + bth + carry;

            if (lSum > 1) {
                carry = 1;
                lSum = lSum & 1;
            } else
                carry = 0;

            sum.insert(0, lSum);
        }
        if (carry == 1)
            sum.insert(0, carry);

        return sum.toString();
    }
}
