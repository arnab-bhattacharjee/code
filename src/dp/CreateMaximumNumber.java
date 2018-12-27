package dp;

public class CreateMaximumNumber {

    private int[][][][] DP;

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        DP = new int[nums1.length+1][nums2.length+1][k+1][k];
        int[] zero = new int[k];
        for (int i=0; i<k; i++)
            zero[i] = 0;
        DP[nums1.length][nums2.length][0] = zero;
        for (int i=nums1.length-1; i>=0; i--) {
            for (int j=nums2.length; j>=0; j--) {
                for (int l=0; l<k; l++) {
                    int[] n1 = DP[i+1][j][l-1].clone();
                    int[] n2 = DP[i][j+1][l-1].clone();
                    n1[k-l-1] = nums1[i];
                    n2[k-l-1] = nums2[j];
                    DP[i][j][l] = max(n1, n2);
                    DP[i][j][l] = max(DP[i][j][l], DP[i+1][j+1][l]);
                }
            }
        }
        return DP[0][0][k];
    }

    private int[] max(int[] n1, int[] n2) {

    }
}
