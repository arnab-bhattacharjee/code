package dp;

import helper.TreeNode;

import java.util.HashMap;

public class BinaryTreeCameras {

    HashMap<TreeNode, Integer> dp = new HashMap<>();

    public int minCameraCover(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (dp.containsKey(root)) return dp.get(root);

        // include camera at root
        int minWithRoot = 1;
        if (root.left != null)
            minWithRoot += Math.min(minCameraCover(root.left.left) + minCameraCover(root.left.right), minCameraCover(root.left));
        if (root.right != null)
            minWithRoot += Math.min(minCameraCover(root.right.left) + minCameraCover(root.right.right), minCameraCover(root.right));

        // not include camera at root

        // if including camera in left child
        Integer minWithoutRootLeft = null;
        if (root.left != null)
            minWithoutRootLeft = 1 + ((root.left.left != null) ? Math.min(minCameraCover(root.left.left.left) + minCameraCover(root.left.left.right), minCameraCover(root.left.left)): 0)
                    + ((root.left.right != null) ? Math.min(minCameraCover(root.left.right.left) + minCameraCover(root.left.right.right), minCameraCover(root.left.right)):0)
                    + minCameraCover(root.right);

        // if include camera in right child
        Integer minWithoutRootRight = null;
        if (root.right != null)
            minWithoutRootRight = 1 + ((root.right.left != null) ? Math.min(minCameraCover(root.right.left.left) + minCameraCover(root.right.left.right), minCameraCover(root.right.left)) : 0)
                    + ((root.right.right != null) ? Math.min(minCameraCover(root.right.right.left) + minCameraCover(root.right.right.right), minCameraCover(root.right.right)):0)
                    + minCameraCover(root.left);

        int min = Math.min(minWithoutRootLeft == null ? Integer.MAX_VALUE : minWithoutRootLeft
                , minWithoutRootRight == null ? Integer.MAX_VALUE : minWithoutRootRight);
        min = Math.min(minWithRoot, min);

        dp.put(root, min);
        return min;
    }

}
