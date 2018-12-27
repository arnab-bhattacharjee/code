package dp;

public class SuperEggDrop {

    private Integer DP[][];

    public int superEggDrop(int K, int N) { // K - eggs, N - floors
        DP = new Integer[N+1][K+1];
        for (int i=0; i<=N; i++) {
            DP[i][0] = N+1;
        }
        for (int i=0; i<=K; i++) {
            DP[0][i] = 0;
        }

        for (int i=1; i<=K; i++) { // eggs
            for (int j=1; j<=N; j++) { // floors
                DP[j][i] = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int k=1; k<=j; k++) { // drop floor
                    if (k == 1) max = DP[j-k][i];
                    else if (k == j) max = DP[k-1][i-1];
                    else max = Math.max(DP[k-1][i-1], DP[j-k][i]);
                    DP[j][i] = Math.min(max+1, DP[j][i]);
                }
            }
        }
        return DP[N][K];
    }

    public void print() {
        for (int i=0; i<DP.length; i++) {
            for (int j=0; j<DP[0].length; j++) {
                System.out.print(DP[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
