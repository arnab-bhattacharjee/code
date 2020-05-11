package dp;

public class SuperWashingMachines {

    public int findMinMoves(int[] machines) {
        int n = machines.length;

        if (n == 1) return 0;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] delta = new int[n];

        int sum = machines[0];
        for (int i=1; i<n; i++)
            sum += machines[i];

        if (sum % n != 0) return -1;

        int avg = sum/n;

        l[0] = 0;
        r[n-1] = 0;

        for (int i=0; i<n; i++) {
            delta[i] = avg-machines[i];
        }

        for (int i=1; i<n; i++) {
            l[i] = l[i-1] + delta[i-1];
            r[n-1-i] = r[n-i] + delta[n-i];
        }

        int minMoves = 0;
        for (int i=0; i<n; i++) {
            minMoves = Math.max(minMoves, ((l[i]>0) ? l[i] : 0) + ((r[i] > 0) ? r[i] : 0));
        }

        return minMoves;
    }
}
