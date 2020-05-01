package thirty_day_challenge_april;

import tree.TreeNode;

public class ValidSequence {

    public boolean isValidSequence(TreeNode root, int[] arr) {
        return isValidSequence(root, arr, 0);
    }

    private boolean isValidSequence(TreeNode root, int[] arr, int idx) {
        if (root.val != arr[idx] || idx >= arr.length)
            return false;
        if (root.val == arr[idx] && idx == arr.length-1 )
            if (root.left == null && root.right == null)
                return true;
            else
                return false;

        boolean res = false;
        if (root.left != null) {
            res |= isValidSequence(root.left, arr, idx+1);
        }

        if (root.right != null) {
            res |= isValidSequence(root.right, arr, idx+1);
        }
        return res;
    }
}
