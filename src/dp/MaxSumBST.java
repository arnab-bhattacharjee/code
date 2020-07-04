package dp;

import tree.TreeNode;

public class MaxSumBST {
    private int max = Integer.MIN_VALUE;
    public static final int _oo = Integer.MIN_VALUE;
    public static final int oo = Integer.MAX_VALUE;

    public static class State {
        int sum;
        boolean bst;
        int lb;
        int ub;

        public State(int sum, boolean bst, int lb, int ub) {
            this.sum = sum;
            this.bst = bst;
            this.lb = lb;
            this.ub = ub;
        }
    }

    public int maxSumBST(TreeNode root) {
        maxSumBstRec(root);
        return (max > 0) ? max : 0;
    }

    private State maxSumBstRec(TreeNode root) {
        if (root == null)
            return new State(0, true, oo, _oo);

        State l = maxSumBstRec(root.left);
        State r = maxSumBstRec(root.right);

        int bstSum = Integer.MIN_VALUE;
        boolean bst = false;
        if (l.bst && r.bst && root.val>l.ub && root.val<r.lb) {
            bstSum = root.val + l.sum + r.sum;
            bst = true;
            max = Math.max(max, bstSum);
        }

        return new State(bstSum, bst, Math.min(l.lb, root.val), Math.max(r.ub, root.val));
    }
}
