package recursion;

public class PartitionInteger {

    public void partition(int n) {
        int[] s = new int[n];
        partition(n,n,s,0);
    }

    private void partition(int n, int l, int[] s, int idx) {
        if (l <= 0)
            return;
        if (n == 0) {
            for (int i=0; i<idx; i++)
                System.out.print(s[i] + "\t");
            System.out.println();
            return;
        }

        if (n-l >= 0) {
            s[idx] = l;
            partition(n - l, l, s, idx+1);
        }

        partition(n, l-1, s, idx);
    }
}
