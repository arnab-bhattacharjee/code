package string;

public class ZFunction {

    public int[] calculate(String s) {
        int n = s.length();
        int[] z = new int[n];

        int l=0, r=0;
        for (int i=1; i<n; i++) {
            if (i <= r)
                z[i] = Math.min(z[i-l], r-i+1);
            while (i+z[i] < n && s.charAt(z[i]) == s.charAt(i+z[i])) {
                z[i]++;
            }
            if (i+z[i]-1 > r) {
                l = i;
                r = i+z[i]-1;
            }
        }
        return z;
    }
}
