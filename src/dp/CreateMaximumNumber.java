package dp;

import java.util.Arrays;

public class CreateMaximumNumber {

    private int[][][][] DP;

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        DP = new int[2][nums1.length + 1][nums2.length + 1][k];
        int[] zero = new int[k];
        for (int i = 0; i < k; i++)
            zero[i] = 0;
        DP[0][nums1.length][nums2.length] = zero;
        for (int l = 1; l <= k; l++) {
            for (int i = nums1.length; i >= 0; i--) {
                for (int j = nums2.length; j >= 0; j--) {
                    if (nums1.length - i + nums2.length - j < l) continue;
                    int[] n1 = null;
                    if (i + 1 <= nums1.length)
                        n1 = DP[(l - 1)%2][i + 1][j].clone();
                    int[] n2 = null;
                    if (j + 1 <= nums2.length)
                        n2 = DP[(l - 1)%2][i][j + 1].clone();
                    if (n1 != null) n1[k - l] = nums1[i];
                    if (n2 != null) n2[k - l] = nums2[j];
                    DP[l%2][i][j] = max(n1, n2);
                    if (i + 1 <= nums1.length)
                        DP[l%2][i][j] = max(DP[l%2][i][j], DP[l%2][i + 1][j]);
                    if (j + 1 <= nums2.length)
                        DP[l%2][i][j] = max(DP[l%2][i][j], DP[l%2][i][j + 1]);
                }
            }
        }

        return DP[k%2][0][0];
    }

    private int[] max(int[] n1, int[] n2) {
        if (n1 == null) return n2;
        if (n2 == null) return n1;
        for (int i=0; i<n1.length; i++) {
            if (n1[i]>n2[i]) return n1;
            else if (n2[i]>n1[i]) return n2;
        }
        return n1;
    }
}
