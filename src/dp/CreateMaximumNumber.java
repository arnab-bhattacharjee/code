package dp;

import java.util.Arrays;

/**
 * DP[i][j][k] = max(n1[i].DP[i+1][j][k-1], n2[j].DP[i][j+1][k-1], DP[i+1][j][k], DP[i][j+1][k])
 * Memory optimization : optimized memory using the observation that maxNum(*,*,l) is determined from maxNum(*,*,l) and maxNum(*,*,l-1).
 * Time optimization1 : optimized the max function by passing l alongside to avoid unnecessary comparisons.
 * Time optimization2 : optimized the number of guesses by comparing the ith and jth values and pruning the one that is smaller.
 */
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
                    int[] n = null;
                    if (i + 1 <= nums1.length && j + 1 <= nums2.length) {
                        if (nums1[i] > nums2[j]) {
                            n = DP[(l - 1) % 2][i + 1][j].clone();
                            n[k - l] = nums1[i];
                        } else if (nums1[i] < nums2[j]) {
                            n = DP[(l - 1) % 2][i][j + 1].clone();
                            n[k - l] = nums2[j];
                        } else {
                            n = max(DP[(l - 1) % 2][i + 1][j], DP[(l - 1) % 2][i][j + 1], l - 1).clone();
                            n[k - l] = nums1[i];
                        }
                    } else if (i + 1 <= nums1.length) {
                        n = DP[(l - 1) % 2][i + 1][j].clone();
                        n[k - l] = nums1[i];
                    } else if (j + 1 <= nums2.length) {
                        n = DP[(l - 1) % 2][i][j + 1].clone();
                        n[k - l] = nums2[j];
                    }
                    DP[l % 2][i][j] = n;
                    if (i + 1 <= nums1.length)
                        DP[l % 2][i][j] = max(DP[l % 2][i][j], DP[l % 2][i + 1][j], l);
                    if (j + 1 <= nums2.length)
                        DP[l % 2][i][j] = max(DP[l % 2][i][j], DP[l % 2][i][j + 1], l);
                }
            }
        }

        return DP[k % 2][0][0];
    }

    private int[] max(int[] n1, int[] n2, int l) {
        if (n1 == null) return n2;
        if (n2 == null) return n1;
        for (int i = n1.length - l; i < n1.length; i++) {
            if (n1[i] > n2[i]) return n1;
            else if (n2[i] > n1[i]) return n2;
        }
        return n1;
    }
}
