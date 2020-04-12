package dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbersAtMostGivenNDigitSet {

    public int atMostNGivenDigitSet(String[] D, int N) {
        int numOfDigits = D.length;
        int[] digits = new int[numOfDigits];
        Set<Integer> s = new HashSet<>();
        for (int i=0; i<numOfDigits; i++){
            digits[i] = Integer.parseInt(D[i]);
            s.add(digits[i]);
        }

        List<Integer> digitsOfN = new ArrayList<>();
        for (int i=N+1; i>0 ; i=i/10) {
            digitsOfN.add(i%10);
        }

        int n = digitsOfN.size();
        int count = 0;
        // counts nums with digits < n
        for(int i=1; i<n ;i++) {
            count += Math.pow(numOfDigits, i);
        }

        for (int i=n-1; i>=0; i--) {
            if (i+1<n && !s.contains(digitsOfN.get(i+1))) break;
            for (int j=0; j<numOfDigits && digits[j]<digitsOfN.get(i); j++) {
                count += Math.pow(numOfDigits, i);
            }
        }
        return count;
    }
}
