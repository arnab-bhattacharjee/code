package thirty_day_challenge_may;

import tree.TreeNode;

public class KthSmallesElemInBST {

    private int visited = 0;
    public int kthSmallest(TreeNode root, int k) {
        return inorder(root, k);
    }

    private Integer inorder(TreeNode root, int k) {
        if (root == null)
            return null;
        Integer kth = inorder(root.left, k);
        visited ++;
        if (kth == null && visited == k)
            return root.val;
        else if (kth != null) return kth;
        return inorder(root.right, k);
    }
}
