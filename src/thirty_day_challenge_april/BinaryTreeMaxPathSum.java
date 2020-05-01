package thirty_day_challenge_april;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeMaxPathSum {

    private Map<TreeNode, Integer> left;
    private Map<TreeNode, Integer> right;

    public int maxPathSum(TreeNode root) {
        left = new HashMap<>();
        right = new HashMap<>();

        maxPathSumRec(root);
        int maxPathSum = Integer.MIN_VALUE;
        for (Map.Entry<TreeNode, Integer> e: left.entrySet()) {
            if (e.getKey() != null) {
                maxPathSum = Math.max(maxPathSum, left.get(e.getKey()) + right.get(e.getKey()) - e.getKey().val);
            }
        }
        return maxPathSum;
    }

    private void maxPathSumRec(TreeNode root) {
        if (left.containsKey(root)) return;

        if (root.left != null) {
            maxPathSumRec(root.left);
            int lMax = Math.max(root.val, Math.max(left.get(root.left), right.get(root.left)) + root.val);
            left.put(root, lMax);
        } else {
            left.put(root, root.val);
        }
        if (root.right != null) {
            maxPathSumRec(root.right);
            int rMax = Math.max(root.val, Math.max(left.get(root.right), right.get(root.right)) + root.val);
            right.put(root, rMax);
        } else {
            right.put(root, root.val);
        }
    }

}
