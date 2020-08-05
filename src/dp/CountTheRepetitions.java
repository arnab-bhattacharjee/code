package dp;

public class CountTheRepetitions {

    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int s1_n = s1.length();
        int s2_n = s2.length();
        int count[] = new int[s2_n+1];
        int index[] = new int[s2_n+1];
        int idx = 0;
        int cnt = 0;

        for (int i=0; i<n1; i++) {
            for (int j=0; j<s1_n; j++) {
                if (s1.charAt(j) == s2.charAt(idx))
                    idx++;

                if (idx == s2_n) {
                    idx = 0;
                    cnt++;
                }
            }
            index[i] = idx;
            count[i] = cnt;

            for (int k=0; k<i; k++) {
                if (index[k] == index[i]) {
                    int prevCount = count[k];
                    int cycleCount = (count[i]-count[k])*((n1-1-k)/(i-k));
                    int remCount = count[k+(n1-1-k) % (i-k)]-count[k];
                    return (prevCount + cycleCount + remCount)/n2;
                }
            }
        }
        return count[n1-1]/n2;
    }
}
